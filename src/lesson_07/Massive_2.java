package lesson_07;

public class Massive_2 {
    public static void main(String[] args) {
        int[][] numbers = {{5, 8, 9,}, {7, 6, 6}, {3, 3, 3}};
        System.out.println("1. Печать двумерного массива без цикла ");
        System.out.print(numbers[0][0] + " ");
        System.out.print(numbers[0][1] + " ");
        System.out.print(numbers[0][2] + " ");
        System.out.println();
        System.out.print(numbers[1][0] + " ");
        System.out.print(numbers[1][1] + " ");
        System.out.print(numbers[1][2] + " ");
        System.out.println();
        System.out.print(numbers[2][0] + " ");
        System.out.print(numbers[2][1] + " ");
        System.out.print(numbers[2][2] + " ");

        System.out.println("\n 2. Печать двумерного массива циклом");
        for (int i = 0; i < numbers.length; i++) {                   //строки
            for (int j = 0; j < numbers[i].length; j++) {            //колонки
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n3. Создать двумерный массив, наполнить числами от 10 с шагом +5 и вывести на консоль");
        int[][] numbers2 = new int[4][4];
        int a = 10;
        for (int i = 0; i < numbers2.length; i++) {
            for (int j = 0; j < numbers2[i].length; j++) {
                numbers2[i][j] = a;
                System.out.print(numbers2[i][j] + " ");
                a += 5;
            }
            System.out.println();
        }
        System.out.println("\n4. Печать диагонали двумерного массив, верхнего и нижнего треугольников");
        int[][] numbers3 = new int[5][5];
        for (int i = 0; i <numbers3.length ; i++) {
            for (int j = 0; j < numbers3[i].length ; j++) {
                if (i==j){// == основная диагональ, <= верхний треугольник, >= нижний треугольник
                    System.out.print(numbers3[i][j]+ " ");
                }else {
                    System.out.print(" "+ " ");
                }
            }
            System.out.println();
        }
    }
}
