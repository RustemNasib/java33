package lesson_10.interfaces;

public abstract class AbstrEmployer implements Employer{

    //Поля
    private int age;
    private String fullName;

    // конструкторы

    // методы
    @Override
    public String getFullNName() {
        return fullName;
    }

    @Override
    public int getAge() {
        return age;
    }
}
