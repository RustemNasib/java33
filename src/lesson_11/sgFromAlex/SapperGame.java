package lesson_11.sgFromAlex;

import java.util.concurrent.ThreadLocalRandom;

public class SapperGame {
    //1. Создадим класс SapperGame
    //2. Создадим двумерный массив для игры 10 на 10
    private int[][] mapGame = new int[10][10];
    //3. Создадим двумерный массив для вывода игрокам 10 на 10
    private int[][] visibleMapGame = new int[10][10];

    //7. class SapperGame - Реализуем метод bombsByLevel
    public void bombsByLevel(int level) {
        //Выбор количества бомб
        int countBombs = 0;
        if (level == 1) {
            countBombs = 20;
        } else if (level == 2) {
            countBombs = 15;
        } else {
            countBombs = 10;
        }
        //Запустим генерацию случайной расстановки заданного количество бомб
        for (int i = 0; i < countBombs; i++) {
            this.addRandBomb();
        }
    }

    //8. class SapperGame - Реализуем метод addRandomBomb()
    private void addRandBomb() {
        int row = ThreadLocalRandom.current().nextInt(0, 10);
        int column = ThreadLocalRandom.current().nextInt(0, 10);
        if (mapGame[row][column] != -1) {
            mapGame[row][column] = -1;
        } else {
            this.addRandBomb(); //рекурсия
        }
    }

    //10. class SapperGame - Реализуем метод placeHelpNumberOnMap()
    public void placeHelpNumberOnMap() {
        for (int i = 0; i < mapGame.length; i++) { //Проходим по каждой строке
            for (int j = 0; j < mapGame[i].length; j++) { //Проходим по каждой колонке каждой строки
                if (mapGame[i][j] == -1) { //Если найдена бомба
                    for (int k = i - 1; k <= i + 1; k++) { //Проходим над текущей, по текущей и под текущей строкой
                        for (int l = j - 1; l <= j + 1; l++) { //Проходим перед текущей, по текущей и после текущей колонки
                            if ((k >= 0 && k < mapGame.length) && (l >= 0 && l < mapGame[i].length) && (mapGame[k][l] != -1)) {
                                mapGame[k][l]++;
                            }
                        }
                    }
                }
            }

        }
    }

    //12. class SapperGame - Реализуем метод printMapGame()
    public void printMapGame() {
        for (int i = 0; i < mapGame.length; i++) { //Проходим по каждой строке
            for (int j = 0; j < mapGame[i].length; j++) { //Проходим по каждой колонке каждой строки
                if (visibleMapGame[i][j] == 1) { //проверяем на видимом поле для игрока отметки 1 хода игры
                    if (mapGame[i][j] == 0) {
                        System.out.print("   "); //если отметка 1 уже есть, тогда печатаем значение mapGame
                    } else if (mapGame[i][j] == -1) {
                        System.out.print("БАХ"); //если отметка 1 уже есть, тогда печатаем значение mapGame
                    } else {
                        System.out.print(" " + mapGame[i][j] + " "); //если отметка 1 уже есть, тогда печатаем значение mapGame
                    }

                } else {
                    System.out.print(" * "); //если отметки 1 еще нет, тогда печатаем *
                }
            }
            System.out.println();
        }
    }

    public int checkPointPlayers(int pointY, int pointX) {
        if (pointX > 10 || pointY > 10 || pointX < 0 || pointY < 0) {
            return 1;                   //1 - "Следующий ход" (check=1)
        } else if (visibleMapGame[pointX][pointY] == 1) {
            return 2;                   //2 - "Вы уже вводили данные координаты. Введите координаты еще раз" (check=2)
        }
        visibleMapGame[pointX][pointY] = 1; //Отмечаем поле на видимом массиве как открытое

        if (mapGame[pointX][pointY] == -1) { //Проверка на скрытом поле бомбу
            return -1;                  //3 - "Бомба!!! Вы проиграли!!!" (check=-1)
        } else if (mapGame[pointX][pointY] > 0) { //Проверка на раннее расставленные цифры
            return checkVictoryGame(); //Проверка на победу - Если поле не открытое и без бомбы, вернуть 1
        } else {
            this.checkZeroOnMapGame(pointX, pointY); //Проверка на свободные ячейки от бомб и цифр
            return checkVictoryGame(); //Проверка на победу
        }
    }

    private void checkZeroOnMapGame(int pointX, int pointY) {
        visibleMapGame[pointX][pointY] = 1; ////Отмечаем поле на видимом массиве как открытое
        for (int i = pointX - 1; i <= pointX; i++) {
            for (int j = pointY - 1; j <= pointY; j++) {
                if ((i >= 0 && i < mapGame.length) && (j >= 0 && j < mapGame[i].length) && (mapGame[i][j] >= 0)) {
                    if (mapGame[i][j] == 0 && visibleMapGame[i][j] == 0) {
                        this.checkZeroOnMapGame(i, j);
                    } else {
                        visibleMapGame[i][j] = 1;
                    }
                }
            }
        }
    }

    private int checkVictoryGame() { //Проверка на победу - Если поле не открытое и без бомбы, вернуть 1
        int check = 0;
        for (int i = 0; i < visibleMapGame.length; i++) {
            for (int j = 0; j < visibleMapGame[i].length; j++) {
                if (visibleMapGame[i][j] == 0 && mapGame[i][j] != -1) { //Если поле не открытое и без бомбы
                    check = 1;
                    break;
                }
            }

        }
        return check;
    }

    public void printMapGameOver() {
        for (int i = 0; i < mapGame.length; i++) { //Проходим по каждой строке
            for (int j = 0; j < mapGame[i].length; j++) { //Проходим по каждой колонке каждой строки
                if (visibleMapGame[i][j] == 1) {
                    if (mapGame[i][j] == 0) {
                        System.out.print("   "); //если отметка 1 уже есть, тогда печатаем значение mapGame
                    } else if (mapGame[i][j] == -1) {
                        System.out.print("БАХ"); //если отметка 1 уже есть, тогда печатаем значение mapGame
                    } else {
                        System.out.print(" " + mapGame[i][j] + " "); //если отметка 1 уже есть, тогда печатаем значение mapGame
                    }

                } else {
                    if (mapGame[i][j] == -1) {
                        System.out.print("БАХ");
                    } else {
                        System.out.print(" * ");
                    }
                }
            }
            System.out.println();
        }
    }
}
