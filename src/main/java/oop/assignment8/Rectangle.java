package oop.assignment8;

public class Rectangle extends GraphicObject {
    private double hight = 0;
    private double width = 0;

    public Rectangle(double hight, double width) {
        this.hight = hight;
        this.width = width;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return hight * width;
    }
}
