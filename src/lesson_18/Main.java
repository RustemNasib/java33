package lesson_18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
/**
 *  Блок теории 1
 *  Коллекция - это массив с неограниченным размером и хранящий любые типы данных, но одного типа в одной коллекции
 *  До версии JDK 1.5 все коллекции были подчинены Object, и поэтому одна коллекция могла хранить разные типы
 *  данных, но не могла иметь разные методы свойственные типам и поэтому после от этого отказались и все коллекции
 *  стали содержать только один тип.
 *
 *       Интерфейсы коллекций: Collection и Map (находятся на одном уровне, т.е. друг с другом не связаны)
 *                             Collection - группы объектов;
 *                             Map - массив объектов по ассоциациям;
 *
 *                                      (Interface)
 *                                        Iterable (повторяемый или перебираемый) содержит Iterator<T> iterator();
 *                                           |
 *                                      (Interface)
 *               __________________java.util.Collection _________________________
 *              |                                                               |
 *          (Interface)                                                     (Interface)
 *      java.util.Set (Сумка)                                             java.util.List (Записная книжка)
 *      - Все значения уникальны;                                          - Могут хранится дубликаты значений;
 *      - Нет индексов;                                                    - Индексы есть;
 *      - Нет порядка вхождения;                                           - Есть порядок вхождения;
 *                  |                                                                        |
 *     _____________|_______________                                         ________________|___________________
 *     |                           |                                         |                                  |
 * (Interface)                HashSet                                   ArrayList                         LinkedList
 * SortedSet                - Элементы не упорядочены                 (ас.пронумерованный список)       (ас.живая очередь)
 *     |                    - Может хранить NULL – значения          - Добавление долго              - Добавление быстрое
 * (Interface)              - Порядок задает HashCode                - Удаление долго                - Удаление быстрое
 * NavigableSet                            |                         - Читать быстро                 - Читать дольше
 *     |                                   |                        ___________________              ___________________
 *     |                                   |                         - Добавление редкое;            - Добавление частое;
 *     |                                   |                         - Удаление редкое;              - Удаление частое;
 *     |                                   |                         - Чтение частое;                - Чтение условно редкое;
 *     |                                   |
 *  TreeSet                          LinkedHashSet
 * (дерево значений)                  - Есть порядок вхождения
 * (двоичное  дерево)
 * (не просто двоичное дерево)
 * (меньше на лево, больше на право)
 * (сортировка - компарабл метод компероту)
 */
/**
 * Класс HashSet
 * реализует интерфейс Set, основан на хэш-таблице, а также поддерживается с помощью экземпляра HashMap.
 * В HashSet элементы не упорядочены, нет никаких гарантий, что элементы будут в том же порядке спустя
 * какое-то время. Операции добавления, удаления и поиска будут выполняться за константное время при условии,
 * что хэш-функция правильно распределяет элементы по «корзинам»
 *
 * Коэффициент загрузки – показатель того, насколько заполненным может быть HashSet до того момента, когда
 * его емкость автоматически увеличится. Когда количество элементов в HashSet становится больше,
 * чем произведение начальной емкости и коэффициента загрузки, хэш-таблица ре-хэшируется (заново вычисляются
 * хэшкоды элементов, и таблица перестраивается согласно полученным значениям) и количество ячеек в ней
 * увеличивается в 2 раза.
 *
 * Например, если изначальное количество ячеек в таблице равно 16, и коэффициент загрузки равен 0,75, то из
 * этого следует, что когда количество заполненных ячеек достигнет 12, их количество автоматически увеличится.
 *
 * Коэффициент загрузки и начальная емкость – два главных фактора, от которых зависит производительность
 * операций с HashSet. Коэффициент загрузки, равный 0,75, в среднем обеспечивает хорошую производительность.
 * Если этот параметр увеличить, тогда уменьшится нагрузка на память (так как это уменьшит количество операций
 * ре-хэширования и перестраивания), но это повлияет на операции добавления и поиска. Чтобы минимизировать
 * время, затрачиваемое на ре-хэширование, нужно правильно подобрать параметр начальной емкости. Если начальная
 * емкость больше, чем максимальное количество элементов, поделенное на коэффициент загрузки, то никакой
 * операции ре-хэширования не произойдет в принципе.
 *
 * Конструкторы HashSet:
 * HashSet h = new HashSet(); — конструктор по умолчанию. Начальная емкость по умолчанию – 16, коэффициент загрузки – 0,75.
 * HashSet h = new HashSet(int initialCapacity) – конструктор с заданной начальной емкостью. Коэффициент загрузки – 0,75.
 * HashSet h = new HashSet(int initialCapacity, float loadFactor); — конструктор с заданными начальной емкостью и коэффициентом загрузки.
 * HashSet h = new HashSet(Collection C) – конструктор, добавляющий элементы из другой коллекции.
 */
        int values = 1000000;
        HashSet<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(3);
        integers.add(3);//дублируемые не будет класть
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);

        System.out.println(integers);

