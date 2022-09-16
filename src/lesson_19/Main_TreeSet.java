package lesson_19;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main_TreeSet {
    public static void main(String[] args) {
        TreeSet<String>strings = new TreeSet<>();
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");
        strings.add("eee");
        strings.add("ddd");
        System.out.println(strings); //[aaa, bbb, ccc, ddd, eee]

        HashSet<String> stringsHashSet = new HashSet<>();
        stringsHashSet.add("aaa");
        stringsHashSet.add("bbb");
        stringsHashSet.add("ccc");
        stringsHashSet.add("eee");
        stringsHashSet.add("ddd");
        System.out.println(stringsHashSet); //[aaa, ccc, bbb, eee, ddd]

        LinkedHashSet<String> stringsLinkedHashSet = new LinkedHashSet<>();
        stringsLinkedHashSet.add("aaa");
        stringsLinkedHashSet.add("bbb");
        stringsLinkedHashSet.add("ccc");
        stringsLinkedHashSet.add("eee");
        stringsLinkedHashSet.add("ddd");
        System.out.println(stringsLinkedHashSet); //[aaa, bbb, ccc, eee, ddd]

        TreeSet<Integer>integerTreeSet = new TreeSet<>(new ReversInteger()); //как пример добавили метод ReversInteger() из класса ReversInteger,
                                                                             // в котором регулируем реверс вместо использования метода descendingSet()
        integerTreeSet.add(3);
        integerTreeSet.add(2);
        integerTreeSet.add(4);
        integerTreeSet.add(5);
        integerTreeSet.add(4);

        System.out.println(integerTreeSet); //[2, 3, 4, 5] (сортирует по возрастанию)
        System.out.println(integerTreeSet.descendingSet()); //[5, 4, 3, 2] (сортирует по убыванию)
    }
}
