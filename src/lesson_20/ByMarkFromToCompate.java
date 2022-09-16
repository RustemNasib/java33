package lesson_20;

import java.util.Comparator;

public class ByMarkFromToCompate implements Comparator <Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        if (o1.getMarkYandex() != o2.getMarkYandex()) {
            return Double.compare(o1.getMarkYandex(), o2.getMarkYandex());
        }
        if (!o1.getName().equals(o2.getName())) { // применяем метод, тк String не примитивный
            return o1.getName().compareTo(o2.getName());
        }
        if (o1.getPrice() != o2.getPrice()) {
            return o1.getPrice() - o2.getPrice();
        }

        if (o1.getMemory() != o2.getMemory()) {
            return o1.getMemory() - o2.getMemory();
        }
        return 0;
    }
}
