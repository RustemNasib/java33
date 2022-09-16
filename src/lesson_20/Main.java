package lesson_20;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
Smartphone smartphone1 = new Smartphone(120000, 4.1, "Samsung S 21 max", 256);
Smartphone smartphone2 = new Smartphone(150000, 3.5, "Samsung S15", 128);
Smartphone smartphone3 = new Smartphone(125000, 3.2, "Samsung A15", 64);
Smartphone smartphone4 = new Smartphone(110000, 4.4, "Apple 13Pro", 512);
Smartphone smartphone5 = new Smartphone(123000, 4.2, "Apple 11", 256);
Smartphone smartphone6 = new Smartphone(1090000, 4.4, "Huawei p70", 1024);

        TreeSet <Smartphone> smartphones = new TreeSet<>();
        smartphones.add (smartphone1);
        smartphones.add (smartphone2);
        smartphones.add (smartphone3);
        smartphones.add (smartphone4);
        smartphones.add (smartphone5);
        smartphones.add (smartphone6);

        System.out.println(smartphones);

        SmartphoneSorted sorted = new SmartphoneSorted();
        System.out.println("\n-----printByNameFromTo------ ");
        sorted.printByNameFromTo (smartphones);   //FromTo - порядок сортировки от меньшего к большему

        System.out.println("\n------printByNameToFrom------");
        sorted.printByNameToFrom (smartphones);   //ToFrom - порядок сортировки от большего к меньшему

        System.out.println("\n------printByMarkFromTo------");
        sorted.printByMarkFromTo (smartphones);

        System.out.println("\n-----printByMarkToFrom------");
        sorted.printByMarkToFrom (smartphones);

    }
}
