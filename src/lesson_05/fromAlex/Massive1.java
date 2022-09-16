package lesson_05;

public class Massive1 {
    public static void main(String[] args) {
        /**- Группировка примитивных типов
         Массив - это группа примитивных типов. В массив можно положить только однотипные данные.
         Массив имеет индексы от 0 и выше, каждое значение записывается в ячейку памяти имеющую  индекс.
         **/
        //Массив int-вых значений

        //Вариант создания массива сразу с известными значениями
        int[] numbers = {3, 0, 6, -8, 9, 12};
        System.out.println("\nЗадача 1. Печать массива без цикла");
        System.out.print(numbers[0] + "; ");
        System.out.print(numbers[1] + "; ");
        System.out.print(numbers[2] + "; ");
        System.out.print(numbers[3] + "; ");
        System.out.print(numbers[4] + "; ");
        System.out.println();

        System.out.println("\nЗадача 2. Печать массив циклом");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "; ");
        }
        System.out.println();

        System.out.println("\nЗадача 3. Напечатать циклом только четные числа массива");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] != 0) {
                System.out.print(numbers[i] + "; ");
            }
        }
        System.out.println();

        //Вариант создания незаполненного массива с указанием количества ячеек
        int[] numbers2 = new int[5];
            /**заполнение по умолчанию, когда нет значений
             * int - 0
             * double - 0.0
             * boolean - false
             * Сcылочные типы - null
             * **/
        System.out.println("\nЗадача 4. Ручное заполнение созданного массива заданной длины");
        numbers2[0] = 5;
        numbers2[1] = 6;
        numbers2[2] = -9;
        numbers2[3] = 0;
        numbers2[4] = 2;
        for(int i = 0;i < numbers2.length;i++){
            System.out.print(numbers2[i]+"; ");
        }
        System.out.println();

        System.out.println("\nЗадача 5. Заполнение массива с помощью цикла значениями кратно 5");
        int[] numbers3 = new int[300];
        int value = 5;
        for(int i = 0; i < numbers3.length;i++){
            numbers3[i] = value;
            value += 3; //value = value + 5;
            System.out.print(numbers3[i]+"; ");
        }
        System.out.println();

        System.out.println("\nЗадача 6. Заполнение массива символами");
        char[] symbol = {'d','4','!','A','f','h'};
        for(int i = 0; i < symbol.length; i++){
            System.out.print(symbol[i]+ "; ");
        }
    }
}
