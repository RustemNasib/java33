package lesson_21;

public class Main_Fridge {
    public static void main(String[] args) {
        //создали пустой холодильник
        Fridge fridge = new Fridge();
        //создаем список продуктов
        fridge.putProduct("Яблоки", 2);
        fridge.putProduct("Яблоки", 3);
        fridge.putProduct("Груша", 4);
        fridge.putProduct("Киви", 2);
        fridge.putProduct("Сливки", 5);
        fridge.putProduct("Сахар", 8);

        System.out.println();

        fridge.getProduct("Груша", 1);

        fridge.getProduct("Груша", 4);
    }
}
