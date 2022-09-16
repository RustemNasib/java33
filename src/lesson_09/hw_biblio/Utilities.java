package lesson_09.hw_biblio;

import lesson_09.MediaProduct;

import java.time.LocalDate;

public class Utilities {
    public static void printThickestEdition(PrintedProducts[] products) {

        int currentEditionThickness = 0;

        for (PrintedProducts product : products) { // проходим по всем элементам массива products и складываем элементы в product
            if (product.getNumberOfPages() > currentEditionThickness) { //сравниваем полученную толщину из массива с текущей толщиной (нулем)
                currentEditionThickness = product.getNumberOfPages();// получаем из коллекции максимальный размер
            }
        }
        for (PrintedProducts product : products) { // проход по продуктам коллекции
            if (product.getNumberOfPages() == currentEditionThickness) { //если максимальный размер - это размер издания
                System.out.println("Самое толстое издание : ");
                product.AllInfo(); // вызываем абстрактный метод информирующий о продукте
            }
        }
    }

}