// метод add() всех элементов
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < values; i++) {
            integers.add(i * i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Метод add() все элементы HashSet: " + (end1 - start1));

        // метод add() один элемент
        long start2 = System.currentTimeMillis();
        integers.add(555);
        long end2 = System.currentTimeMillis();
        System.out.println("метод add() один элемент: " + (end2 - start2));

// метод contains () по значению
        long start3 = System.currentTimeMillis();
        integers.contains(555);
        long end3 = System.currentTimeMillis();
        System.out.println("метод contains () по значению HashSet: " + (end3 - start3));

        // метод remove () по значению
        long start4 = System.currentTimeMillis();
        integers.remove(555);
        long end4 = System.currentTimeMillis();
        System.out.println("метод remove () по значению HashSet: " + (end4 - start4));

        // метод clear () по всей коллекции
        long start5 = System.currentTimeMillis();
        integers.clear();
        long end5 = System.currentTimeMillis();
        System.out.println("метод clear () по значению HashSet: " + (end5 - start5));

        //=======================================================
        System.out.println("______Проблемы метода remove(i)______");
        ArrayList<Integer> numbersArrayList = new ArrayList<>();
        numbersArrayList.add(1);
        numbersArrayList.add(2);
        numbersArrayList.add(3);
        numbersArrayList.add(4);
        numbersArrayList.add(5);
        numbersArrayList.add(6);
        numbersArrayList.add(7);
        System.out.println("Метод remove() в коллекции ArrayList: ");
        for (int i = 0; i < numbersArrayList.size(); i++) {
            numbersArrayList.remove(i);
        }
        System.out.println(numbersArrayList);//[2,4,6]

        LinkedList<Integer> numbersLinkedList = new LinkedList<>();
        numbersLinkedList.add(1);
        numbersLinkedList.add(2);
        numbersLinkedList.add(3);
        numbersLinkedList.add(4);
        numbersLinkedList.add(5);
        numbersLinkedList.add(6);
        numbersLinkedList.add(7);
        System.out.println("Метод remove() в коллекции LinkedList: ");
        for (int i = 0; i < numbersLinkedList.size(); i++) {
            numbersLinkedList.remove(i);
        }
        System.out.println(numbersLinkedList);//[2,4,6]

        HashSet<Integer> numbersHashSet = new HashSet<>();
        numbersHashSet.add(1);
        numbersHashSet.add(2);
        numbersHashSet.add(3);
        numbersHashSet.add(4);
        numbersHashSet.add(5);
        numbersHashSet.add(6);
        numbersHashSet.add(7);
        System.out.println("Метод remove() в коллекции HashSet: ");
        for (int i = 0; i < numbersHashSet.size(); i++) {
            numbersHashSet.remove(i);
        }
        System.out.println(numbersHashSet);//[4,5,6,7]
//=========================================================================
        System.out.println("Прохождение коллекции ArrayList с помощью итератора");

/**
 * Iterator (пер. Переборщик) - если по-простому, то это метод, с помощью которого получается следующий элемент
 * коллекции, некое правило обхода элементов коллекции.
 *
 * Формально интерфейс Iterator содержит 3 метода:
 *                  - hasNext() - проверяет, есть ли следующий элемент;
 *                  - next() - возвращает следующий элемент;
 *                  - remove() - удаляет текущий элемент.
 *
 * Пример: допустим, в классе 20 детей. Преподавателю надо всех по одному вызвать к доске. Есть, грубо, 2 способа:
 *                  - Вызывать по алфавиту - как указаны в классном журнале.
 *                  - Вызывать по порядку, как они сидят.
 *
 * В терминах Java это разные итераторы: первый итератор - по классному журналу, второй итератор - по местам
 * на партах. Можно придумать и более хитрые итераторы - например, по дате рождения, по желанию и проч.
 *
 * Поскольку Iterator это интерфейс, то реализация итератора привязана к конкретной коллекции. В самом
 * итераторе не хранятся элементы коллекции, он просто их оттуда достаёт и отдаёт вам.
 * Это как посредник между вашим кодом и данными в коллекции.
 *
 */


        for (Iterator<Integer> iter = numbersArrayList.iterator(); iter.hasNext(); ) {
            System.out.print(iter.next()+"; "); // 2;4;6
        }

        System.out.println("Прохождение коллекции HashSet с помощью итератора");
        for (Iterator<Integer> iter = numbersHashSet.iterator(); iter.hasNext(); ) {
            System.out.print(iter.next()+"; "); // 4;5;6;7
        }
    }
}
// изучить самостоятельно iterable, iterator,
// коллекции HashSet, SortedSet, LinkedHashSet // SortedList, ArrayList, LinkedList // HashMap, SortedMap, LinkedHashMap