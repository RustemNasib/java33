package lesson_15;

public class Triangle {

    private int a;
    private int b;
    private int c;

    public void installAllSides(int a, int b, int c) throws IncorrectSideTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("неверно указаны стороны: a <= 0 || b <= 0 || c <= 0");
            throw new IncorrectSideTriangleException("неверно указаны стороны: a <= 0 || b <= 0 || c <= 0");
        }
        if (a >= b + c) {
            System.out.println("Сторона А слишком большая: a >= b + c");
        }
        if (b>=a+c) {
            System.out.println("Сторона В слишком большая: b >= а + c");
        }
        if (c>=b+a) {
            System.out.println("Сторона C слишком большая: с >= b + a");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }
}

