package lesson_14;

import java.util.HashMap;
import java.util.Map;

public class Main2_HashMap {
    public static void main(String[] args) {
        /**
         * Коллекция - это массив с неограниченным размером и хранящим различными типами данных.
         *  Если несколько вариантов интерфейсов коллекций:
         *      Интерфейсы коллекций: Collection и Map
         *          - Map - у интерфейса Map есть реализация HashMap<K, V>, его еще называют массив по ассоциациям
         *              K - Тип ключа (любой ссылочный тип)
         *              V - Тип значения (любой ссылочный тип)
         *              Пример турнирная таблица: | Динамо | Шахтер | Спартак | - это ключ вместо индексов (уникальный)
         *                                        |   5    |  4     |   3     | - это значение (не уникальные)
         *
         *              В данном примере тип ключа String, тип значения Integer, но типы могут быть любые.
         *
         *              Примитивные типы нельзя хранить внутри коллекций! Для этого есть ссылочные типы примитивов:
         *                  int    -  Integer
         *                  byte   -  Byte
         *                  short  -  Short
         *                  char   -  Character
         *       Пример коллекции типа HashMap standings - турнирная таблица, ниже:
         */

        //1. Создаем объект турнирная таблица
        HashMap <String,Integer> table = new HashMap<>();

//2. Добавить объект в коллекцию - метод put()

table.put("Динамо", 5);
table.put("Шахтер", 4);
table.put("Cпартак", 3);

//3. Если повторить ключ объект в коллекцию - метод put() - переписывается значение

table.put("Динамо", 4);

//4. Печать
        System.out.println(table);

//5. Проверка содержится ли в коллекции: метод containsKey()
        System.out.println(table.containsKey("Динамо"));

//6. Метод entrySet() вернет пару и ключ и значение
        for (Map.Entry<String,Integer> current:table.entrySet())
            System.out.println(current.getKey() + " = " + current.getValue());


//7. Метод keySet() вернет все ключи
for (String currentKey: table.keySet())
    System.out.print(currentKey + ", ");

//8. Метод keySet() вернет ключ, а метод get(key) вернет значения
        for (String currentKey: table.keySet())
            System.out.print(table.get(currentKey)+ ", ");
    }
}
