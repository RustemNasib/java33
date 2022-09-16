package lesson_02;

public class HomeWork2 {
    public static void main(String[] args) {
        /**
         System.out.println("Задача № 1. Дано: Треугольник а = 60, b = 40, с = 27. Найти периметр?");
         // Дано
         byte sideA = 60, sideB = 40, sideC = 27;
         int result = sideA +sideB+ sideC;
         System.out.println("Ответ: периметр = "+ result);
         */

/**System.out.println("\n Задача. Дано: Голодный Вася съедает за 9 минут 3 банана, " +
 "а сытый за 15 минут.На сколько быстрее голодный Вася съедает один банан?");

 byte countBananas =3; // число бананов
 byte hungryTime = 9; // время упоребления в голодном состоянии
 byte notHungryTime = 15; // время употребления в сытом состоянии
 // решение
 int hungryTimeEatBanana = hungryTime/countBananas; // 3 минуты на 1 банан
 int notHungryTimeEatBanana = notHungryTime/countBananas; // 5 минут на 1 банан
 int result2 = notHungryTimeEatBanana-hungryTimeEatBanana;
 System.out.println("Ответ: на " + result2 + "минуты быстрее.");
 *
 */

/**System.out.println("\nЗадача 3. Дано: Коля получили много двоек и закопал свой дневник на 127 метров, " +
 *                 "потом вернулся и углубился еще на 2 метра. На сколько метров закопал свой дневник Коля?");
 *         byte metersKolya = 127;
 *         metersKolya +=2;
 *         System.out.println("Ответ: " + metersKolya + " метров");
 */

/** System.out.println("Задача. Хитрый бухгалтер разделил 5 рублей на две кассы. Сколько рублей в каждой кассе?");
 double money = 5;
 double countPayWindows = 2;
 double moneyInPayWindow =  money / countPayWindows;
 System.out.println("Ответ: денег в каждой кассе: " + moneyInPayWindow);

 */

/**System.out.println("Задача. Присвоение символа в переменную");
 *         char symbol='s';
 *         System.out.println("символ: " + symbol);
 *         char symbolCode = 1234;
 *         System.out.println("Символ по коду получился: " + symbolCode);
 */

/**System.out.println("Дано 10 красных яблок и 5 зеленных яблок. " +
 "Вопрос: Верно ли утверждение, что красных яблок больше?");
 int redApple = 10, greenApple = 5;
 boolean ask = redApple>greenApple;
 System.out.println("Утверждение: " + ask);
 *
 */

/**System.out.println("\nПогода в средней части Росси -128 градусов, а ночью похолодало еще на -1 градус. " +
 "Какая температура была ночью?");
 byte temperature = -128;
 byte temperatureByNight = temperature -=1;
 System.out.println("Ответ: ночью была температура: "+temperatureByNight);
 *
 */


/**System.out.println("\n В Forbes подсчитали, сколько заработали телеведущие и блогерши \n" +
 "Ольга Бузова и Ксения Собчак в период с 1 июня 2020 года по 31 мая 2021 года. \n" +
 "Журналисты раскрыли, что за указанный период Бузова получила 3,3 миллиона долларов \n" +
 "(почти 243 миллиона рублей по текущему курсу). Ей удалось заработать внушительную сумму благодаря \n" +
 "участию в популярных телевизионных проектах России и Белоруссии, за счет рекламы в Instagram, \n" +
 "стриминге собственных песен и съемках в кино. За тот же промежуток времени Собчак заработала \n" +
 "более 4,7 миллиона долларов (345 миллионов рублей). Большую часть доходов звезде принесли соцсети, \n" +
 "в том числе — реклама брендов в Instagram и на YouTube. \n" +
 "Кроме того, Собчак ведет программу «Док-ток» на Первом канале. \n" +
 "Вопрос: Сколько они заработали вместе в рублях? Какой средний доход? И чем мы все занимаемся)))?");

 int revenueBuzova = 243000000, revenueSobchak = 345000000;
 int revenueBytogether = revenueBuzova+revenueSobchak;
 int averageIncome = revenueBytogether/2;
 System.out.println("\n Ответ: они заработали вместе: " + revenueBytogether + "рублей, а средний доход обеих составил: "+averageIncome + " рублей.");
 *
 */



        /** System.out.println("Дано 'A' и 'a'. Вопрос: Верно ли утверждение, 'A' и 'a' одно и тоже? " +
         "Требуется выполнить сравнение символов.");
         char symbol ='A', symbol1 = 'a';
         System.out.println("Верно ли утверждение: " + (symbol==symbol1));
         *
         */

        System.out.println("\nЗадача: Расчет покупок в магазине." +
         "\n Дано: У вас есть деньги cash = 1500 р." +
         "\n Необходимо рассчитать сколько вы можете купить пиццы, при цене пиццы 230 р.," +
         "\n затем на сдачу после покупки пиццы посчитать сколько можно купить жвачек, если их цена 26 р.," +
         "\n а затем, если сдача останеся, посчитать сколько можно купить конфет, если одна конфета стоит 2.5 р.");
         double cash = 1500, priceOfPizza = 230, priceOfGum = 26, priceOfCandies = 2.5;

         System.out.println("\n Имеется: " + cash + "р." + ", на которые можно купить: ");

         int amountOfPizza = (int) (cash / priceOfPizza); // количество пиццы
         System.out.print("пиццы: " + amountOfPizza + "шт. по 230 р.");
         double changeAfterPizza = cash%priceOfPizza ;//сдача после покупки пицццы
//     double changeAfterPizza = cash - (priceOfPizza * amountOfPizza);//сдача после покупки пицццы
         System.out.println("(останется сдача: " + changeAfterPizza + "р.)");

         int amountOfGum = (int) (changeAfterPizza / priceOfGum); // количество жвачек
         System.out.print("жвачек: " + amountOfGum + "шт. по 26 р.");
         double changeAfterGum = changeAfterPizza % priceOfGum;// сдача после жвачек
//         double changeAfterGum = changeAfterPizza - (priceOfGum * amountOfGum);// сдача после жвачек
         System.out.println("(останется сдача: " + changeAfterGum + "р.)");

         int amountOfCandies = (int) (changeAfterGum / priceOfCandies); // количество конфет
         System.out.print("конфет: " + amountOfCandies + "шт. по 2.5 р.");
         double changeAfterCandies = changeAfterGum % priceOfCandies;
//         double changeAfterCandies = changeAfterGum - (priceOfCandies*amountOfCandies);
         System.out.println("(и еще останется сдача: " + changeAfterCandies + "р.)");





    }

}



