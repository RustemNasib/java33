package lesson_20;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Iter_foreach_while {
    public static void main(String[] args) {
        //1. ������� ��������� TreeSet
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        //2.������ while (���������� ������)
        Iterator<Integer> iter = set.iterator();       // ��������� ������ �� ���������� iter
        while (iter.hasNext()) {                       // �������� �� iter, ���� ���� ���������
            Integer currentElement = iter.next();      //������ �� ��������� set, ������� �������� �� iter, ���� ����� �������� (���� ���� ��������� �������)
            System.out.print(currentElement + "; ");
        }
        System.out.println();

        //3. ������ foreach (�� ���������� ������, �� ����� ���� ������)
        for (Integer currentElement:set){
            System.out.print(currentElement + "; ");
        }

    }
}

