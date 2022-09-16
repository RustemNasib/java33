package lesson_05;

import java.util.Scanner;

public class HomeWork_051 {
    public static void main(String[] args) {
        System.out.println("Задача 1. Расчет площади или периметра разных фигур.");
        System.out.println("Выберите фигуру: ");
        System.out.println("1 - Круг");
        System.out.println("2 - овал");
        System.out.println("3 - квадрат");
        System.out.println("4 - треугольник");
        System.out.println("5 - трапеция");

        Scanner scanner = new Scanner(System.in);
        int inputFigura = scanner.nextInt(); //Какая фигура

        System.out.println("Что посчитать: ");
        System.out.println("1 - площадь");
        System.out.println("2 - периметр ");
        int inputAction = scanner.nextInt(); //Что считаем

        switch (inputFigura){
            case 1: //круг

                break;
            case 2: //Овал

                break;
            case 3: //Квадрат
                System.out.println("Введите сторону квадрата: ");
                int inputSide = scanner.nextInt();
                if(inputAction == 1){
                    System.out.println("Площадь квадрата = " + inputSide*inputSide);
                }else if(inputAction == 2){
                    System.out.println("Периметр квадрата = " + inputSide*4);
                }else {
                    System.out.println("Такой цифры нет.");
                }
                break;
            case 4: //Треугольник

                break;
            case 5: //Трапеция

                break;
            default:
                System.out.println("Такой фигуры нет!");
        }

    }
}
