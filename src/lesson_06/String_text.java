package lesson_06;

public class String_text {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Задача1. Таймер");
        String name = "Alex";
        for (int day = 1; day <= 365; day++) {           //дни
            for (int hour = 1; hour <= 24; hour++) {     //часы
                for (int min = 1; min <= 60; min++) {    //минуты
                    for (int sec = 0; sec <= 60; sec++) {//секунды
//Отформатированный вывод: %d - числовые типы; %s - строковых типов; \n - перевод на новую строку
                        System.out.printf("%s, со старта прошло %d день(ей), %d час(ов), %d минут, %d секунд\n", name, day,hour,min,sec);
                    Thread.sleep(1000);
                    }
                }
            }
        }
    }
}
