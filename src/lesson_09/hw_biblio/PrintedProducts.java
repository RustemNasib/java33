package lesson_09.hw_biblio;

public abstract class PrintedProducts {
    //поля
    protected String title;//название
    protected int yearOfPublishing;// год издания
    protected String publishingHouse;//издательство

    protected int numberOfPages;// количество страниц
    // конструкторы

    // методы

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }


    // абстрактный метод печати всей информации по объекту

    public abstract void AllInfo();

  }
