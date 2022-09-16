package lesson_19;

import java.util.Comparator;

public class SortByYearComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        // o1 - первая монета
        // о2 - вторая монета

        if (o1.getNominal() != o2.getNominal()) {//если номинал монетки, которая находится в узле дерева, не равен "о" той монетки, которая пришла для сравнения в метод compareTo
            return o1.getNominal() - o2.getNominal();
                    }
        if (o1.getDiametr() != o2.getDiametr()) {//мы не можем у double вернуть отрицательное значение
            return Double.compare(o1.getDiametr(), o2.getDiametr()); // - сравниваем диаметры c помошью метода у double
        }
        if (o1.getYear() != o2.getYear()) {  // если год у сравниваемой монеты, не равен году, который пришел из вне (compareTo)
            return o1.getYear() - o2.getYear();//тогда верни любое число
        }

        if (!o1.getCountry().equals(o2.getCountry())) { //т.к. String не примитивный тип, он не может сравниваться с помощью !=, поэтому применяем equals
            // equals() - это метод сравнения, поэтому !(неравенство) ставим вначале
            return o1.getCountry().compareTo(o2.getCountry());//в String вызываем метод compareTo
        }

        return 0;
    }
}
