package lesson_07;

public class String_methods_2 {
    public static void main(String[] args) {
        System.out.println("Методы equals() и equalsIgnoreCase");
        String text1 = "Java";
        String text2 = "Java";
        String text3 = "JAVA";
//        boolean b = text1.equals(text2);// true
//        System.out.println(b);
        System.out.println(text1.equals(text2));// true
        System.out.println(text1.equals(text3));// false
        System.out.println(text1.equalsIgnoreCase(text3));// true (регистр игнорируется)
        System.out.println(text1 == text2);//true
        System.out.println(text1 == text3);//false

        System.out.println("\nМетод regionMatches (int startIndex, String other, int otherStartIndex, int numChars) - " +
                "сравнивает между собой два участка строк this и other с учетом регистра символов");
        String text4 = "Hello Java!";
        String text5 = "Java Hello!";
        System.out.println("Результат: " + text4.regionMatches(0, text5, 5, 5));

        System.out.println("\nМетод indexOf(int ch) возвращает индекс первого вхождения в строку символа ch");
        String str = "Java";
        System.out.println("Результат: " + str.indexOf('a'));//1

        System.out.println("\nМетод lastIndexOf(int ch) возвращает индекс последнего вхождения в строку символа ch");
        System.out.println("Результат: " + str.lastIndexOf('a'));//3

        System.out.println("\nМетод substring(int beginIndex) - создает новую строку с указанной позиции ");
        String str2 = "This lesson explains class String";
        System.out.println("Результат: " + str2.substring(5));//lesson explains class String
        System.out.println("Результат: " + str2.substring(5, 11));//lesson


        System.out.println("\nЗадача 1. Из строки  Алгоритмы+Данные=Программы получить строку Алгоритмы=Программы-Данные");
        String sourse = "Алгоритмы+Данные=Программы";

        int p1 = sourse.indexOf('+');
        int p2 = sourse.indexOf('=');
        String alg = sourse.substring(0, p1);
        String dat = sourse.substring(p1 + 1, p2);
        String prg = sourse.substring(p2 + 1);
        String target = alg + "=" + prg + "-" + dat;
        System.out.println("Дано"+ sourse);
        System.out.println("Результат: " + target);

        System.out.println("или с помощью метода replace");
        System.out.println(sourse.replace("Алгоритмы+Данные=Программы", "Алгоритмы=Программы-Данные"));

        System.out.println("\nЗадача 2. Из строки получить все гласные буквы и сохранить их в массив");
        String str3 = "Some text in  English";
        int countGlass = 0; //количество гласных
        for (char ch : str3.toCharArray()) {//преобразуем стринги в массив символов,
            // из которых в результате прохода буквы будут премещяться в переменную ch
            if (ch == 'a' || ch == 'e' || ch == 'y' || ch == 'u' || ch == 'o' || ch == 'i' ||
                    ch == 'A' || ch == 'E' || ch == 'Y' || ch == 'U' || ch == 'O' || ch == 'I') {
                countGlass++;
            }
        }
char[]glassChar = new char[countGlass]; //создаем массив гласных
        int currentIndex = 0;
        for (char ch : str3.toCharArray()) {//преобразуем стринги в массив символов,
            // из которых в результате прохода буквы будут премещяться в переменную ch
            if (ch == 'a' || ch == 'e' || ch == 'y' || ch == 'u' || ch == 'o' || ch == 'i' ||
                    ch == 'A' || ch == 'E' || ch == 'Y' || ch == 'U' || ch == 'O' || ch == 'I') {

                glassChar[currentIndex] = ch;//наполняем в массив символы
                currentIndex++;

            }
        }
        System.out.println("Результат: " + glassChar);

        }
}
