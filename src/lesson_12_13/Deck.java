package lesson_12_13;

import java.util.concurrent.ThreadLocalRandom;

public class Deck implements IDeck {
    //6. Добавить карты в колоду
ICard [] cards = new Card[52];

    public Deck() {
        cards[0] = new Card("Двойка Трефа", 2);
        cards[1] = new Card("Двойка Черви", 2);
        cards[2] = new Card("Двойка Бубны", 2);
        cards[3] = new Card("Двойка Пики", 2);

        cards[4] = new Card("Тройка Трефа", 3);
        cards[5] = new Card("Тройка Черви", 3);
        cards[6] = new Card("Тройка Бубны", 3);
        cards[7] = new Card("Тройка Пики", 3);

        cards[8] = new Card("Четверка Трефа", 4);
        cards[9] = new Card("Четверка Черви", 4);
        cards[10] = new Card("Четверка Бубны", 4);
        cards[11] = new Card("Четверка Пики", 4);

        cards[12] = new Card("Пятерка Трефа", 5);
        cards[13] = new Card("Пятерка Черви", 5);
        cards[14] = new Card("Пятерка Бубны", 5);
        cards[15] = new Card("Пятерка Пики", 5);

        cards[16] = new Card("Шестерка Трефа", 6);
        cards[17] = new Card("Шестерка Черви", 6);
        cards[18] = new Card("Шестерка Бубны", 6);
        cards[19] = new Card("Шестерка Пики", 6);

        cards[20] = new Card("Семерка Трефа", 7);
        cards[21] = new Card("Семерка Черви", 7);
        cards[22] = new Card("Семерка Бубны", 7);
        cards[23] = new Card("Семерка Пики", 7);

        cards[24] = new Card("Восьмерка Трефа", 8);
        cards[25] = new Card("Восьмерка Черви", 8);
        cards[26] = new Card("Восьмерка Бубны", 8);
        cards[27] = new Card("Восьмерка Пики", 8);

        cards[28] = new Card("Девятка Трефа", 9);
        cards[29] = new Card("Девятка Черви", 9);
        cards[30] = new Card("Девятка Бубны", 9);
        cards[31] = new Card("Девятка Пики", 9);

        cards[32] = new Card("Десятка Трефа", 10);
        cards[33] = new Card("Десятка Черви", 10);
        cards[34] = new Card("Десятка Бубны", 10);
        cards[35] = new Card("Десятка Пики", 10);

        cards[36] = new Card("Валет Трефа", 2);
        cards[37] = new Card("Валет Черви", 2);
        cards[38] = new Card("Валет Бубны", 2);
        cards[39] = new Card("Валет Пики", 2);

        cards[40] = new Card("Дама Трефа", 3);
        cards[41] = new Card("Дама Черви", 3);
        cards[42] = new Card("Дама Бубны", 3);
        cards[43] = new Card("Дама Пики", 3);

        cards[44] = new Card("Король Трефа", 4);
        cards[45] = new Card("Король Черви", 4);
        cards[46] = new Card("Король Бубны", 4);
        cards[47] = new Card("Король Пики", 4);

        cards[48] = new Card("Туз Трефа", 11);
        cards[49] = new Card("Туз Черви", 11);
        cards[50] = new Card("Туз Бубны", 11);
        cards[51] = new Card("Туз Пики", 11);
    }

    @Override
    public ICard randomCard() { //метод рандомной карты для раздачи карт в классе Game
        int randomIndex = ThreadLocalRandom.current().nextInt(0,51);
        return cards [randomIndex];

    }
}
