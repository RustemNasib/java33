package lesson_20;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iter_List {
    public static void main(String[] args) {

        //Палиндром (читается с обеих сторон)
        String str = "ШАЛАШ";

        //Пишем программу, которая определяет палиндромность. Сравним первую и последнюю, вторую и предпоследнюю буквы и т.д.

        //1. Создаем массив
        char[] chars = str.toCharArray(); //chars: [ш, а, л, а, ш]  str: "шалаш"

        //2. Создаем коллекцию List
        List<Character> characterList = new ArrayList<>();

        //3. Заполняем коллекцию значениями
        for (char ch : chars) { //проходим по массиву
            characterList.add(ch); //кладем в коллекцию
        }
        //4. Создаем два итератора
        ListIterator<Character> iter = characterList.listIterator(); //слева - направо
        ListIterator<Character> reversIter = characterList.listIterator(characterList.size()); //cправа - налево

        //5. В цикле две стороны
        boolean isPalindrom = true;
        while (iter.hasNext() && reversIter.hasPrevious()) { // идти справа пока есть следующий и hasPrevious посмотри назад, тогда верни true
            if (!iter.next().equals(reversIter.previous())) {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) System.out.printf("Слово %s - палиндром!", str);
        else System.out.printf("\n Слово %s - не палиндром!", str);
        System.out.println();

    }
}
