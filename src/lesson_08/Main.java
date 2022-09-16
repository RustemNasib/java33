package lesson_08;

public class Main {
    public static void main(String[] args) {
        int [][] numbers1 = {{1,4,6},{4,7,3},{6,4,9}};
        int [][] numbers2 = {{13,44,63, 44},{34,37,33, 54 },{56,44,94, 54}};

        System.out.println("Метод 1. Печать на консоль двумерного массива целых чисел");
        // Так как метод printMassiveToConsole написан как static, тогда его нужно вызывать не у массивов, а у класса
        MassiveUtilits.printMassiveToConsole(numbers1);
        MassiveUtilits.printMassiveToConsole(numbers2);

        System.out.println("Метод 2. Подсчет количества четных чисел в двумерном массиве целых чисел");
        System.out.println(MassiveUtilits.countEvenNumbers(numbers1));
        System.out.println(MassiveUtilits.countEvenNumbers(numbers2));

        System.out.println("Метод 3. Создание массива гласных из строк текста");
        System.out.println(MassiveUtilits.charGlassFromMassive("Some text in English"));




    }
}
