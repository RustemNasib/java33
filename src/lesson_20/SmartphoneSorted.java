package lesson_20;

import java.util.TreeSet;

public class SmartphoneSorted {
    public void printByNameFromTo(TreeSet<Smartphone> smartphones) { // �� � �� �
        TreeSet <Smartphone> byName = new TreeSet<>(new ByNameFromToCompate());//����� ������ ��������� � ����������� ����������
        byName.addAll(smartphones);//���������� ��������� �� treeSet  � byName
        for (Smartphone s:byName) System.out.print(s);
    }

    public void printByNameToFrom(TreeSet<Smartphone> smartphones) {//�� � �� �
        TreeSet <Smartphone> byNameToFrom = new TreeSet<>(new ByNameToFromCompate());//����� ������ ��������� � ����������� ���������� � �������
        byNameToFrom.addAll(smartphones);
        for (Smartphone s:byNameToFrom) System.out.print(s);
    }

    public void printByMarkFromTo(TreeSet<Smartphone> smartphones) {
        TreeSet <Smartphone> byMarkToFrom = new TreeSet<>(new ByMarkToFromCompate());//����� ������ ��������� � ����������� ���������� � �������
        byMarkToFrom.addAll(smartphones);
        for (Smartphone s:byMarkToFrom) System.out.print(s);
    }

    public void printByMarkToFrom(TreeSet<Smartphone> smartphones) {
        TreeSet <Smartphone> byMarkFromTo = new TreeSet<>(new ByMarkFromToCompate());//����� ������ ��������� � ����������� ���������� � �������
        byMarkFromTo.addAll(smartphones);
        for (Smartphone s:byMarkFromTo) System.out.print(s);
    }
}
