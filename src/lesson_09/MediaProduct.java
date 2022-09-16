package lesson_09;

import java.util.Arrays;

public abstract class MediaProduct {
    //Поля класса
    protected String name;
    protected int year;

    // Конструктор класса
    // Методы


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


        // абстрактный метод печати всей информации по объекту

        public abstract void printAllInfo ();





}
