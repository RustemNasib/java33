package lesson_15;

public class MainTriangle {
    public static void main(String[] args) {
        // 1. Создать треугольник
                Triangle triangle = new Triangle();
        try {
            triangle.installAllSides(2,2,2);
        } catch (IncorrectSideTriangleException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
    }
}

