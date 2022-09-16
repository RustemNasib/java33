package lesson_11;

import java.util.concurrent.ThreadLocalRandom;

public class SaperGame {
    //fields
    private int[][] mapGame = new int[10][10]; // игровое поле с бомбами скрытое
    private int[][] visibleMapGame = new int[10][10]; // игровое поле игрока

    // Constructors

    // Methods
    public void bombsByLevel(int level) {
        int countsBombs = 0;        // задаем изначально минимальное количество бомб (заданный level берем из кл. Start)
        if (level == 1) {
            countsBombs = 20;       // если уровень сложный, о количество бомб 20
        } else if (level == 2) {
            countsBombs = 15;       // если средний, то количество бомб 15
        } else {
            countsBombs = 10;       // иначе 10 бомб
        }
        for (int i = 0; i < countsBombs; i++) { // раскладываем рандомно бомбы через цикл
            this.addRandBomb();// указываем метод раскладки бомб, что бы бомбы рандомно не расставлялись друг на друга
        }

    }

    // 0 - закрытая ячейка, 1 - разминированная ячейка, -1 - бомба
    private void addRandBomb() {     // метод раскладки бомб (что бы бомбы рандомно не расставлялись друг на друга)
        int row = ThreadLocalRandom.current().nextInt(0, 10); // создаем переменную строки,
        // кладем на строку рандомно цифру в заданном диапазоне

        // ThreadLocalRandom - Метод генератор случайных чисел (с периодом 264), изолированный от текущего потока.
        // current().nextInt - возвращает объект ThreadLocalRandom текущего потока.


        int column = ThreadLocalRandom.current().nextInt(0, 10);// создаем переменную колонны

        // проверяем что там не лежит бомба
        if (mapGame[row][column] != -1) {
            mapGame[row][column] = -1;
        } else {          //Если на поле уже есть бомба, то выполни этот метод снова.
            this.addRandBomb();//рекурсия
        }

    }

    public void placeHelpNumberOnMap() {  // метод расстановки цифр (подсказок) для игрока
        //проходим массив
        for (int i = 0; i < mapGame.length; i++) {//строки
            for (int j = 0; j < mapGame[i].length; j++) {//колонки
                if (mapGame[i][j] == -1) { //если обнаружена бомба, то проходим вокруг бомбы (отшагиваем)
                    for (int k = i - 1; k <= i + 1; k++) { //строки вокруг бомбы
                        for (int l = j - 1; l <= j + 1; l++) {// колонки вокруг бомбы
                            if ((k >= 0 && k < mapGame.length) && (l >= 0 && l < mapGame[i].length) && (mapGame[k][l] != -1)) {
                                // если строки и колонки находятся внутри поля и если на поле не лежит бомба
                                mapGame[k][l]++;

                            }
                        }
                    }
                }
            }

        }
    }


    // метод печати игрового поля на консоль
    public void printMapGame() {
        // проходим по массиву игрового поля
        for (int i = 0; i < mapGame.length; i++) {
            for (int j = 0; j < mapGame[i].length; j++) {
                // проверяем, какие уже нажимались поля, а какие - нет
                // 0 - закрытая ячейка, 1 - разминированная ячейка, -1 - бомба
                if (visibleMapGame[i][j] == 1) { // если на открытом игровом поле уже разминированная ячейка
                    if (mapGame[i][j] == 0) { // если на заминированном поле закрытая ячейка
                        System.out.print("  "); // то печатать пробел
                    } else if (mapGame[i][j] == -1) { // если на заминированном поле бомба
                        System.out.print("БАХ");// то печатать БАХ
                    } else {
                        System.out.print(" " + mapGame[i][j] + " ");
                    }
                } else {
                    System.out.print(" * "); // печать изначального вида ячеек
                }
            }
            System.out.println();
        }

    }

    // 0 - закрытая ячейка, 1 - разминированная ячейка, -1 - бомба
    // метод проверки точки нажатия игрока
    public int checkPointPlayers(int pointX, int pointY) {
        if (pointX > 10 || pointY > 10 || pointX < 0 || pointY < 0) { // эту проверку на размер поля можно пропустить, тк уже проверяли в другом методе
            return 1;// 1 - "Следующий ход" (check=1)

        } else if (visibleMapGame[pointX][pointY] == 1) {
            return 2; //2 - "Вы уже вводили данные координаты. Введите координаты еще раз" (check=2)
        }
        visibleMapGame[pointX][pointY] = 1;

        // делаем проверку на скрытые бомбы

        if (mapGame[pointX][pointY] == -1) {
            return -1;//  "Бомба!!! Вы проиграли!!!" (check=-1)
        } else if (mapGame[pointX][pointY] > 0) { // цифра с подсказкой
            return checkVictoryGame();// возвращаем цифру подсказку из метода и проверяем на победу (успешный ход)
        } else {
            this.checkZeroOnMapGame(pointX, pointY);//возвращаем пустые ячейки из метода вокруг заминированной ячейки
            return checkVictoryGame();//Проверка на победу
        }
    }


    //метод проверки успешного хода
    private int checkVictoryGame() {
        int check = 0;
        // проходим по игровому полю
        for (int i = 0; i < visibleMapGame.length; i++) {
            for (int j = 0; j < visibleMapGame[i].length; j++) {
                if (visibleMapGame[i][j] == 0 && mapGame[i][j] != -1) { // если нет бомбы
                    check = 1;//делаем следующий ход
                    break; //следующий цикл крутить не нужно
                }

            }
        }
        return check;
    }

    //метод открытия пустых ячеек вокруг заминированной ячейки
    private void checkZeroOnMapGame(int pointX, int pointY) {
        visibleMapGame[pointX][pointY] = 1; // отмечаем, что ячейка уже открыта
        // проходим вокруг ячеек отшагивая на 1 шаг назад
        for (int i = pointX - 1; i <= pointX; i++) { // по строкам
            for (int j = pointY - 1; j <= pointY; j++) { // по столбикам
                // если не заходит за пределы границ
                if ((i >= 0 && i < mapGame.length) && (j >= 0 && j < mapGame[i].length) && (mapGame[i][j] >= 0)) {
                    if (mapGame[i][j] == 0 && visibleMapGame[i][j] == 0) { // если существует синхронность по карте
                        this.checkZeroOnMapGame(i, j); // тогда рекурсией вызываем метод внутри себя
                    } else {
                        visibleMapGame[i][j] = 1;// иначе на визуальном игровом поле уже открытая ячейка
                    }


                }

            }
        }
    }

}
