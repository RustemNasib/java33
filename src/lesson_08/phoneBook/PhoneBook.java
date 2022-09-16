package lesson_08.phoneBook;

public class PhoneBook {
    //1. Поля (field)
    //контакты - это новый класс, который нам нужно описать
    private Contact[] contacts = new Contact[1000];

    //2. Конструкторы
    //3. Методы
    public void addContact(Contact contact) { // добавиь контакты
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                break;
            }
        }
    }

    public void sourch(String forSourch) { //искать контакты
        for (Contact c : contacts) {
            if (c != null) {
                // Поиск по имени
                String nameOfCurrentContact = c.getName();
                if (nameOfCurrentContact != null) {
                    if (nameOfCurrentContact.contains(forSourch.toLowerCase().toUpperCase())) {
                        System.out.println(c.getName() + " " + c.getPhone());
                    }
                }
                // поиск по телефону
                String numberOfCurrentContact = c.getPhone();
                if (numberOfCurrentContact != null) {
                    if (numberOfCurrentContact.contains(forSourch)) {
                        System.out.println(c.getName() + " " + c.getPhone());
                    }
                }
            }
        }
    }
}
