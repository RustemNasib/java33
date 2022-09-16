package lesson_20;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Iter_foreach_while {
    public static void main(String[] args) {
        //1. создаем коллекцию TreeSet
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        //2.проход while (правильный проход)
        Iterator<Integer> iter = set.iterator();       // коллекцию кладем на переменную iter
        while (iter.hasNext()) {                       // проходим по iter, пока есть следующий
            Integer currentElement = iter.next();      //просим из коллекции set, которую положили на iter, дать копию элемента (пока есть следующий элемент)
            System.out.print(currentElement + "; ");
        }
        System.out.println();

        //3. Проход foreach (не правильный проход, тк может быть ошибка)
        for (Integer currentElement:set){
            System.out.print(currentElement + "; ");
        }

    }
}

