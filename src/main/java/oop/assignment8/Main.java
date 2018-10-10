package oop.assignment8;

public class Main {
    public static void main(String[] args) {
        GraphicObject circle = new Circle(2);
        System.out.println(circle.area());

        GraphicObject rectangle = new Rectangle(2,3);
        System.out.println(rectangle.area());
    }
}
