package lesson_09;

import java.time.LocalDate;

public class ServiceUtilities {

    public static void printOldestMedia(MediaProduct[] medias) {
        LocalDate current_date = LocalDate.now();
/**
 * LocalDate — это неизменяемый объект даты и времени, который представляет дату, часто рассматриваемую как год-месяц-день.
 * Другие поля даты, такие как день года, день недели и неделя года, также могут быть доступны.
 * Например, значение «2 октября 2007 г.» может быть сохранено в LocalDate.Этот класс не хранит и не представляет время
 * или часовой пояс. Вместо этого это описание даты, используемой для дней рождения. Он не может представлять мгновение
 * на временной шкале без дополнительной информации, такой как смещение или часовой пояс.
 */
        /**
         * Метод now - получает текущую дату по системным часам в часовом поясе по умолчанию.
         * Запрашивает системные часы в часовом поясе по умолчанию, чтобы получить текущую дату.
         * Использование этого метода предотвратит возможность использования альтернативных часов для тестирования,
         * поскольку часы жестко запрограммированы.
         * Возвращает: текущую дату с использованием системных часов и часового пояса по умолчанию, не нуль
         */
        int currentYear = current_date.getYear(); // на currentYear положили текущий год, int currentYear = 2022;
        /**
         *    метод getYear  Получает поле года.
         * Этот метод возвращает примитивное значение int для года.
         * Год, возвращаемый этим методом, является пролептическим в соответствии с get(YEAR).
         */

        for (MediaProduct product : medias) { // проходим по всем элементам массива medias и складываем элементы в product
            if (product.getYear() < currentYear) { //сравниваем полученный год из массива с текущим годом
                currentYear = product.getYear();// получаем из коллекции минимальный год
            }
        }
        for (MediaProduct product : medias) { // проход по продуктам коллекции
            if (product.getYear() == currentYear) { //если минимальный год - это год продукта
                System.out.println("Самый старый диск в каталоге: ");
                product.printAllInfo(); // вызываем абстрактный метод информирующий о продукте
            }
        }
    }

}














       

