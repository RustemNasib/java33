package lesson_10.interfaces;

public class PytonDeveloper  extends AbstrEmployer implements Employer{
    @Override
    public void doWork() {
        System.out.println("ѕишу код на Pyton");
    }

    @Override
    public void keepSalary() {
        System.out.println("95 000 руб. в мес");
    }
}
