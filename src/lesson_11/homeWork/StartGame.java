package lesson_11.homeWork;

import java.util.Scanner;

public class StartGame {
    public static void main(String[] args) {


        //Создание игрового поля
        Saper saper = new Saper();

        // Уровень сложности игры (пользователь)
        System.out.println("Выберите уровень сложности: ");
        System.out.println("3 - Высокий ");
        System.out.println("2 - Средний ");
        System.out.println("1 - Низкий ");

        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();

        // раскладка рандомно бомб, в зависимости от уровня сложности
        saper.bombsRandom (level);

        // расстановка цифр (подсказок) для игрока
        saper.helpNumberPlace();

        // печать игрового поля на консоль
        saper.printPlayPlace();


        // создание циклов игры

        int move  = 1;
        while (move >= 1) { // если следующий ход
            System.out.println("Выберите координаты по оси Х от 1 до 10");
            int pointX = scanner.nextInt() - 1;// пользователь вводит число на -1, т.к. у нас отчет начинается с 0
            System.out.println("Выберите координаты по оси Y от 1 до 10");
            int pointY = scanner.nextInt() - 1;
            // проверка выхода за пределы поля, если игрок введет число больше 10
            if (pointX > 10 || pointY > 10 || pointX < 0 || pointY < 0) {
                System.out.println("Вы вышли за поля!");
                continue;
            }

            move = saper.pressurePointChek(pointY, pointX); //1 или 2 или -1 (проверка точки нажатия игрока)
            if (move == 2) {
                System.out.println("Вы уже вводили данные координаты. Введите координаты еще раз");
            } else if (move == 1) {
                saper.printPlayPlace();
                System.out.println("Следующий ход");
            } else if (move == -1) {
                saper.printLosePlace();
                System.out.println("Бомба!!! Вы проиграли!!!");
            } else {
                System.out.println("Поздравляю! Вы победили!");
            }
        }
        System.out.println();
    }
}