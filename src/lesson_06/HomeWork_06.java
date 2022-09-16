package lesson_06;

import java.util.Arrays;

public class HomeWork_06 {
    public static void main(String[] args) {
        System.out.println("Задача 1. В Java charAt() возвращает символ из массива строки по указанному индексу.\n" +
                "Создайте переменную String со значением = (Главное ни когда не унывай и помни что ты: )/n"
                + "После выведи на консоль символы по индексу 0, 6, 8, 9, 25");


        String text = "Главное ни когда не унывай и помни что ты: )";

        System.out.print(text.charAt(0));
        System.out.print(text.charAt(6));
        System.out.print(text.charAt(8));
        System.out.print(text.charAt(9));
        System.out.print(text.charAt(25));


        System.out.println("\n Задача 2. В Java compareTo() получает значение 0, если аргумент является строкой\n" +
                " лексически равной данной строке; значение меньше 0, если аргумент является строкой лексически\n" +
                " большей, чем сравниваемая строка; и значение больше 0, если аргумент является строкой лексически\n" +
                " меньшей этой строки. Проанализируйте код ниже, предположите результат и выведите на консоль\n " +
                "для сравнения. Создайте свой вариант.\n" +
                "Подумайте и проверьте как работает в Java compareToIgnoreCase()?");
        String str1 = "Я буду хорошим программистом!";
        String str2 = "Я буду хорошим программистом!";
        String str3 = "Я буду хорошим дворником!";

        int result = str1.compareTo(str2);
        System.out.println("строка аргумента равна данной строке: " + result);

        int result1 = str2.compareTo(str3);
        System.out.println("строка аргумента меньше данной строки: " + result1);

        int result2 = str3.compareTo(str1);
        System.out.println("строка аргумента больше данной строки: " + result2);

        String text1 = "Это первая строка";
        String text2 = "Это вторая строка";
        String text3 = "Это третьяяяя строка";
        System.out.println(text1.compareTo(text2));// (13)Количество символов в 1 и 2 строке по отдельности
        System.out.println(text1.compareTo(text3));// (-3)Количество символов 1-3 строка
        System.out.println(text3.compareTo(text1));// (3)Количество символов 3-1 строка

// с помощью метода compareToIgnoreCase()
        System.out.println();
        String tex1 = "Это первая строка";
        String tex2 = "Это вторая строка";
        String tex3 = "Это третьяяяя строка";
        System.out.println("Результат: " + tex1.compareToIgnoreCase(tex2));//  Количество символов в 1 и 2 строке по отдельности
        System.out.println("Результат: " + tex1.compareToIgnoreCase(tex3));//  Количество символов 1-3 строка
        System.out.println("Результат: " + tex3.compareToIgnoreCase(tex1));//  Количество символов 3-1 строка

        System.out.println("\nЗадача 3. В Java concat() возвращает строку, представляющую собой результат объединения\n" +
                " символов этого объекта, за которым следует аргумент строки символов. \n" +
                "Создайте String переменную со значением = (Я уже программист )\n" +
                "С помощью метода concat() добавьте к предложению слово (JAVA!).\n" +
                "Чтобы получилось: Я уже программист JAVA!");
        String text4 = "Я уже программист ";
        System.out.println();
        System.out.println("Результат: " + text4.concat("Java"));//Я уже программист java


        System.out.println("\nЗадача 4. В Java contentEquals() возвращает значение true только в том случае, если \n" +
                "эта строка представляет собой ту же последовательность символов\n" +
                " как указано в строке буфера (StringBuffer), в противном случае возвращается false.\n" +
                "Проанализируйте следующий код. Попробуйте написать свой вариант");
        String str01 = "Добро пожаловать в JAVA";
        String str02 = "Курс изучения программирования";
        StringBuffer str03 = new StringBuffer("Добро пожаловать в JAVA");
        StringBuffer str04 = new StringBuffer("Добро пожаловать");

        boolean result3 = str01.contentEquals(str03);
        System.out.println("Строка \"Добро пожаловать в JAVA\" равна строке буфера \"Добро пожаловать в JAVA\"? \n" + result3);

        result3 = str02.contentEquals(str03);
        System.out.println("Строка \"Курс изучения программирования\" равна строке буфера \"Добро пожаловать в JAVA\"? \n" + result3);

        result3 = str01.contentEquals(str04);
        System.out.println("Строка \"Добро пожаловать в JAVA\" равна строке буфера \"Добро пожаловать\"? \n" + result3);


        System.out.println("\nЗадача 5. Метод copyValueOf() в Java имеет две различные формы:\n" +
                "   String copyValueOf(char[] data) — возвращает строку, которая представляет собой последовательность \n" +
                "символов в заданном массиве.\n" +
                "   String copyValueOf(char[] data, int offset, int count) — возвращает строку, которая представляет собой\n" +
                "последовательность символов в заданном массиве.\n   Проанализируйте пример и сделайте свой вариант.");
        //Пример
        char[] strr1 = {'П', 'р', 'и', 'в', 'е', 'т', ' ', 'м', 'и', 'р'};
        String strr2 = "";

        strr2 = strr2.copyValueOf(strr1);
        System.out.println("Возвращаемая строка: " + strr2);

        strr2 = strr2.copyValueOf(strr1, 7, 3);
        System.out.println("Возвращаемая строка: " + strr2);

        char[] Str3 = {'П', 'р', 'и', 'в', 'е', 'т', ',', ' ', 'Р', 'у', 'с', 'т', 'е', 'м'};
        String Str4 = "";

        System.out.println("\n Свой вариант");
        Str4 = Str4.copyValueOf(Str3);
        System.out.println("Возвращаемая строка: " + Str4);

        Str4 = Str4.copyValueOf(Str3, 8, 6);
        System.out.println("Возвращаемая строка: " + Str4);


        System.out.println("\nЗадача 6. Нахождение максимального элемента в массиве myArray из 4 элементов типа double.");
        double[] myArray = {11, 5.8, 11.1, 10.9};
        System.out.println("Результат: " + Arrays.stream(myArray).max());//11.1


        System.out.println("\nЗадача 7. Нахождение минимального элемента в массиве myArray из 4 элементов типа double.");
        double[] myArray1 = {11, 5.8, 11.1, 10.9};
        System.out.println("Результат: " + Arrays.stream(myArray1).min());//5.8


        System.out.println("\nЗадача 8. Получение суммы элементов в массиве myList из 5 элементов типа double циклом for each.");
        double[] myList = {2.5, 1.8, 1.3, 6.5, 22.8};
        double result4 = 0;
        for (double elements : myList) {
            result4 += elements;
            System.out.println("Сумма элементов = " + result4);//34.9
        }
        System.out.println("\n Или решение с помощью метода: ");// или решение с помощью метода
        System.out.println("Сумма элементов = " + Arrays.stream(myList).sum());//34.900000000000006


        System.out.println("\nЗадача 9.  Вывод элементов массива с четным и нечетным индексом");
        double[] myList2 = {11.5, 1.9, 5.32, 8.8, 15.8};
        // Вывод элементов массива с четным индексом на экран.
        //ваш код
        for (int i = 0; i < myList2.length; i++) {
            if (i % 2 == 0) {
                System.out.print("Четный индекс: " + "индекс " + i + " = " + myList2[i] + ", ");
            }
        }
        // Вывод элементов массива с нечетным индексом на экран.
        for (int j = 0; j < myList2.length; j++) {
            if (j % 2 != 0) {
                System.out.print("\nНечетный индекс: " + "индекс " + j + " = " + myList2[j] + ", ");
            }
        }
    }
}




