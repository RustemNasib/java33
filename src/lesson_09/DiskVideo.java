package lesson_09;

public class DiskVideo extends MediaProduct{

    //Поля класса

    private String studio;
    private String director;
    private int mis;

    // Конструктор класса

    // Методы

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getMis() {
        return mis;
    }

    public void setMis(int mis) {
        this.mis = mis;
    }

    @Override
    public void printAllInfo() {
        System.out.println("Фильм: "+ this.name + ", Год: "+ this.year + ", Продюсер: "+ this.director +
                ", Студия: "+ this.studio + ", минут: " + this.mis);
    }
}
