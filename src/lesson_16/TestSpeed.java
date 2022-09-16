package lesson_16;

import java.util.ArrayList;

public class TestSpeed {
    // поля
    private int capacityArrayList;
    private int volumesArrayList;

    // конструкторы


    public TestSpeed() {
    }

    public TestSpeed(int capacityArrayList, int volumesArrayList) {
        this.capacityArrayList = capacityArrayList;
        this.volumesArrayList = volumesArrayList;
    }

    //метод
    public long getIntegerTimeArrayList(int capacityArrayList, int volumesArrayList) {
        ArrayList<Integer>numbers = new ArrayList<>(capacityArrayList);
        int num = 0;
        //старт времени
        long startTime = System.currentTimeMillis(); //количество милисекунд
        for (int i = 0; i < volumesArrayList; i++) {
            numbers.add(i,num);
            num++;
        }
        //финиш времени
        long endTime = System.currentTimeMillis();
        return endTime - startTime;

    }

}
