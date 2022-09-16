package lesson_04;

import java.util.Scanner;

public class HomeWork_04 {
    public static void main(String[] args) throws InterruptedException {
        // Задача 1. Вывести на консоль числа от 0 до 20
        System.out.println("Задача 1. Вывести на консоль числа от 0 до 20");
        int a;
        for (a = 0; a < 21; a++) {
            System.out.print(a + ", ");
        }
        System.out.println();
        // Задача 2. Вывести на консоль числа от -20 до 20
        System.out.println("\nЗадача 2. Вывести на консоль числа от -20 до 20");
        int b;
        for (b = -20; b <= 20; b++) {
            System.out.print(b + ", ");
        }
        System.out.println();
        // Задача 3. Вывести на консоль числа от 20 до 0
        System.out.println("\nЗадача 3. Вывести на консоль числа от 20 до 0");
        int c;
        for (c = 20; c > -1; c--)
            System.out.print(c + ", ");

        System.out.println();
        // Задача 4. Вывести на консоль числа от 20 до -20
        System.out.println("\nЗадача 4. Вывести на консоль числа от 20 до -20");
        int d;
        for (d = 20; d > -21; d--)
            System.out.print(d + ", ");

        System.out.println();
        // Задача 5. Вывести на консоль числа от -20 до 0
        System.out.println("\n Задача 5. Вывести на консоль числа от -20 до 0");
        int e;
        for (e = -20; e < 1; e++)
            System.out.print(e + ", ");

        System.out.println();
        // Задача 6. Вывести на консоль нечетные числа от 0 до 20
        System.out.println("\nЗадача 6. Вывести на консоль нечетные числа от 0 до 20");
        int f;
        for (f = 0; f < 21; f++) {
            if (f % 2 == 1) {
                System.out.print(f + ", ");
            }
        }
        System.out.println();
        // Задача 7. Вывести на консоль нечетные числа от 20 до 0
        System.out.println("\nЗадача 7. Вывести на консоль нечетные числа от 20 до 0");
        int g;
        for (g = 20; g > 0; g--) {
            if (g % 2 != 0) {
                System.out.print(g + ", ");
            }
        }
        System.out.println();
        // Задача 8. Вывести на консоль четные числа от 0 до 20
        System.out.println("\nЗадача 8. Вывести на консоль четные числа от 0 до 20");
        int h;
        for (h = 0; h <= 20; h++) {
            if (h % 2 == 0) {
                System.out.print(h + ", ");
            }
        }
        System.out.println();
        // Задача 9. Вывести на консоль четные числа от 20 до 0
        System.out.println("\nЗадача 9. Вывести на консоль четные числа от 20 до 0");
        int i;
        for (i = 20; i > -1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        // Задача 10. Вывести на консоль числа от 10 до 40, пропустив диапазон от 15 до 20
        System.out.println("\n Задача 10. Вывести на консоль числа от 10 до 40, пропустив диапазон от 15 до 20");
        int j;
        for (j = 10; j <= 40; j++) {
            if (j < 15 || j > 20) {
                System.out.print(j + ", ");
            }
        }

        System.out.println();
        //Задача 11. Вывести на консоль числа от 40 до -40, пропустив диапазон от 20 до -20"
        System.out.println("\n Задача 11. Вывести на консоль числа от 40 до -40, пропустив диапазон от 20 до -20");
        int k;
        for (k = 40; k > -41; k--) {
            if (k > 20 || k < -20) {
                System.out.print(k + ", ");
            }
        }
        System.out.println();
        //Задача 12. Вывести на консоль сумму четных чисел от 10 до 50
        System.out.println("\n Задача 12. Вывести на консоль сумму четных чисел от 10 до 50");
        int l;
        int sum = 0;
        for (l = 10; l <= 50; l++) {
            if (l % 2 == 0) {
                sum += l;
            }
        }
        System.out.print("Сумма четных чисел от 10 до 50 = " + sum);

        System.out.println();
        //Задача 13. Вывести на консоль сумму четных чисел от 10 до 50, пропустив диапазон от 15 до 20
        System.out.println("\n Задача 13. Вывести на консоль сумму четных чисел от 10 до 50, пропустив диапазон от 15 до 20");
        int m;
        int sum1 = 0;
        for (m = 10; m <= 50; m++) {
            if (m % 2 == 0) {
            } else if (m < 15 || m > 20) {
                sum1 += m;
            }
        }
        System.out.print("Сумма четных чисел от 10 до 50, за исключением диапазона 15-20 = " + sum1);

        System.out.println();
        //Задача 14. В банке в зависимости от суммы вклада начисляемый процент по вкладу может отличаться.
        // Напишите консольную программу, где если сумма вклада меньше 100, то начисляется 5%.
        // Если сумма вклада от 100 до 200, то начисляется 7%.
        // Если сумма вклада больше 200, то начисляется 10%.
        // В конце программа должна выводить сумму вклада с начисленными процентами.

        System.out.println("\nЗадача 14. Вывести сумму вклада с начисленными процентами");
        Scanner scan = new Scanner(System.in);
        System.out.println("Какую сумму Вы планируете положить на годовой депозитарий?");
        double money = scan.nextInt();
        if (money <=100) {
            System.out.println("Вы сможете получить через год: " + (money + (money / 100) * 5));
        }
        else if (money > 100 & money < 200) {
            System.out.println("Вы сможете получить через год: " + (money + (money / 100) * 7));
        }
        else if (money > 200) {
                    System.out.println("Вы сможете получить через год: " + (money + (money / 100) * 10));
                }



        System.out.println();
        //Задача 15. Напишите программу на Java, которая принимает три числа и печатает «Все числа равны»,
        // если все три числа равны, «Все числа различны», если все три числа различны, и «Ни все не равны
        // или различны» в противном случае.
        System.out.println("\nЗадача 15. Написать программу по приему-выводу трех чисел");

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Введите три числа");
//        int a1 = scanner.nextInt();

//        int b1 = scanner.nextInt();

//        int c1 = scanner.nextInt();

        System.out.println("Введите первое число");
        int a1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int b1 = scanner.nextInt();
        System.out.println("Введите третье число");
        int c1 = scanner.nextInt();

        if (a1 == b1 & a1 == c1 & b1 == c1) {
            System.out.println("Все числа равны");
        } else if (a1 != b1 & a1 != c1 & b1 != c1) {
            System.out.println("Все числа различны");
        } else {
            System.out.println("Не все числа равны");

        }
    }
}




