package lesson_03;

public class HomeWork_03 {
    public static void main(String[] args) {
        System.out.println("Задача 1. Посчитайте пример и проанализируйте порядок выполнения вычислений:" +
                " 5+3-2 " + " (5+3)-2 " + " 5+(3-2) ");
        int a= 5, b = 3, c= 2;
        System.out.println("Ответ: " + (a+b-c) + ((a+b-c) + a+ (b-c))); //6 + 6 + 6


        System.out.println("Задача 2. Выражения могут содержать несколько пар скобок. Посчитайте пример и " +
                "проанализируйте порядок выполнения вычислений: " + "(4+5*2)-0.5/(7-2)/(2+1+12)");
        System.out.println((4+5*2)-0.5/(7-2)/(2+1+12));// 14 - 0.1/15 (14-0.00666666667) = 13,993333333333334


        System.out.println("Задача 3. Выполните деление без остатка 10/3");
        double a3 = 10, b3 = 3;
        System.out.println("Ответ: " + a3 / b3);

        System.out.println("Задача 4. Объясните, что происходит в данном коде: ");
        char s = 'f';
        System.out.println(s);
        char s2 = (char) (((int) s) + 2);// прибавляем количество букв (2) в порядковом номере алфавитта (f+j = h)
        System.out.println(s2);

        System.out.println("Задача 5. Вычислите выражение в уме, а затем проверьте кодом и объясните результат.");
        int a1 = 3, b1 = 3;
        System.out.println(++a1);
        int prefix = 15 / 3 - ++a1; // итог prefix = ? (5 -4)
        int postfix = 15 / 3 - b1++; // итог postfix = ? (5 -3)
        System.out.println("prefix= " + prefix);
        System.out.println("postfix= " + postfix);


        System.out.println("Задача 6. Вычислите выражение в уме, а затем проверьте кодом и объясните результат.");
        int x = 999;
        int y = x++;
        System.out.println(y);// 999
        System.out.println(x);//1000

        System.out.println("Задача 7. Получите цифровые коды символов '&' и '|', найдите сумму кодов и выведите в консоль символ " +
                "по коду полученному в результате сложения.");
        char one = '&', two = '|';
        int one1 = (int)(one);
        System.out.println("Символ1 = " + one1);
        int two1 = (int)(two);
        System.out.println("Символ2 = " + two1);
        System.out.println("Сумма символов= " + (one1 + two1));

        System.out.println("Задача 8. Выполните деление по модулю 23 на 2. Объясните результат.");
        int first = 23;
        int second = 2;
        int result = first%second;
        System.out.println(result);// 22/2 +1

        System.out.println("Задача 9. Предположите, а затем выведите на консоль результаты логических выражений." +
                "После измените значения переменных наоборот и проанализируйте результаты.");
        int c1 = 4;
        int v = 5;
        boolean result1 = c1 == v;
        boolean result2 = c1 < v;
        boolean result3 = c1 <= v;
        boolean result4 = c1 != v;
        boolean result5 = c1 > v;
        boolean result6 = c1 >= v;
        boolean result7 = (c1 > v) || (c1 > v);
        boolean result8 = (c1 > 3) && (c1 < 6);
        System.out.println("c1 =4, v=5");
        System.out.println("c1 == v = "+ result1);
        System.out.println("c1 < v = "+ result2);
        System.out.println("c1 <= v = "+ result3);
        System.out.println("c1 != v = "+result4);
        System.out.println("c1 > v = "+result5);
        System.out.println("c1 >= v = "+result6);
        System.out.println("(c1 > v) || (c1 > v) = "+ result7);
        System.out.println("(c1 > 3) && (c1 < 6) = "+ result8);


    }
}
