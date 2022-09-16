package lesson_20;

import java.util.Objects;

public class Smartphone implements Comparable <Smartphone> {

    // fields
    private int price;
    private double markYandex;
    private String name;
    private int memory;

    //constructors

    public Smartphone(int price, double markYandex, String name, int memory) {
        this.price = price;
        this.markYandex = markYandex;
        this.name = name;
        this.memory = memory;
    }

    //methods

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getMarkYandex() {
        return markYandex;
    }

    public void setMarkYandex(double markYandex) {
        this.markYandex = markYandex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone)) return false;
        Smartphone that = (Smartphone) o;
        return getPrice() == that.getPrice() && Double.compare(that.getMarkYandex(), getMarkYandex()) == 0 && getMemory() == that.getMemory() && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getMarkYandex(), getName(), getMemory());
    }

    @Override
    public String toString() {
        return "\n смартфон {" +
                "цена = " + price +
                ", маркировка яндекс =" + markYandex +
                ", название = '" + name + '\'' +
                ", память =" + memory +
                '}';
    }

    @Override
    public int compareTo(Smartphone o) {
        if (this.getPrice() != o.getPrice()) {
            return this.getPrice() - o.getPrice();
        }
        if (!this.getName().equals(o.getName())) { // применяем метод, тк String не примитивный
            return this.getName().compareTo(o.getName());
        }
        if (this.getMarkYandex() != o.getMarkYandex()) {
            return Double.compare(this.getMarkYandex(), o.getMarkYandex());
        }
        if (this.getMemory() != o.getMemory()) {
            return this.getMemory() - o.getMemory();
           }
        return 0;
    }
}




