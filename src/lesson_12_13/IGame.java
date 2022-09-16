package lesson_12_13;

public interface IGame {

    void addPlayerInGames(IPlayer player);

    void twoCardsOnStartForEach();

    void giveOneCardIfNeed();

    void determineWinner();

    int countPlayersInGame();
}
