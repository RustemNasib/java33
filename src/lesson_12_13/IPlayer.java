package lesson_12_13;

public interface IPlayer {
    void tackOneCard(ICard card);
    void showCards();
    boolean needCard();

   int sumValueCardsOnHand ();

    void setInGame(boolean inGame);

    boolean isInGame();

    boolean isCroupier();

    String getName();

    String setName ();

}
