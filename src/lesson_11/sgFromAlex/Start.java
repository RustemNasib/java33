package lesson_11.sgFromAlex;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        /**
         * 1. Создадим класс SapperGame
         * 2. class SapperGame - Создадим двумерный массив для игры 10 на 10
         * 3. class SapperGame - Создадим двумерный массив для вывода игрокам 10 на 10
         * 4. class Start - создадим объект класса SapperGame и проверим игровые поля
         * 5. class Start - Спросим у пользователя уровень сложности игры
         * 6. class Start - Пропишем метод bombsByLevel(level) для раскладки бомб в который передадим уровень сложности
         * 7. class SapperGame - Реализуем метод bombsByLevel(level)
         * 8. class SapperGame - Реализуем метод addRandBomb()
         * 9. class Start - Пропишем метод placeHelpNumberOnMap() для расстановки вспомогательных цифр
         * 10. class SapperGame - Реализуем метод placeHelpNumberOnMap()
         * 11. class Start - Пропишем метод printMapGame()
         * 12. class SapperGame - Реализуем метод printMapGame()
         * 13. class Start - Пропишем цикл while игры с 4 варианта исхода после каждого цикла:
         *          1 - "Следующий ход" (check=1)
         *          2 - "Вы уже вводили данные координаты. Введите координаты еще раз" (check=2)
         *          3 - "Бомба!!! Вы проиграли!!!" (check=-1)
         *          4 - "Поздравляю! Вы победили!"
         * while(числоЯблокВТазике>0) {
         *     яблоко = тазик.взятьОчередноеЯблоко();
         *     положитьВПирог(яблоко.чистить().нарезать());
         *     числоЯблокВТазике--;//-- это декремент, уменьшает количество яблок на единицу
         *   }
         * System.out.println('Яблоки для пирога обработаны.');
         *
         **/

        // 4. class Start - создадим объект класса SapperGame и проверим игровые поля
        SapperGame sapperGame = new SapperGame();

        //5. class Start - Спросим у пользователя уровень сложности игры
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите уровень сложности");
        System.out.println("1 - Высокий");
        System.out.println("2 - Медиум");
        System.out.println("3 - Низкий");
        int level = scanner.nextInt();

        //6. class Start - Пропишем метод для раскладки бомб в который передадим уровень сложности
        sapperGame.bombsByLevel(level);

        //9. class Start - Пропишем метод placeHelpNumberOnMap() для расстановки вспомогательных цифр
        sapperGame.placeHelpNumberOnMap();

        //11. class Start - Пропишем метод printMapGame()
        sapperGame.printMapGame();

        //13. class Start - Пропишем цикл while игры с 4 варианта исхода после каждого цикла
        int check = 1;//варианта исхода после каждого цикла
        while (check >= 1){
            System.out.println("Выберите координаты клетки оси X от 1 до 10");
            int pointX = scanner.nextInt()-1; //Получить индекс
            System.out.println("Выберите координаты клетки оси Y от 1 до 10");
            int pointY = scanner.nextInt()-1;
            if (pointX > 10 || pointY > 10 || pointX < 0 || pointY < 0){
                System.out.println("Вы вышли за пределы поля");
                continue;
            }
            check  = sapperGame.checkPointPlayers(pointY, pointX); //прописываем метод проверки координат игрока
            if (check == 2){
                System.out.println("Вы уже вводили данные координаты. Введите координаты еще раз");
            } else if(check == 1){
                sapperGame.printMapGame();
                System.out.println("Следующий ход");
            }else if(check == -1){
                //sapperGame.printMapGame();
                sapperGame.printMapGameOver();
                System.out.println("Бомба!!! Вы проиграли!!!");
            } else {
                System.out.println("Поздравляю! Вы победили!");
            }
        }

        System.out.println();
    }
}
