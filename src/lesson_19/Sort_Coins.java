package lesson_19;

import java.util.Comparator;
import java.util.TreeSet;

public class Sort_Coins {
    public static void printSortByYear(TreeSet<Coin>coins) {
        TreeSet<Coin>sorted = new TreeSet<>(new SortByYearComparator());//указали методику сортировки
sorted.addAll(coins);//переложили все монеты
for (Coin c:sorted){//проход по коллекции
    System.out.println(c);
}
    }
    public static void printSortToFrom(TreeSet<Coin>coins){ //метод от конца к началу
        TreeSet<Coin>sorted = new TreeSet<>(new Comparator<Coin>() {//вложили интерфейс (new Comparator<Coin>())с данными  из класса SortByYearComparator,
            // таким образом создав ниже внутренний безымянный класс
            @Override
            //создали внутренний безымянный класс, что бы не создавать новый класс и воспользоваться существующими данными из класса SortByYearComparator
            public int compare(Coin o1, Coin o2) {
                if (o1.getNominal() != o2.getNominal()) {//если номинал монетки, которая находится в узле дерева, не равен "о" той монетки, которая пришла для сравнения в метод compareTo
                    return o2.getNominal() - o1.getNominal();//поменяли местами о1 и о2, что бы вывести наоборот (от конца к началу), как планировалось в методе ранее
                }
                if (o1.getYear() != o2.getYear()) {  // если год у сравниваемой монеты, не равен году, который пришел из вне (compareTo)
                    //тогда верни любое число
                    return o2.getYear() - o1.getYear();//поменяли местами о1 и о2, что бы вывести наоборот (от конца к началу), как планировалось в методе ранее
                }
                if (o1.getDiametr() != o2.getDiametr()) {//мы не можем у double вернуть отрицательное значение
                    // - сравниваем диаметры c помошью метода у double
                    return Double.compare(o2.getDiametr(), o1.getDiametr()); //поменяли местами о1 и о2, что бы вывести наоборот (от конца к началу), как планировалось в методе ранее
                }
                if (!o1.getCountry().equals(o2.getCountry())) { //т.к. String не примитивный тип, он не может сравниваться с помощью !=, поэтому применяем equals
                    // equals() - это метод сравнения, поэтому !(неравенство) ставим вначале
                    return o1.getCountry().compareTo(o2.getCountry());//в String вызываем метод compareTo
                }
                return 0;
            }
        });
        sorted.addAll(coins);//переложили все монеты
        for (Coin c:sorted){//проход по коллекции
            System.out.println(c);
        }
    }
}
