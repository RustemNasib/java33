package lesson_16;

import java.util.ArrayList;

public class Main_Collection {
    public static void main(String[] args) {
        /**
         *  Блок теории 1
         *  Коллекция - это массив с неограниченным размером и различными типами данных,
         *  кроме ArrayList там один тип данных.
         *       Если несколько вариантов коллекций:
         *       Интерфейсы коллекций: Collection и Map
         *       Рассмотрим ветку: Collection
         *
         *                   ______________java.util.Collection_______________
         *      java.util.Set                                             java.util.List
         *      - Все значения уникальны;                                - Могут хранится дубликаты значений;
         *      - Нет индексов;                                          - Индексы есть;
         *      - Нет порядка вхождения;                                 - Есть порядок вхождения;
         */
        /**
         * Блок теории 2
         *     _______java.util.Set________                                _________java.util.List___________
         * SortedSet                    HashSet                         ArrayList                         LinkedList
         *  (интерфейс)             - Нет порядок вхождения       (ас.пронумерованный список)       (ас.живая очередь)
         *                          -(под капотом hashmap)         - Добавление долго              - Добавление быстрое
         *                          - ключ - наш объект            - Удаление долго                - Удаление быстрое
         *                                                         - Читать быстро                 - Читать дольше
         *                                                        ___________________              ___________________
         *                                                         - Добавление редкое;            - Добавление частое;
         *                                                         - Удаление редкое;              - Удаление частое;
         *                                                         - Чтение частое;                - Чтение условно редкое;
         *
         * TreeSet                            LinkedHashSet
         * (дерево значений)                  - Есть порядок вхождения
         * (двоичное самобалансирующее дерево)
         * (не просто двоичное дерево)
         * (меньше на лево, больше на право)
         * (сортировка - компарабл метод компероту)
         *
         *
         */

        // -------------- ArrayList----------------
        ArrayList<String> str = new ArrayList<>(10);
        // Хочу тест скорости сделать
        TestSpeed testSpeed = new TestSpeed();
        System.out.println("10,1000000 add()= " + testSpeed.getIntegerTimeArrayList(10, 1000000) + "mc"); // вместимость задаем 10 и кладем 1000 значений
        System.out.println("100,1000000 add()= " + testSpeed.getIntegerTimeArrayList(100, 1000000) + "mc"); // вместимость задаем 100 и кладем 1000 значений
        System.out.println("1000,1000000 add()= " + testSpeed.getIntegerTimeArrayList(1000, 1000000) + "mc"); // вместимость задаем 10 и кладем 1000 значений
        System.out.println("10000,1000000 add()= " + testSpeed.getIntegerTimeArrayList(10000, 1000000) + "mc"); // вместимость задаем 10 и кладем 1000 значений
        System.out.println("100000,1000000 add()= " + testSpeed.getIntegerTimeArrayList(100000, 1000000) + "mc"); // вместимость задаем 10 и кладем 1000 значений
        System.out.println("1000000,1000000 add()= " + testSpeed.getIntegerTimeArrayList(1000000, 1000000) + "mc"); // вместимость задаем 10 и кладем 1000 значений
        System.out.println("10000000,1000000 add()= " + testSpeed.getIntegerTimeArrayList(10000000, 1000000) + "mc"); // вместимость задаем 10 и кладем 1000 значений
        System.out.println();


        System.out.println("Замер add() один элемент ArrayList");
        int volumes = 10000000, num = 0;
        ArrayList<Integer> inter2 = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < volumes; i++) {
            inter2.add(i + num);
            num++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList inter2 размером " + volumes + " наполнен за: " + (endTime - startTime) + " mc");

        System.out.println("\nСкорость добавления add() один элемент в середину ArrayList");
        long startTime2 = System.currentTimeMillis();
        inter2.add(volumes / 2, 555);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Один элемент в середину массива размером " + volumes + " добавлен за: " + (endTime2 - startTime2) + " mc");

        System.out.println("\nСкорость set() один элемент в середину ArrayList");
        long startTime3 = System.currentTimeMillis();
        inter2.set(volumes/2, 555);
        long endTime3 = System.currentTimeMillis();
        System.out.println("метод Set в середину массива размером " + volumes + " установлен за: " + (endTime3 - startTime3) + " mc");

        System.out.println("\nСкорость get() по индексу ArrayList");
        long startTime4 = System.currentTimeMillis();
        inter2.get(volumes/2);
        long endTime4 = System.currentTimeMillis();
        System.out.println("Скорость get() по индексу ArrayList размером " + volumes + " установлен за: " + (endTime4 - startTime4) + " mc");

        System.out.println("\nСкорость contains() по значению ArrayList");
        long startTime5 = System.currentTimeMillis();
        inter2.contains(555);
        long endTime5 = System.currentTimeMillis();
        System.out.println("Скорость contains() по значению ArrayList размером " + volumes + " установлен за: " + (endTime5 - startTime5) + " mc");

        System.out.println("\nСкорость remove() по значению ArrayList");
        long startTime6 = System.currentTimeMillis();
        inter2.remove("555");
        long endTime6 = System.currentTimeMillis();
        System.out.println("Скорость remove() по значению ArrayList размером " + volumes + " установлен за: " + (endTime6 - startTime6) + " mc");

        System.out.println("\nСкорость clear() по значению ArrayList");
        long startTime7 = System.currentTimeMillis();
        inter2.clear();
        long endTime7 = System.currentTimeMillis();
        System.out.println("Скорость clear() по значению ArrayList размером " + volumes + " установлен за: " + (endTime7 - startTime7) + " mc");

    }
}
