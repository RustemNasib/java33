package lesson_08.phoneBook;

public class Main {
    public static void main(String[] args) {
        Contact Vasya = new Contact();
        Vasya.setEmail("Vasya@email.com");
        Vasya.setPhone("+792363856");
        Vasya.setName("Vasya");

        Contact Petya = new Contact();
        Petya.setEmail("Petya@email.com");
        Petya.setPhone("+792512906");
        Petya.setName("Petya");

        Contact Sasha = new Contact();
        Sasha.setEmail("Sasha@email.com");
        Sasha.setPhone("+792545721");
        Sasha.setName("Sasha");

        Contact Vera = new Contact();
        Vera.setEmail("Vera@email.com");
        Vera.setPhone("+792534657");
        Vera.setName("Vera");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(Vasya);
        phoneBook.addContact(Petya);
        phoneBook.addContact(Sasha);
        phoneBook.addContact(Vera);

        phoneBook.sourch("85");

    }
}
