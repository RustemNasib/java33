package lesson_10.interfaces;

public class JavaDeveloper extends AbstrEmployer{
    @Override
    public void doWork() {
        System.out.println("ѕишу код на Java");
    }

    @Override
    public void keepSalary() {
        System.out.println("100 000 руб. в мес.");
    }


}
