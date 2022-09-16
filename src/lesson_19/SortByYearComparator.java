package lesson_19;

import java.util.Comparator;

public class SortByYearComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        // o1 - ������ ������
        // �2 - ������ ������

        if (o1.getNominal() != o2.getNominal()) {//���� ������� �������, ������� ��������� � ���� ������, �� ����� "�" ��� �������, ������� ������ ��� ��������� � ����� compareTo
            return o1.getNominal() - o2.getNominal();
                    }
        if (o1.getDiametr() != o2.getDiametr()) {//�� �� ����� � double ������� ������������� ��������
            return Double.compare(o1.getDiametr(), o2.getDiametr()); // - ���������� �������� c ������� ������ � double
        }
        if (o1.getYear() != o2.getYear()) {  // ���� ��� � ������������ ������, �� ����� ����, ������� ������ �� ��� (compareTo)
            return o1.getYear() - o2.getYear();//����� ����� ����� �����
        }

        if (!o1.getCountry().equals(o2.getCountry())) { //�.�. String �� ����������� ���, �� �� ����� ������������ � ������� !=, ������� ��������� equals
            // equals() - ��� ����� ���������, ������� !(�����������) ������ �������
            return o1.getCountry().compareTo(o2.getCountry());//� String �������� ����� compareTo
        }

        return 0;
    }
}
