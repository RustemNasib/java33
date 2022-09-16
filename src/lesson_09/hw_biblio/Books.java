package lesson_09.hw_biblio;

public class Books extends PrintedProducts{
    // поля

    private String author;//автор


    // конструкторы

    // методы

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



    @Override
    public void AllInfo() {
        System.out.println("Книга: "+ this.title + "; Автор: "+ this.author + "; Год издания: "+ this.yearOfPublishing +
                "; Количество страниц: "+ this.numberOfPages + "; Издательство: " + this.publishingHouse);
    }
}
