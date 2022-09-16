package lesson_10.construction;

public class Table {
    //пол€
    private int length;
    private int width;
    private int height;
    private String material;
    private String nameOfModel;

    // конструкторы

    public Table() {
    }

    public Table(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Table(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Table(int length, int width, int height, String material, String nameOfModel) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.material = material;
        this.nameOfModel = nameOfModel;
    }

    /**
     * * модификатор доступа + ¬озвращаемый тип класса(){}
     * * Ќельз€ создать конструкторы так:
     * * public Table(int length, int width, int height){}
     * * public Table(int width, int length, int height){}
     * *
     * * Ќельз€ создать конструкторы так:
     * * public Table(int length, int height){}
     * * public Table(int length, int width){}
     * *
     * * ѕроверка дублей конструкторов происходит по количеству и по типам вход€щих параметров,
     * но не по названи€м параметров
     */


    // методы
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getNameOfModel() {
        return nameOfModel;
    }

    public void setNameOfModel(String nameOfModel) {
        this.nameOfModel = nameOfModel;
    }
}

