package lesson_07;

public class HomeWork_07_task {
    public static void main(String[] args) {
        System.out.println("Задача 1. Сравните text1 с индекса 0 по 10 с  текстом text2 с индекса 4 по 14 методом regionMatches()");
        String text1 = "Программист Java";
        String text2 = "С++ Программист";
        System.out.println("Результат: " +text1.regionMatches(0,text2,4,11));

        System.out.println("\nЗадача 2. Создайте новую строку на основании text3, но без первого слова с помощью substring");
        String text4 = "Первое слово дороже второго.";
        System.out.println("Результат: " + text4.substring(7) );

        System.out.println("\nЗадача 3. Из строки Проблемы+Решения=Деньги получить строку Решения=Проблемы+Деньги");
        String source = "Проблемы + Решения = Деньги"; //source - источник
        int p1 = source.indexOf('+');
        int p2 = source.indexOf('=');
        String problems = source.substring(0, p1);
        String solutions = source.substring(p1 + 1, p2);
        String money = source.substring(p2 + 1);
        String target = solutions + " = " + problems + " + " + money;
        System.out.println("Дано: " + source);
        System.out.println("Результат: " + target);

        System.out.println("\nили с помощью метода replace");
        System.out.println(source.replace("Проблемы+Решения=Деньги", "Решения=Проблемы+Деньги"));


        System.out.println("\nЗадача 4. Из строки получить все твердые и мягкие знаки");
        String str = "Съесть не могу, а оставить жаль. Одним махом поля не объехать.";

        int countSign = 0; //количество знаков
        for (char ch : str.toCharArray()) {//преобразуем стринги в массив символов,
            // из которых в результате прохода буквы будут премещяться в переменную ch
            if (ch == 'ь' || ch == 'ъ' || ch == 'Ь' || ch == 'Ъ') {
                countSign++;//количество в числовом формате - 6 шт
            }
        }
        char[] signChar = new char[countSign]; //создаем массив символов
        int currentIndex = 0;
        for (char ch : str.toCharArray()) {//преобразуем стринги в массив символов,
            // из которых в результате прохода буквы будут премещяться в переменную ch
            if (ch == 'ь' || ch == 'ъ' || ch == 'Ь' || ch == 'Ъ') {

                signChar[currentIndex] = ch;//наполняем в массив символы
                currentIndex++;
            }
        }
        System.out.println("Результат: " + signChar);

        System.out.println("\nЗадача 5. Печать двумерного массива в шахматном порядке");
        int[][] numbers4 = new int[5][5];
        for (int i = 0; i < numbers4.length; i++) {
            for (int j = 0; j < numbers4[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(numbers4[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

        System.out.println("\nЗадача 6. Печать двух диагоналей двумерного массива (Х)");
        int[][] numbers5 = new int[5][5];
        for (int i = 0; i < numbers5.length; i++) {
            for (int j = 0; j < numbers5[i].length; j++) {
                if (i == j || numbers5.length - i - 1 == j) {
                    System.out.print(numbers5[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        System.out.println("\nЗадача 7. Печать двух треугольников");
        int[][] numbers6 = new int[5][5];
        for (int i = 0; i < numbers6.length; i++) {
            for (int j = 0; j < numbers6[i].length; j++) {
                if (i != j) {
                    System.out.print(numbers6[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}

