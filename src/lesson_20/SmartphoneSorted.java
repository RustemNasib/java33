package lesson_20;

import java.util.TreeSet;

public class SmartphoneSorted {
    public void printByNameFromTo(TreeSet<Smartphone> smartphones) { // от А до Я
        TreeSet <Smartphone> byName = new TreeSet<>(new ByNameFromToCompate());//новая пустая коллекция с параметрами сортировки
        byName.addAll(smartphones);//пересыпаем смартфоны из treeSet  в byName
        for (Smartphone s:byName) System.out.print(s);
    }

    public void printByNameToFrom(TreeSet<Smartphone> smartphones) {//от Я до А
        TreeSet <Smartphone> byNameToFrom = new TreeSet<>(new ByNameToFromCompate());//новая пустая коллекция с параметрами сортировки в скобках
        byNameToFrom.addAll(smartphones);
        for (Smartphone s:byNameToFrom) System.out.print(s);
    }

    public void printByMarkFromTo(TreeSet<Smartphone> smartphones) {
        TreeSet <Smartphone> byMarkToFrom = new TreeSet<>(new ByMarkToFromCompate());//новая пустая коллекция с параметрами сортировки в скобках
        byMarkToFrom.addAll(smartphones);
        for (Smartphone s:byMarkToFrom) System.out.print(s);
    }

    public void printByMarkToFrom(TreeSet<Smartphone> smartphones) {
        TreeSet <Smartphone> byMarkFromTo = new TreeSet<>(new ByMarkFromToCompate());//новая пустая коллекция с параметрами сортировки в скобках
        byMarkFromTo.addAll(smartphones);
        for (Smartphone s:byMarkFromTo) System.out.print(s);
    }
}
