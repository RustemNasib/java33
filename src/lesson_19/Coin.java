package lesson_19;

import java.util.Objects;

public class Coin implements Comparable<Coin> { //при сортировке самого себя используется не Сomparator а Comparable
    //поля
    private int nominal;
    private double diametr;
    private String country;
    private int year;

    // конструктор

    public Coin(int nominal, double diametr, String country, int year) {
        this.nominal = nominal;
        this.diametr = diametr;
        this.country = country;
        this.year = year;
    }

    // методы


    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // переопределение метода toString для вывода на консоль всех параметров, чтобы отрабатывал не по object, а по coin
    @Override
    public String toString() {
        return "Монета { " +
                "номинал = " + nominal +
                ", диаметр = " + diametr +
                ", страна = '" + country + '\'' +
                ", год = " + year +
                '}';
    }

    // переопределяем, что бы не повторялись одинаковые монетки (equals & hashCode)
    // если не перепределить equal, то будут храниться дубликаты
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coin)) return false;
        Coin coin = (Coin) o;
        return getNominal() == coin.getNominal() && Double.compare(coin.getDiametr(), getDiametr()) == 0 && getYear() == coin.getYear() && Objects.equals(getCountry(), coin.getCountry());
    }

    // если не переопределить hashCode, то все монеты будут храниться в одной баночке
    @Override
    public int hashCode() {
        return Objects.hash(getNominal(), getDiametr(), getCountry(), getYear());
    }

    @Override
    public int compareTo(Coin o) { //имплементированный метод из Coin

        /**
 * Делаем сортировку для Coin
 *         Coin coin1 = new Coin(10, 20.2,"Russian", 2005);
 *         Coin coin2 = new Coin(10, 20.2,"Russian", 2005);
 *         Coin coin3 = new Coin(2, 12.0,"USSR", 1987);
 *         Coin coin4 = new Coin(5, 10.5,"China", 2020);
 *         Coin coin5 = new Coin(50, 15.2,"Kazakhstan", 2021);
 * Если первое сравнение делать по году, то в случае совпадения годов, нужно сделать сравнение по следующему полю
 * Если года совпадают метод compare даст 0 и тогда в новой сортировке монета не сохраниться,а  нам нужно
 *  сравнить дальше по, например номиналу, если оба поля совпали, тогда по диаметру, если три поля совпали,
 * то дальше по стране. Если все 4 поля совпали, тогда такую монету при новой сортировке в коллекцию добавлять
 * е нужно, compare вернет 0.
 */

        //this - первая монета
        // o - вторая монета
        if (this.getNominal() != o.getNominal()) {//если номинал монетки, которая находится в узле дерева, не равен "о" той монетки, которая пришла для сравнения в метод compareTo
            return this.getNominal() - o.getNominal();
        }
        if (this.getYear() != o.getYear()) {  // если год у сравниваемой монеты, не равен году, который пришел из вне (compareTo)
            return this.getYear() - o.getYear();//тогда верни любое число
        }
        if (this.getDiametr() != o.getDiametr()) {//мы не можем у double вернуть отрицательное значение
            return Double.compare(this.getDiametr(), o.getDiametr()); // - сравниваем диаметры c помошью метода у double
        }
        if (!this.getCountry().equals(o.getCountry())) { //т.к. String не примитивный тип, он не может сравниваться с помощью !=, поэтому применяем equals
            // equals() - это метод сравнения, поэтому !(неравенство) ставим вначале
            return this.getCountry().compareTo(o.getCountry());//в String вызываем метод compareTo
        }

        return 0;
    }
}
