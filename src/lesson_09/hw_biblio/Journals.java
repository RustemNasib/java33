package lesson_09.hw_biblio;

public class Journals extends PrintedProducts {

    //поля
    private String numberOfPublishing;
    // конструкторы

    //методы

    public String getNumberOfPublishing() {
        return numberOfPublishing;
    }

    public void setNumberOfPublishing(String numberOfPublishing) {
        this.numberOfPublishing = numberOfPublishing;
    }

    @Override
    public void AllInfo() {
        System.out.println("Журнал: " + this.title + "; Год выпуска: " + this.yearOfPublishing + ", " +
                "Номер выпуска: " + this.numberOfPublishing + "; Количество страниц: " + this.numberOfPages +
                "; Издательство: " + this.publishingHouse);
    }
}

