package lesson_17;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * LinkedList<> - это безразмерная коллекция, реализация двусвязного списка интерфейса List.
         * Изменяет размер за счет добавление новых связей, может включать в себя элементы только типа.
         * Элементы фактически представляют собой звенья одной цепи. У каждого элемента помимо тех данных,
         * которые он хранит, имеется ссылка на предыдущий и следующий элемент. По этим ссылкам можно переходить
         * от одного элемента к другому.
         * ArrayList (по большому счету) сводится к работе с внутренним массивом
         * Вся работа с LinkedList сводится к изменению ссылок.
         * Методы ArrayList и LinkedList одинаковы, но внутри работают по разному.
         * Так же у LinkedList есть свои уникальные методы
         *      //peekFirst(), peekLast(): возвращают первый/последний элемент списка. Возвращают null, если список пуст.
         *      //addFirst(), addLast(): методы LinkedList для добавления элемента в начало/конец списка
         */
        /**
         * Тестирование методов
         * Метод add() всех элементов LinkedList по очереди:
         * Метод add() всех элементов ArrayList по очереди:
         * ---------------------------------------------------------------------------------------
         * Метод add() один элемент в середину LinkedList:
         * Метод add() один элемент в середину ArrayList:
         * ---------------------------------------------------------------------------------------
         * Метод add() один элемент в начало LinkedList:
         * Метод add() один элемент в начало ArrayList:
         * ---------------------------------------------------------------------------------------
         * Метод add() один элемент в конец LinkedList:
         * Метод add() один элемент в конец ArrayList:
         * ---------------------------------------------------------------------------------------
         * Метод set() по индексу в середину LinkedList:
         * Метод set() по индексу в середину ArrayList:
         * ---------------------------------------------------------------------------------------
         * Метод get() по индексу из середины LinkedList:
         * Метод get() по индексу из середины ArrayList:
         * ---------------------------------------------------------------------------------------
         * Метод get() из начала LinkedList:
         * Метод get() из начала ArrayList:
         * ---------------------------------------------------------------------------------------
         * Метод get() из конца LinkedList:
         * Метод get() из конца ArrayList:
         * ---------------------------------------------------------------------------------------
         * Метод get() по всем индексам ArrayList:
         * ---------------------------------------------------------------------------------------
         * Метод contains() в LinkedList:
         * Метод contains() в ArrayList:
         * ---------------------------------------------------------------------------------------
         * Метод remove() одно значение в LinkedList:
         * Метод remove() одно значение в ArrayList:
         * ---------------------------------------------------------------------------------------
         */
        //___________________________LinkedList________________________________________
        System.out.println("<---Тестирование и сравнение LinkedList, ArrayList, HashSet, LinkedHashSet--->");
        System.out.println("---------------------------------------------------------------------------------------");

        LinkedList<Integer> numbersLinkedList = new LinkedList<>();
        ArrayList<Integer> numbersArrayList = new ArrayList<>();
        HashSet<Integer> numbersHashSet = new HashSet<>();
        LinkedHashSet<Integer> numbersLinkedHashSet = new LinkedHashSet<>();


        int values = 100000;
        int n = 0;
