package lesson_12_13;

public class Game implements IGame {
    //fields
    private IPlayer[] playerInGame = new IPlayer[10];// Добавляем игроков
    private IDeck deck = new Deck(); // 5. Добавляем колоду

    @Override
    public void addPlayerInGames(IPlayer player) {// метод добавления игрока в массив игры
        for (int i = 0; i < playerInGame.length; i++) {
            if (playerInGame[i] == null) { //проверяем, что ячейка не занята, тогда класть можно
                playerInGame[i] = player;
                break;
            }
        }
    }

    @Override
    public void twoCardsOnStartForEach() { // раздаем по две карты, в тч и крупье
        for (IPlayer player : playerInGame) {
            if (player != null) {
                player.tackOneCard(deck.randomCard());
                player.tackOneCard(deck.randomCard());//раздаем по одной карте два раза рандомно
            }
        }
    }


    @Override
    public void giveOneCardIfNeed() {// раздаем по одной карте при необходимости
        for (IPlayer player : playerInGame) {
            if (player != null) {//проверяем есть ли игрок
                while (player.needCard()) {// пока нужна ему карта
                    player.tackOneCard(deck.randomCard());// тогда даем ему из колоды рандомно одну карту

                }

            }
        }
    }

    @Override
    public void determineWinner() {//определение победителя
        // Проходим по игрокам и исключаем всех у кого больше 21 очка (для этого у игроков нужно добавить признак победителя)
        for (IPlayer player : playerInGame) {
            if (player != null) {
                if (player.sumValueCardsOnHand() > 21) {
                    player.setInGame(false);
                }
            }
        }
        // 1 вариант: победил крупье, если все игроки перебрали 21
        if (countPlayersInGame() == 0) {//проверяем сколько игроков в игре
            System.out.println("Победил крупье!");
        }

        // 2 вариант: победил один игрок, оставшийся в игре, не перебравший 21 очко
        if (countPlayersInGame() == 1) {
            System.out.println("Победил игрок: ");
            for (IPlayer player : playerInGame) {
                if (player != null) {
                    if (player.isInGame()) {
                        player.showCards();
                        return;
                    }
                }
            }
        }
        //3 вариант: выбираем большего значения очков из оставшихся игроков
        int bestValue = 0;
        for (IPlayer player : playerInGame) {
            if (player != null) {
                if (player.isInGame()) {
                    if (bestValue < player.sumValueCardsOnHand()) {
                        bestValue = player.sumValueCardsOnHand();
                    }
                }
            }
        }

        for (IPlayer player : playerInGame) {
            if (player != null) {
                if (player.isInGame() && !player.isCroupier()) {
                    if (bestValue == player.sumValueCardsOnHand()) {
                        System.out.println("Выиграл игрок: " + player.getName());
                        player.showCards();
                        System.out.println();
                    }
                }

            }
        }
    }

    public int countPlayersInGame() { //сколько человек еще участвует в игре
        int sum = 0;
        for (IPlayer player : playerInGame) {
            if (player != null) {
                if (player.isInGame()) {
                    sum++;
                }
            }

        }
        return sum;
    }
}




