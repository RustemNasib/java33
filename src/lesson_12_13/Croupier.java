package lesson_12_13;

public class Croupier extends Player {
    public Croupier(String name) {
        super(name);
    }
// переопределение метода из класса Player
    @Override
    public boolean needCard() {
        if (sumValueCardsOnHand() > 17){ //если сумма очков > 17
            return false; //то карта больше не нужна
        }
        return true; //иначе еще готов брать карту
    }
    @Override
    public boolean isCroupier() {
        return true;
    }
}
