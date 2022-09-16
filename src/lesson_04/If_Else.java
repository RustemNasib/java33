package lesson_04;

public class If_Else {
    public static void main(String[] args) {
        /**
         *  Конструкция if
         *         if (если первое условие Да){
         *             Тогда выполняется тело с кодом 1
         *         } else if (Если второе условие ДА){
         *             Тогда выполняется тело с кодом 2
         *         } else{
         *             Во всех прочих условиях выполняется тело с кодом 3
         *         }
         */

        /** Конструкция Switch
         switch (значение3) {
         case значение1:
         Выполняющийся код;
         break; //остановка switch
         case значение2:
         Выполняющийся код;
         break; //остановка switch
         case значение3:
         Выполняющийся код;
         break; //остановка switch
         default:
         Выполняющийся код, если значение не верное;
         }
         *
         */
        System.out.println("\n Задача: Выбрать словесное описание школьной оценкис помощью if");
        int mark = 235;
        if (mark == 5) {
            System.out.println("Отлично!");
        } else if (mark == 4) {
            System.out.println("Хорошо!");

        } else if (mark == 3) {
            System.out.println("нормально!");
        } else if (mark == 2) {
            System.out.println("Плохо!");

        } else {
            System.out.println("Это не оценка!");
        }

        System.out.println("\n Задача: Выбрать словесное описание школьной оценки с помощью switch");
        int mark2 = 4;
        switch (mark2) {
            case 5:
                System.out.println("отлично!");
                break;
            case 4:
                System.out.println("хорошо!");
                break;
            case 3:
                System.out.println("Нормально!");
                break;
            case 2:
                System.out.println("Плохо!");
                break;
            default:
                System.out.println("Это не оценка!");

        }


        System.out.println("\n Какой код сработает if или else");
        int num8 = 10;
        int num9 = 100;
        if ((num8 != 0) && (num9 / num8) >= 10) {
            System.out.println("сработало тело if");
        } else {
            System.out.println("Сработало тело else");

        }
        System.out.println("\n Как сравнить возможный диапазон значений для какой-то переменной");
        int a = 1;
        int x = 2;
        int b = 3;
        System.out.println("Выражение: a<x<b: " + (a < x && x < b));

        System.out.println("\nЗадача 2. Рассчитать какую машину вы сможете купить: Lexus LX 23 млн.р, Lexus NX 7 млн.р., Lada Niva 2 млн.р.,\n" +
                "если в копилке есть 100 т.р., зарплата 150 т.р., Расходы 75 т.р., и копить Вы будете 60 месяцев.");
        //Дано:
        int priceLexusLX = 23000000; //Цена джипа Lexus LX
        int priceLexusNX = 7000000; //Цена джипа Lexus NX
        int priceLadaNiva = 2000000; //Цена джипа Lada Niva
        int cashStart = 100000;          //Наличные деньги
        int salary = 150000;        //Зарплата
        int expense = 75000;        //Расходы
        int monthlyToCar = 60;      //Сколько буду копить на машину
        // решение
        int monthProfit = salary - expense; //чистая прибыль в месяц
        if ((monthProfit * monthlyToCar + cashStart) >= priceLexusLX) {
            int remains = (monthProfit * monthlyToCar + cashStart) - priceLexusLX;
            System.out.println("Поздравляем! Через " + monthlyToCar + "месяцев вы купие Lexus LX и останется " + remains + "руб.");
        } else if ((monthProfit * monthlyToCar + cashStart) >= priceLexusNX) {
            int remains = (monthProfit * monthlyToCar + cashStart) - priceLexusNX;
            System.out.println("Поздравляем! Через " + monthlyToCar + "месяцев вы купие Lexus NX и останется " + remains + "руб.");
        } else if ((monthProfit * monthlyToCar + cashStart) >= priceLadaNiva) {
            int remains = (monthProfit * monthlyToCar + cashStart) - priceLadaNiva;
            System.out.println("Поздравляем! Через " + monthlyToCar + "месяцев вы купие LadaNiva и останется " + remains + "руб.");
        }else {
            System.out.println("Ходить пешком полезно!");
        }

    }
}



