package lesson_09.hw_biblio;

import lesson_09.MediaProduct;
import lesson_09.ServiceUtilities;

public class Main {
    public static void main(String[] args) {
        //название, год выхода, номер выпуска, количество страниц, издательство
        Journals journal1 = new Journals();
        journal1.setTitle("Огонек");
        journal1.setYearOfPublishing(1899);
        journal1.setNumberOfPublishing("4");
        journal1.setNumberOfPages(45);
        journal1.setPublishingHouse("ИД Коммерсант");

        Journals journal2 = new Journals();
        journal2.setTitle("За рулем");
        journal2.setYearOfPublishing(1928);
        journal2.setNumberOfPublishing("2");
        journal2.setNumberOfPages(67);
        journal2.setPublishingHouse("ИД За рулем");

        //название, автор, год издания, количество страниц, издательство
        Books book1 = new Books();
        book1.setTitle("Война и мир");
        book1.setAuthor("Л.Н.Толстой");
        book1.setYearOfPublishing(1865);
        book1.setNumberOfPages(1300);
        book1.setPublishingHouse("Азбука");

        Books book2 = new Books();
        book2.setTitle("Цена счастья");
        book2.setAuthor("О.Бузова");
        book2.setYearOfPublishing(2016);
        book2.setNumberOfPages(43);
        book2.setPublishingHouse("Ozeransky Media Group");

        // созданные печатные продукты складываем в родительский массив
       PrintedProducts[] products = new PrintedProducts[4];
        products[0] = journal1;
        products[1] = journal2;
        products[2] = book1;
        products[3] = book2;


        // распечатать массив медиа
        for (PrintedProducts print : products) {
            print.AllInfo(); // проявление полиморфизма
        }
        System.out.println();
        Utilities.printThickestEdition (products);

    }
}