//=======================================================================
        // метод add() LinkedList по-очереди во всю коллекцию
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < values; i++) {
            numbersLinkedList.add(n + i);
            n++;
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Метод add() LinkedList по-очереди во всю коллекцию: " + (end1 - start1));

        // метод add() ArrayList по-очереди во всю коллекцию
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < values; i++) {
            numbersArrayList.add(n + i);
            n++;
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Метод add() ArrayList по-очереди во всю коллекцию: " + (end2 - start2));

        // метод add() HashSet по-очереди во всю коллекцию
        long start11 = System.currentTimeMillis();
        for (int i = 0; i < values; i++) {
            numbersHashSet.add(n + i);
            n++;
        }
        long end11 = System.currentTimeMillis();
        System.out.println("Метод add() HashSet по-очереди во всю коллекцию: " + (end11 - start11));

        // метод add() LinkedHashSet по-очереди во всю коллекцию
        long start21 = System.currentTimeMillis();
        for (int i = 0; i < values; i++) {
            numbersLinkedHashSet.add(n + i);
            n++;
        }
        long end21 = System.currentTimeMillis();
        System.out.println("Метод add() LinkedHashSet по-очереди во всю коллекцию: " + (end21 - start21));

        System.out.println("======================");
        //=======================================================================

        //Метод add() LinkedList один элемент в середину
        long start3 = System.currentTimeMillis();
        numbersLinkedList.add(values / 2, 555);

        long end3 = System.currentTimeMillis();
        System.out.println("Метод add() LinkedList один элемент в середину: " + (end3 - start3));

        //Метод add() ArrayList один элемент в середину
        long start4 = System.currentTimeMillis();
        numbersArrayList.add(values / 2, 555);

        long end4 = System.currentTimeMillis();
        System.out.println("Метод add() ArrayList один элемент в середину: " + (end4 - start4));

//        //Метод add() HashSet один элемент в середину *
//        long start31 = System.currentTimeMillis();
//        numbersHashSet.add(values / 2,);
//
//        long end31 = System.currentTimeMillis();
//        System.out.println("Метод add() HashSet один элемент в середину*: " + (end31 - start31));
//
//        //Метод add() LinkedHashSet один элемент в середину *
//        long start41 = System.currentTimeMillis();
//        numbersLinkedHashSet.add(values / 2);
//
//        long end41 = System.currentTimeMillis();
//        System.out.println("Метод add() LinkedHashSet один элемент в середину*: " + (end41 - start41));

        System.out.println("======================");
        //=======================================================================

        //Метод add() LinkedList один элемент в начало
        long start5 = System.currentTimeMillis();
        numbersLinkedList.addFirst(555);
        long end5 = System.currentTimeMillis();
        System.out.println("Метод add() LinkedList один элемент в начало: " + (end5 - start5));

        //Метод add() ArrayList один элемент в начало
        long start6 = System.currentTimeMillis();
        numbersArrayList.add(0, 555);
        long end6 = System.currentTimeMillis();
        System.out.println("Метод add() ArrayList один элемент в начало: " + (end6 - start6));

//        //Метод add() HashSet один элемент в начало **
//        long start51 = System.currentTimeMillis();
//        numbersHashSet.add(555);
//        long end51 = System.currentTimeMillis();
//        System.out.println("Метод add() HashSet один элемент в начало**: " + (end51 - start51));
//
//        //Метод add() LinkedHashSet один элемент в начало **
//        long start61 = System.currentTimeMillis();
//        numbersLinkedHashSet.add(555);
//        long end61 = System.currentTimeMillis();
//        System.out.println("Метод add() LinkedHashSet один элемент в начало**: " + (end61 - start61));

        System.out.println("======================");
        //=======================================================================

        //Метод add() LinkedList один элемент в конец
        long start7 = System.currentTimeMillis();
        numbersLinkedList.addLast(555);
        long end7 = System.currentTimeMillis();
        System.out.println("Метод add() LinkedList один элемент в конец: " + (end7 - start7));

        //Метод add() ArrayList один элемент в конец
        long start8 = System.currentTimeMillis();
        numbersArrayList.add(numbersArrayList.size() - 1, 555);
        long end8 = System.currentTimeMillis();
        System.out.println("Метод add() ArrayList  один элемент в конец: " + (end8 - start8));

//        //Метод add() HashSet один элемент в конец ***
//        long start71 = System.currentTimeMillis();
//        numbersHashSet.add(numbersLinkedHashSet.size() - 1);
//        long end71 = System.currentTimeMillis();
//        System.out.println("Метод add() HashSet один элемент в конец***: " + (end71 - start71));
//
//        //Метод add() LinkedHashSet один элемент в конец ***
//        long start81 = System.currentTimeMillis();
//        numbersLinkedHashSet.add(numbersLinkedHashSet.size() - 1);
//        long end81 = System.currentTimeMillis();
//        System.out.println("Метод add() LinkedHashSet один элемент в конец***: " + (end81 - start81));

        System.out.println("======================");
        //=======================================================================

        //Метод set() LinkedList
        long start9 = System.currentTimeMillis();
        numbersLinkedList.set(values / 2, 555);
        long end9 = System.currentTimeMillis();
        System.out.println("Метод set() LinkedList: " + (end9 - start9));

        //Метод set() ArrayList
        long start10 = System.currentTimeMillis();
        numbersArrayList.set(values / 2, 555);
        long end10 = System.currentTimeMillis();
        System.out.println("Метод set() ArrayList: " + (end10 - start10));

        System.out.println("======================");
        //=======================================================================

        //Метод get() LinkedList по индексу из середины
        long start111 = System.currentTimeMillis();
        numbersLinkedList.get(values / 2);
        long end111 = System.currentTimeMillis();
        System.out.println("Метод get() LinkedList по индексу из середины: " + (end111 - start111));

        //Метод get() ArrayList по индексу из середины
        long start12 = System.currentTimeMillis();
        numbersArrayList.get(values / 2);
        long end12 = System.currentTimeMillis();
        System.out.println("Метод get() ArrayList по индексу из середины: " + (end12 - start12));

        System.out.println("======================");
        //=======================================================================

        //Метод get() LinkedList по индексу из начала
        long start13 = System.currentTimeMillis();
        numbersLinkedList.peekFirst();
        long end13 = System.currentTimeMillis();
        System.out.println("Метод get() LinkedList по индексу из начала: " + (end13 - start13));

        //Метод get() ArrayList по индексу из начала
        long start14 = System.currentTimeMillis();
        numbersArrayList.get(values / 2);
        long end14 = System.currentTimeMillis();
        System.out.println("Метод get() ArrayList по индексу из начала: " + (end14 - start14));
        System.out.println("======================");
        //=======================================================================

        //Метод get() LinkedList по индексу из конца
        long start15 = System.currentTimeMillis();
        numbersLinkedList.getFirst();
        long end15 = System.currentTimeMillis();
        System.out.println("Метод get() LinkedList по индексу из конца: " + (end15 - start15));

        //Метод get() ArrayList по индексу из конца
        long start16 = System.currentTimeMillis();
        numbersArrayList.get(numbersArrayList.size() - 1);
        long end16 = System.currentTimeMillis();
        System.out.println("Метод get() ArrayList по индексу из конца: " + (end16 - start16));
        System.out.println("======================");
        //=======================================================================

        //Метод get() LinkedList по всей коллекции
        long start17 = System.currentTimeMillis();
        for (int i = 0; i < numbersLinkedList.size(); i++) {
            numbersLinkedList.get(i);
        }
        long end17 = System.currentTimeMillis();
        System.out.println("Метод get() LinkedList по всей коллекции : " + (end17-start17));

        //Метод get() ArrayList по всей коллекции
        long start18 = System.currentTimeMillis();
        for (int i = 0; i < numbersArrayList.size(); i++) {
        numbersArrayList.get(i);
        }
        long end18 = System.currentTimeMillis();
        System.out.println("Метод get() ArrayList по всей коллекции : " + (end18-start18));

        //метод iterator()(вместо get) по всем значениям в LinkedHashSet
        long start181 = System.currentTimeMillis();
        for (Iterator<Integer>iter = numbersLinkedHashSet.iterator();iter.hasNext();){
            iter.next();
        }
        long end181 = System.currentTimeMillis();
        System.out.println("метод iterator (вместо get) все элементы в HashSet: " + (end181 - start181));
        //метод iterator()(вместо get) по всем значениям в HashSet
        long start182 = System.currentTimeMillis();
        for (Iterator<Integer>iter = numbersHashSet.iterator();iter.hasNext();){
            iter.next();
        }
        long end182 = System.currentTimeMillis();
        System.out.println("метод iterator (вместо get) все элементы в HashSet: " + (end182 - start182));

        System.out.println("======================");
        //=======================================================================


        //Метод contains() LinkedList
        long start19 = System.currentTimeMillis();
        numbersLinkedList.contains(789);
        long end19 = System.currentTimeMillis();
        System.out.println("Метод contains() ArrayList: " + (end19 - start19));

        //Метод contains() ArrayList
        long start20 = System.currentTimeMillis();
        numbersArrayList.contains(789);
        long end20 = System.currentTimeMillis();
        System.out.println("Метод contains() ArrayList: " + (end20 - start20));

        //Метод contains() HashSet
        long start191 = System.currentTimeMillis();
        numbersHashSet.contains(789);
        long end191 = System.currentTimeMillis();
        System.out.println("Метод contains() HashSet: " + (end191 - start191));

        //Метод contains() LinkedHashSet
        long start201 = System.currentTimeMillis();
        numbersLinkedHashSet.contains(789);
        long end201 = System.currentTimeMillis();
        System.out.println("Метод contains() LinkedHashSet: " + (end201 - start201));
        System.out.println("======================");
        //=======================================================================

        //Метод remove() LinkedList из середины
        long start211 = System.currentTimeMillis();
        numbersLinkedList.remove(values / 2);
        long end211 = System.currentTimeMillis();
        System.out.println("Метод remove() LinkedList из середины: " + (end211 - start211));

        // Метод remove() ArrayList из середины
        long start22 = System.currentTimeMillis();
        numbersArrayList.remove(values / 2);
        long end22 = System.currentTimeMillis();
        System.out.println("Метод remove() ArrayList из середины: " + (end22 - start22));

        //Метод remove() HashSet из середины
        long start212 = System.currentTimeMillis();
        numbersHashSet.remove(values / 2);
        long end212 = System.currentTimeMillis();
        System.out.println("Метод remove() HashSet из середины: " + (end212 - start212));

        // Метод remove() LinkedHashSet из середины
        long start221 = System.currentTimeMillis();
        numbersLinkedHashSet.remove(values / 2);
        long end221 = System.currentTimeMillis();
        System.out.println("Метод remove() LinkedHashSet из середины: " + (end221 - start221));
        System.out.println("======================");
        //=======================================================================

        //Метод remove() LinkedList все значения
        long start23 = System.currentTimeMillis();
        for (int i = 0; i < numbersArrayList.size(); i++) {
            numbersLinkedList.remove(i);
        }
        long end23 = System.currentTimeMillis();
        System.out.println("Метод remove() LinkedList все значения: " + (end23 - start23));

        // Метод remove() ArrayList все значения
        long start24 = System.currentTimeMillis();
        for (int i = 0; i < numbersLinkedList.size(); i++) {
            numbersArrayList.remove(i);
        }
        long end24 = System.currentTimeMillis();
        System.out.println("Метод remove() ArrayList все значения: " + (end24 - start24));

        //Метод remove() HashSet все значения
        long start231 = System.currentTimeMillis();
        for (int i = 0; i < numbersArrayList.size(); i++) {
            numbersHashSet.remove(i);
        }
        long end231 = System.currentTimeMillis();
        System.out.println("Метод remove() HashSet все значения: " + (end231 - start231));

        // Метод remove() LinkedHashSet все значения
        long start241 = System.currentTimeMillis();
        for (int i = 0; i < numbersLinkedList.size(); i++) {
            numbersLinkedHashSet.remove(i);
        }
        long end241 = System.currentTimeMillis();
        System.out.println("Метод remove() LinkedHashSet все значения: " + (end241 - start241));
        System.out.println("======================");
        //=======================================================================

        //Метод clear() LinkedList
        long start25 = System.currentTimeMillis();
        numbersLinkedList.clear();
        long end25 = System.currentTimeMillis();
        System.out.println("Метод clear() LinkedList: " + (end25 - start25));

        // Метод clear() ArrayList
        long start26 = System.currentTimeMillis();
        numbersArrayList.clear();
        long end26 = System.currentTimeMillis();
        System.out.println("Метод clear() ArrayList: " + (end26 - start26));

        //Метод clear() HashSet
        long start251 = System.currentTimeMillis();
        numbersHashSet.clear();
        long end251 = System.currentTimeMillis();
        System.out.println("Метод clear() HashSet: " + (end251 - start251));

        // Метод clear() LinkedHashSet
        long start261 = System.currentTimeMillis();
        numbersLinkedHashSet.clear();
        long end261 = System.currentTimeMillis();
        System.out.println("Метод clear() LinkedHashSet: " + (end261 - start261));
        System.out.println("======================");
        //=======================================================================


// HashSet определяет следующие методы:
//        1	boolean add(Object o)
//        Добавляет указанный элемент к этому набору, если он еще не присутствует.
//        2	void clear()
//        Удаляет все элементы из этого набора.
//        3	Object clone()
//        Возвращает мелкую копию этого экземпляра HashSet: сами элементы не клонируются.
//        4	boolean contains(Object o)
//        Возвращает true, если этот набор содержит указанный элемент.
//        5	boolean isEmpty()
//        Возвращает true, если этот набор не содержит элементов.
//        6	Iterator iterator()
//        Возвращает итератор по элементам этого набора.
//        7	boolean remove(Object o)
//        Удаляет указанный элемент из этого набора, если он присутствует.
//        8	int size()
//        Возвращает количество элементов в этом наборе (его количество элементов).
    }
}
