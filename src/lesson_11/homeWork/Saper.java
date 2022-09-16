package lesson_11.homeWork;

import java.util.concurrent.ThreadLocalRandom;

public class Saper {

    // fields
    private int[][] playingField = new int[10][10]; // игровое поле игрока
    private int[][] hiddenPlayingField = new int[10][10]; // игровое поле с бомбами скрытое


//constructors

    // methods
    public void bombsRandom(int level) {
        int bombs = 0;        // задаем изначально минимальное количество бомб
        if (level == 1) {
            bombs = 5;       // если уровень легкий, о количество бомб 5
        } else if (level == 2) {
            bombs = 10;       // если средний, то количество бомб 10
        } else {
            bombs = 15;       // иначе 15 бомб
        }
        for (int i = 0; i < bombs; i++) { // раскладываем рандомно бомбы через цикл
            this.addBomb();// указываем метод раскладки бомб, что бы бомбы рандомно не расставлялись друг на друга
        }

    }

    // 0 - закрытая ячейка, 1 - разминированная ячейка, -1 - бомба
    private void addBomb() {     // метод раскладки бомб (что бы бомбы рандомно не расставлялись друг на друга)
        int row = ThreadLocalRandom.current().nextInt(0, 10); // создаем переменную строки,
        // кладем на строку рандомно цифру в заданном диапазоне

        // ThreadLocalRandom - Метод генератор случайных чисел (с периодом 264), изолированный от текущего потока.
        // current().nextInt - возвращает объект ThreadLocalRandom текущего потока.


        int column = ThreadLocalRandom.current().nextInt(0, 10);// создаем переменную колонны

        // проверяем что там не лежит бомба
        if (hiddenPlayingField[row][column] != -1) {
            hiddenPlayingField[row][column] = -1;
        } else {          //Если на поле уже есть бомба, то выполни этот метод снова.
            this.addBomb();//рекурсия
        }

    }

    public void helpNumberPlace() {  // метод расстановки цифр (подсказок) для игрока
        //проходим массив
        for (int i = 0; i < hiddenPlayingField.length; i++) {//строки
            for (int j = 0; j < hiddenPlayingField[i].length; j++) {//колонки
                if (hiddenPlayingField[i][j] == -1) { //если обнаружена бомба, то проходим вокруг бомбы (отшагиваем)
                    for (int k = i - 1; k <= i + 1; k++) { //строки вокруг бомбы
                        for (int l = j - 1; l <= j + 1; l++) {// колонки вокруг бомбы
                            if ((k >= 0 && k < hiddenPlayingField.length) && (l >= 0 && l < hiddenPlayingField[i].length) && (hiddenPlayingField[k][l] != -1)) {
                                // если строки и колонки находятся внутри поля и если на поле не лежит бомба
                                hiddenPlayingField[k][l]++;

                            }
                        }
                    }
                }
            }

        }
    }


    // метод печати игрового поля на консоль
    public void printPlayPlace() {
        // проходим по массиву игрового поля
        for (int i = 0; i < hiddenPlayingField.length; i++) {
            for (int j = 0; j < hiddenPlayingField[i].length; j++) {

                if (playingField[i][j] == 1) { // если на открытом игровом поле уже разминированная ячейка
                    if (hiddenPlayingField[i][j] == 0) { // если на заминированном поле закрытая ячейка
                        System.out.print("  "); // то печатать пробел
                    } else if (hiddenPlayingField[i][j] == -1) { // если на заминированном поле бомба

                        System.out.print("БАХ");// то печатать БАХ

                    } else {
                        System.out.print(" " + hiddenPlayingField[i][j] + " ");
                    }

                    } else {
                        System.out.print(" * "); // печать изначального вида ячеек
                    }
                }
                System.out.println();
            }

        }

public void printLosePlace () {
    for (int i = 0; i < hiddenPlayingField.length; i++) {
        for (int j = 0; j < hiddenPlayingField[i].length; j++) {

            if (playingField[i][j] == 1) { // если на открытом игровом поле уже разминированная ячейка
                if (hiddenPlayingField[i][j] == 0) { // если на заминированном поле закрытая ячейка
                    System.out.print("  "); // то печатать пробел
                } else if (hiddenPlayingField[i][j] == -1) { // если на заминированном поле бомба

                    System.out.print("БАХ");// то печатать БАХ

                } else {
                    System.out.print(" " + hiddenPlayingField[i][j] + " ");
                }
            } else {
                if (hiddenPlayingField[i][j] == -1) {
                    System.out.print("БАХ");
                } else {
                    System.out.print(" * "); // печать изначального вида ячеек
                }
            }
        }
        System.out.println();
    }
}





    // 0 - закрытая ячейка, 1 - разминированная ячейка, -1 - бомба
    // метод проверки точки нажатия игрока
    public int pressurePointChek(int pointY, int pointX) {
        if (pointX > 10 || pointY > 10 || pointX < 0 || pointY < 0) { // эту проверку на размер поля можно пропустить, тк уже проверяли в другом методе
            return 1;// 1 - "Следующий ход" (check=1)

        } else if (playingField[pointX][pointY] == 1) {
            return 2; //2 - "Вы уже вводили данные координаты. Введите координаты еще раз" (check=2)
        }
        playingField[pointX][pointY] = 1;

        // делаем проверку на скрытые бомбы

        if (hiddenPlayingField[pointX][pointY] == -1) {
            return -1;//  "Бомба!!! Вы проиграли!!!" (check=-1)
        } else if (hiddenPlayingField[pointX][pointY] > 0) { // цифра с подсказкой
            return checkSuccesMove();// возвращаем цифру подсказку из метода и проверяем на победу (успешный ход)
        } else {
            this.checkEmptyCells(pointX, pointY);//возвращаем пустые ячейки из метода вокруг заминированной ячейки
            return checkSuccesMove();//Проверка на победу
        }
    }


    //метод проверки успешного хода
    private int checkSuccesMove() {
        int check = 0;
        // проходим по игровому полю
        for (int i = 0; i < playingField.length; i++) {
            for (int j = 0; j < playingField[i].length; j++) {
                if (playingField[i][j] == 0 && hiddenPlayingField[i][j] != -1) { // если нет бомбы
                    check = 1;//делаем следующий ход
                    break; //следующий цикл крутить не нужно
                }

            }
        }
        return check;
    }


    //метод открытия пустых ячеек вокруг заминированной ячейки
    private void checkEmptyCells(int pointX, int pointY) {
        playingField[pointX][pointY] = 1; // отмечаем, что ячейка уже открыта
        // проходим вокруг ячеек отшагивая на 1 шаг назад
        for (int i = pointX - 1; i <= pointX; i++) { // по строкам
            for (int j = pointY - 1; j <= pointY; j++) { // по столбикам
                // если не заходит за пределы границ
                if ((i >= 0 && i < hiddenPlayingField.length) && (j >= 0 && j < hiddenPlayingField[i].length) && (hiddenPlayingField[i][j] >= 0)) {
                    if (hiddenPlayingField[i][j] == 0 && playingField[i][j] == 0) { // если существует синхронность по карте
                        this.checkEmptyCells(i, j); // тогда рекурсией вызываем метод внутри себя
                    } else {
                        playingField[i][j] = 1;// иначе на визуальном игровом поле уже открытая ячейка
                    }


                }

            }
        }
    }
}