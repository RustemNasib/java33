package lesson_12_13;

import java.util.Objects;

public class Card implements ICard {
    private String nameCard;
    private int value;

    // fields

    public Card(String nameCard, int value) {
        this.nameCard = nameCard;
        this.value = value;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue(int value) {
        return value;
    }

    @Override
    public void printToConsole() {
        System.out.println(nameCard);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value && Objects.equals(nameCard, card.nameCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCard, value);
    }

    @Override
    public String toString() {
        return nameCard;
    }

    @Override
    public int getValue() {
        return value;


    }

}
