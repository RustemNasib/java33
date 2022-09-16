package lesson_06;

import java.util.Scanner;

public class String_methods {
    public static void main(String[] args) {
/**
 * Ссылочные типы от JDK (стандартные):
 *                  java.util - множество безразмерных массивов
 *                  java.time - работа со временем
 *                  java.text - работа с текстом
 *                  java.sql - работа с базой данных
 *                  java.security - работа по безопасности
 *                  java.io, java.nio - копирование и перемещение файлов
 *                  java.math - математические функции
 *                  java.lang - стандартный набор для каждого создаваемого класса по работе с клавиатурой,
 *                  календарем, String и т.п. Здесь и лежит метод System.in и System.out
 *                  java.net - работа с сетью
 *                  java.awt - старая технология рисования графических элементов
 *                  java.applet - методы открытия и работы приложений через браузер
 */

        /**
         *  В Java поддерживаются 2 вида строк:
         *                  неизменяемые - объекты класса String;
         *                  изменяемые - объекты класса StringBuffer;
         *
         *                  Основные свойства "строковых" классов:
         *                  оба класса принадлежат пакету java.lang;
         *                  оба класса не могут наследоваться - в целях повышения эффективности обработки строк;
         */

        /**
         * Методы класса String:
         *         int lenght() - возвращает длину строки (количество символов в строке);
         *
         *         String concat(String s) - присоединяет строку к строке this. Работает как +;
         *
         *         String trim() - удаляет ведущие и завершающие пробельные символы из строки this
         *         Пробельные символы: ' ', \r, \n, \t. Например, при вводе пароля отброс пробелов;
         *
         *         String replace(char original, char replacement) - заменяет все вхождения символа original символом
         *                 replacement;
         *
         *         String toLowerCase() - изменяет регистр символов в строке, делая все буквы строчными. Например,
         *                 преобразование e-mail к маленьким буквам всегда;
         *
         *         String toUpperCase() - изменяет регистр символов в строке, делая все буквы прописными;
         *
         *         String replaceAll(String regex, String replacement) - замещает все вхождения regex на replacement.
         *                 В качестве regex может быть регулярное выражение. Например, есть текст поздравления
         *         на Дмитрия, можно во всем письме заменить Дмитрия на Петра;
         *
         *         String replaceFirst(String regex, String replacement) - замещает первое вхождения regex на replacement.
         *                 В качестве regex может быть регулярное выражение. Например, есть письмо и в нем обращение
         *         есть к адресату есть только один раз, значит можно после замены адресата дальше не
         *         проверять текст на поиск старого адресата;
         *
         *         boolean equals(Object other) - производит посимвольное сравнение строки this со строкой other с учетом
         *         регистра символов. Оператор == работает только на примитивные типы, ана сылочные типы
         *         работает equals;
         *
         *         boolean equalsIgnoreCase(String other) - производит посимвольное сравнение строки this со строкой other
         *         без учета регистра символов;
         *
         *         boolean regionMatches(int startIndex, String other, int otherStartIndex, int numChars) - сравнивает между
         *         собой два участка строк this и other с учетом регистра символов;
         *
         *         boolean regionMatches(boolean ignoreCase, int startIndex, String other, int otherStartIndex, int numChars)
         *         - сравнивает между собой два участка строк this и other без учетом регистра символов;
         */

/**
 *  Конкатенация строк
 *         Склеивание двух текстов: String s1 = "lang" + "uage"; /s1 = language;
 *         Склеивание строк и чисел:
 *         String s2 = 3 + " pigs"; // s2 = "3 pigs";
 *         String s3 = "result = " + 2 + 2; // s3 = "result = 22";
 *         String s4 = "result = " + (2 + 2); // s4 = "result = 4";
 *
 *                     Добавить к одной строке другую можно с помощью оператора "+="
 *                           String text = "Hello";
 *                                  text += ", Java!"; // text = "Hello, Java!"
 *
 *                     Никогда не делать так c типом String!!!
 *                     for(int i=0;i<10000;i++){
 *                           someString += someArray[i]; //10000 раз будет выделяться новая память под растущую строку
 *                     }
 *                     Для этого можно использовать изменяемый тип StringBuffer
 */

        System.out.println("Задача1. String не изменяемый");

        String text = "Первый текст"; // 1 ссылка (char [] n = {f, g,j,y,m....})
        text = "Второй текст";// 2 ссылка, 1 удаляется (в данном случает текс теряет ссылку на первый текст и место в памяти будет очищаться,
        // а в новом месте оперативной памяти, новвая ссылка повесися на этот текст)
        text = text + "третий текст"; // 3 ссылка, 2 удаляется
        System.out.println(text);

        System.out.println("Переворот текста. Папа! То программа выдаст !апаП");
        Scanner scanner = new Scanner(System.in); // сканер для считывания с клавиатуры

        System.out.println("Введите текст для переворота");
        String text1 = scanner.nextLine();

        System.out.println("Перевернутый текст");
        for (int i = text1.length() - 1; i >= 0; i--) {
//            char ch = text1.charAt(i);
//            System.out.print(ch);
            System.out.print(text1.charAt(i));

            /**
             * или решение через массив
             * Scanner scanner = new Scanner(System.in);
             * String str = scanner.nextLine();
             * char[] chars = str.toCharArray();
             * for (int i = chars.length-1; i >= 0 ;i--) {
             * System.out.print(chars[i]);
             * }
             */

        }
        System.out.println("Задача 3. Поиск и замена символов в тексте");
        String text2 = "Пои&ск и &заме&на симво&лов в тек&сте";
        // Замена одних символов на другие
        text2 = text2.replace("&", "*");
        text2 = text2.replace("&", " ");
        System.out.println(text2);

        System.out.println("Задача4. Проверка корректности введеного E-mail");
        System.out.println("Введите свой E-mail: ");
        String email = scanner.nextLine();
        // 1.Проверить наличие хотя бы одной @ или наличие более одной @
        int indexOfDog = email.indexOf("@"); //Усли не будет @ тогда -1, либо порядковый номер
        if (indexOfDog == -1) {
            System.out.println("E-mail не cодержит @");
            return;//выход из текущей задачи
        }
        // 2. Проверить наличие неболее одной @
        String[] partsByDog = email.split("@");
        if (partsByDog.length!=2){
            System.out.println("E-mail содержит более одной @");
            return;
        }
        //3. Название почты не могут начинаться и заканчиваться точками
        String partsBeforDog = partsByDog[0];
        String partsAfterDog = partsByDog[1];
        //методы startswith () и endsWith () возвращают true или false
        if (partsBeforDog.startsWith(".") || partsAfterDog.endsWith(".")){
            System.out.println("E-mail не корректный, тк начинается или заканчивается точкой.");
            return;
        }
        System.out.println("E-mail прошел проверку!");
    }
}


