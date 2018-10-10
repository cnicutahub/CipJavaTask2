package oop.assignment4_5;

public class UsePoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(23);
        point.setY(5);
        point.setZ(98);
        System.out.println(point);

        System.out.println(new Point(23,5,98));

        System.out.println(new Point(5,98));
    }
}
