package lesson_10.interfaces;

public abstract class AbstrEmployer implements Employer{

    //����
    private int age;
    private String fullName;

    // ������������

    // ������
    @Override
    public String getFullNName() {
        return fullName;
    }

    @Override
    public int getAge() {
        return age;
    }
}
