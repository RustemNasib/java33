package lesson_09;

public class DiskAudio extends MediaProduct {
    //Поля класса

    private String author;
    private int countOfTrack;

    // Конструктор класса
    // Методы

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCountOfTrack() {
        return countOfTrack;
    }

    public void setCountOfTrack(int countOfTrack) {
        this.countOfTrack = countOfTrack;
    }

    @Override
    public void printAllInfo() {
        System.out.println("Автор: "+ this.author+", количество треков: "+ this.countOfTrack +
                ", год выпуска: "+ this.year + ", Название альбома: "+ this.name);
    }
}
