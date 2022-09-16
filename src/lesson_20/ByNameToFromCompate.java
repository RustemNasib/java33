package lesson_20;

import java.util.Comparator;

public class ByNameToFromCompate implements Comparator <Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        if (!o1.getName().equals(o2.getName())) { // применяем метод, тк String не примитивный
            return o2.getName().compareTo(o1.getName());
        }
        if (o1.getPrice() != o2.getPrice()) {
            return o2.getPrice() - o1.getPrice();
        }

        if (o1.getMarkYandex() != o2.getMarkYandex()) {
            return Double.compare(o2.getMarkYandex(), o1.getMarkYandex());
        }
        if (o1.getMemory() != o2.getMemory()) {
            return o2.getMemory() - o1.getMemory();
        }
        return 0;
       }
}
