package lesson_19;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet <Integer> integerLinkedHashSet = new LinkedHashSet<>();
        integerLinkedHashSet.add(1);
        integerLinkedHashSet.add(2);
        integerLinkedHashSet.add(3);
        integerLinkedHashSet.add(3);
        integerLinkedHashSet.add(4);
        integerLinkedHashSet.add(5);
        integerLinkedHashSet.add(6);
        integerLinkedHashSet.add(7);

        System.out.println(integerLinkedHashSet);

               int values = 100000;
        //метод add() все элементы в LinkedHashSet
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < values; i++) {
            integerLinkedHashSet.add(i*i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("метод add() все элементы в LinkedHashSet: " + (end1 - start1));

        //метод add() один элемент в LinkedHashSet
        long start2 = System.currentTimeMillis();
        integerLinkedHashSet.add(555);
        long end2 = System.currentTimeMillis();
        System.out.println("метод add() все элементы в LinkedHashSet: " + (end2 - start2));

        //метод iterator()(вместо get) по всем значениям
        long start3 = System.currentTimeMillis();
        for (Iterator<Integer>iter = integerLinkedHashSet.iterator();iter.hasNext();){
            iter.next();
        }
        long end3 = System.currentTimeMillis();
        System.out.println("метод iterator (вместо get) все элементы в LinkedHashSet: " + (end3 - start3));

    }

}
