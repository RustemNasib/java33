package lesson_11;

import java.util.Scanner;

public class StartS {
    public static void main(String[] args) {
        //1. создание игрового поля
        SaperGame saperGame = new SaperGame();

        // 2. Спросим у пользователя уровень сложности игры
        System.out.println("Выберите уровень сложности: ");
        System.out.println("1 - Высокий ");
        System.out.println("2 - Средний ");
        System.out.println("3 - Низкий ");

        Scanner scanner = new Scanner(System.in);// вызываем сканер (внутри обращаемся к системе и просим считать введенный код)
        int level = scanner.nextInt(); // ловим введенную цифру

        // 0 - закрытая ячейка, 1 - разминированная ячейка, -1 - бомба

        // на поле mapGame разложили рандомно бомбы в зависимости от выбранного уровня сложности (уровень положили как параметр)
        saperGame.bombsByLevel(level);

        // расстановка цифр (подсказок) для игрока
        saperGame.placeHelpNumberOnMap();

        // печать игрового поля на консоль
        saperGame.printMapGame();

        // создаем циклы игры с помощью While
        /**
         * Пропишем цикл while игры с 4 варианта исхода после каждого цикла:
         *          *          1 - "Следующий ход" (check=1)
         *          *          2 - "Вы уже вводили данные координаты. Введите координаты еще раз" (check=2)
         *          *          3 - "Бомба!!! Вы проиграли!!!" (check=-1)
         *          *          4 - "Поздравляю! Вы победили!"
         */
        int check = 1;
        while (check >= 1) { // если следующий ход
            System.out.println("Выберите координаты по оси Х от 1 до 10");
            int pointX = scanner.nextInt() - 1;// пользователь вводит число на -1, т.к. у нас отчет начинается с 0
            System.out.println("Выберите координаты по оси Y от 1 до 10");
            int pointY = scanner.nextInt() - 1;
            // проверка выхода за пределы поля, если игрок введет число больше 10
            if (pointX > 10 || pointY > 10 || pointX < 0 || pointY < 0) {
                System.out.println("Вы вышли за поля!");
                continue;
            }
            check = saperGame.checkPointPlayers(pointX, pointY); //1 или 2 или -1 (проверка точки нажатия игрока)
            if (check == 2) {
                System.out.println("Вы уже вводили данные координаты. Введите координаты еще раз");
            } else if (check == 1) {
                saperGame.printMapGame();
                System.out.println("Следующий ход");
            } else if (check == -1) {
                saperGame.printMapGame();
                System.out.println("Бомба!!! Вы проиграли!!!");
            } else {
                System.out.println("Поздравляю! Вы победили!");
            }
        }
        System.out.println();
    }
}


// ДЗ сделать метод "Везде БАХ"