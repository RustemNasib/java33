package lesson_14;

import java.util.ArrayList;

public class Main1_ArrayList {
    public static void main(String[] args) {
        /**
         * ArrayList<Integer> - это безразмерная коллекция, реализация изменяемого массива интерфейса List.
         * Изменяет размер динамически, но может включать в себя элементы только одного типа.
         *
         * Примитивные типы нельзя хранить внутри коллекций. Для этого есть ссылочные типы примитивов:
         *          *                  int    -  Integer
         *          *                  byte   -  Byte
         *          *                  short  -  Short
         *          *                  char   -  Character
         */

        System.out.println("Часто используемые методы");
        //1. Создать ArrayList и добавить значения
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);

        //2. Метод add - указать индекс 0 и положить 99, тогда произойдет сдвиг всех значений на один индекс вправо
        numbers.add(1, 9);
        System.out.println(numbers);

        //4. Метод set - указать индекс 1 и положить 8, тогда произойдет затирание 9 на 8
        numbers.set(1, 8);
        System.out.println(numbers);

        //6. Метод size() - возвращает количество элементов в коллекции
        System.out.println("numbers имеет длину: " + numbers.size());

        //7. Метод get() - возвращает значение по индексу
        System.out.println("по первому индексу числится цифра: " + numbers.get(1));

        //8. Метод toArray() - поможет преобразовать коллекцию в массив
        Object[] objects = numbers.toArray();
        for (Object v : objects) {
            System.out.print(v + ", ");
        }
        System.out.println();
        //9. Метод contains() - поиск значения в коллекции, например 81:
        System.out.print(numbers.contains(8));

        //10. Метод addAll - добавить все элементы в коллекцию из другой коллекции
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(numbers);
        System.out.println(numbers2);

        //11. Метод remove(int index) - удалить по индексу 1
        numbers.remove(1);
        System.out.println(numbers);

        //12. Метод isEmpty() - boolean пустая ли коллекция:
        ArrayList<Integer> numbers3 = new ArrayList<>();
        // numbers3.add(2);//если в коллекцию добавить значение, то будет false
        System.out.println(numbers3.isEmpty());

        //13. Метод clear() - удаляет все элементы коллекции
        numbers2.clear();
        System.out.println(numbers2.isEmpty() + " и " + numbers2.size());//пустая-ли коллекция и ее размер?

    }
}

