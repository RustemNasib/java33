package lesson_05;

import java.util.Scanner;

public class Scanner_System_in {
    public static void main(String[] args) {
        System.out.println(" Задача1. Депозит в банке размещен под проценты на период. " +
                "Показать ежемесячное начисление проценов и сколько будет денег в конце периода" );
        //double money = 100000;
        //double percent = 9;
//        int year = 6;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму депозита: ");
        double money = scanner.nextDouble();
        System.out.println("Введите годовой процент: ");
       int percent = scanner.nextInt();

        System.out.println("Введите количество лет: ");
        int year = scanner.nextInt();

        //решение
        for (int i=1;i<=year; i++){ //цикл равен году
            for (int j = 1; j<=12;j++){// цикл равен 1 месяцу
                money  +=money/100 * (percent/12); // money = money+money/100 * (percent/12)
                System.out.println("Год: "+i+ ". Месяц "+ j + ": "+ (int)money + " руб. ");
            }
        }
        System.out.println("\nЧерез "+ year+ " лет у нас будет: "+ (int) money + " руб. ");

    }


}
