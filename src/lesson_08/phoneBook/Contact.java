package lesson_08.phoneBook;

public class Contact {
    //1. Поля (field)
    private String name;
    private String email;
    private String phone;

    private String pathToImage; // пуь к картинке на серваке

    //2. Конструкторы

    //3. Методы
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }
}
