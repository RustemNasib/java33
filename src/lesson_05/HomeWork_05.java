package lesson_05;

import java.io.StringBufferInputStream;
import java.util.Scanner;

public class HomeWork_05 {
    public static void main(String[] args) {

        /**
         * System.out.println(" Задача1. Расчет площади или периметра разных фигур.");
         *         System.out.println("Введите цифру, соответствующую фигуре: ");
         *
         *         System.out.println("1 - круг");
         *         System.out.println("2 - овал");
         *         System.out.println("3 - квадрат");
         *         System.out.println("4 - треугольник");
         *         System.out.println("5 - трапеция");
         *
         *         Scanner scanner = new Scanner(System.in);
         *         int inputFigura = scanner.nextInt();
         *
         *         System.out.println("Введите цифру, соответствующую параметру расчета");
         *         System.out.println("1 - площадь");
         *         System.out.println("2 - периметр (окружность)");
         *
         *         int inputAction = scanner.nextInt();
         *
         *         switch (inputFigura){
         *             case 1: //круг
         *                 System.out.println("Введите радиус круга");
         *                 double inputRadCircle = scanner.nextDouble();
         *                 if (inputAction == 1){
         *                     System.out.println("Площадь круга = " + Math.PI * (inputRadCircle * inputRadCircle));
         *                 } else if (inputAction == 2) {
         *                     System.out.println("Длина окружности = " + Math.PI * 2*inputRadCircle);
         *                 }else {
         *                     System.out.println("Такой параметр отсутствует");
         *                 }
         *                 break;
         *             case 2: //Овал
         *                 System.out.println("Введите размер малой полуоси овала");
         *                 double inputSemiMinorAxis = scanner.nextDouble();
         *                 System.out.println("Введите размер большой полуоси овала");
         *                 double inputSemiMajorAxis = scanner.nextDouble();
         *                 if (inputAction == 1){
         *                     System.out.println("Площадь овала = "+ (Math.PI * inputSemiMinorAxis*inputSemiMajorAxis));
         *                 } else if (inputAction == 2){
         *                     System.out.println("Окружность овала = "+
         *                             (4 * (Math.PI * inputSemiMinorAxis * inputSemiMajorAxis +
         *                                     (inputSemiMinorAxis - inputSemiMajorAxis) *
         *                                     (inputSemiMinorAxis - inputSemiMajorAxis)) /
         *                                     (inputSemiMinorAxis + inputSemiMajorAxis)));
         *                 }else {
         *                     System.out.println("Такой параметр отсутствует");
         *                 }
         *                 break;
         *             case 3: //Квадрат
         *                 System.out.println("Введите сторону квадрата: ");
         *                 double inputSide = scanner.nextDouble();
         *                 if(inputAction == 1){
         *                     System.out.println("Площадь квадрата = " + inputSide*inputSide);
         *                 }else if(inputAction == 2){
         *                     System.out.println("Периметр квадрата = " + inputSide*4);
         *                 }else {
         *                     System.out.println("Такой параметр отсутствует");
         *                 }
         *                 break;
         *             case 4: //Треугольник
         *                 System.out.println("Введите первую сторону треугольника: ");
         *                 double inputSide1 = scanner.nextDouble();
         *                 System.out.println("Введите вторую сторону треугольника: ");
         *                 double inputSide2 = scanner.nextDouble();
         *                 System.out.println("Введите третью сторону треугольника: ");
         *                 double inputSide3 = scanner.nextDouble();
         *                 double pp = (inputSide1 + inputSide2 + inputSide3) / 2.0;  // полупериметр
         *                 if(inputAction == 1){
         *                     System.out.println("Площадь треугольника = " + Math.sqrt(pp *
         *                             (pp - inputSide1) * (pp - inputSide2) * (pp - inputSide3)));
         *                 }else if(inputAction == 2){
         *                     System.out.println("Периметр треугольника = " + (inputSide1 + inputSide2 + inputSide3));
         *                 }else {
         *                     System.out.println("Такой параметр отсутствует");
         *                 }
         *                 break;
         *
         *             case 5: //Трапеция
         *                 System.out.println("Введите верхнюю сторону трапеции: ");
         *                 double inputSideA = scanner.nextDouble();
         *                 System.out.println("Введите нижнюю сторону трапеции: ");
         *                 double inputSideB = scanner.nextDouble();
         *                 System.out.println("Введите первую сторону трапеции: ");
         *                 double inputSideC = scanner.nextDouble();
         *                 System.out.println("Введите вторую сторону трапеции: ");
         *                 double inputSideD = scanner.nextDouble();
         *
         *                 if(inputAction == 1){
         *                     System.out.println("Площадь трапеции = " + ((inputSideA + inputSideB) * Math.sqrt(inputSideC *
         *                             inputSideC - Math.pow((Math.pow(inputSideB - inputSideA, 2) +
         *                             inputSideC * inputSideC - inputSideD * inputSideD) / (2 * (inputSideB - inputSideA)), 2))) / 2);
         *                     // или S = 1/2*a*b*h, где a, b - основания трапеции, h - высота (тогда нужно спросить высоту)
         *                 }else if(inputAction == 2){
         *                     System.out.println("Периметр трапеции = " + (inputSideA + inputSideB +
         *                             inputSideC + inputSideD));
         *                 }else {
         *                     System.out.println("Такой параметр отсутствует");
         *                 }
         *                 break;
         *
         *             default:
         *                 System.out.println("Такой фигуры нет!");
         *         }
         */


        System.out.println();
        System.out.println("Задача2. Получить от пользователя любой текст и перевернуть его. " +
                "Например, текст: Папа может! Программа должна вернуть текст: !тежом апаП ");
        System.out.println("Введите текст!");

        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        for (int i = text1.length() - 1; i >= 0; i--) {
//            char ch = text1.charAt(i);
//            System.out.print(ch);
            System.out.print(text1.charAt(i));//Возвращает значение char по указанному индексу.
            // Индекс находится в диапазоне от 0 до length() - 1.
            // Первое символьное значение последовательности имеет индекс 0, следующее — индекс 1 и т. д.,
            // как при индексации массива.

//        String inputText = scanner1.nextLine();
//        char[] chars = inputText.toCharArray();
//        for (int i = chars.length-1; i >= 0 ;i--) {
//            System.out.print(chars[i]);
//
//        }
//        String words[] = inputText.split(" ");
//String text = new String();
//        for (int j = words.length-1; j >=0; j--) {
//             text += words [j];
//             System.out.println("Ваш текст в обратном порядке: " + text);
//        }
            //        String[] words = inputText.split(" ");
//                for (int i = 0; i < words.length; i++) {
////        for (int i = words.length-1; i >= 0; i--) {
//            System.out.println("Ваш текст в обратном порядке: "
//                    + new StringBuilder(words[i]).reverse());
//        }
//        char[] reverseArray1 = inputText.toCharArray(); // Преобразуем inputText в массив символов (char)
//          for (int i = reverseArray1.length-1; i >= 0; i--) {
//            System.out.print("Ваш текст в обратном порядке: " + reverseArray1[i]);
//        }

        }
    }
}

