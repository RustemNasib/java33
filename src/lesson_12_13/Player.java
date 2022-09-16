package lesson_12_13;

import java.util.Scanner;

public class Player implements IPlayer {
    //fields
    private ICard[] cardsOnHand = new ICard[20];
    private boolean inGame = true;
    private String name;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String setName() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void tackOneCard(ICard card) { // метод раздачи карт
        for (int i = 0; i < cardsOnHand.length; i++) {
            if (cardsOnHand[i] == null) {
                cardsOnHand[0] = card;
                break;
            }
        }
    }

    @Override
    public boolean needCard() { // метод нуждаемости карт
        System.out.println(getName() + ", Ваши карты: ");
        this.showCards(); // смотрим карты
        System.out.println("Нужна-ли еще карта?");
        Scanner scanner = new Scanner(System.in);
        String answerPlayer = scanner.nextLine();
        if (answerPlayer.equalsIgnoreCase("да")) { //если ответ независимо от регистра букв ДА
            return true;
        }
        return false;
    }

    @Override
    public int sumValueCardsOnHand() { //проверка суммы очков в картах
        int sum = 0;
        for (ICard card : cardsOnHand) {
            if (card != null) {
                ;
                sum += card.getValue();
            }
        }
        return sum;
    }

    @Override
    public void setInGame(boolean inGame) {
        this.inGame = inGame;

    }

    @Override
    public boolean isInGame() {
        return inGame;
    }

    @Override
    public boolean isCroupier() {
        return true;
    }

    public void showCards() { // метод просмотра карт
        for (ICard card : cardsOnHand) {
            if (card != null) {
                card.printToConsole();
            }
        }
    }
}
