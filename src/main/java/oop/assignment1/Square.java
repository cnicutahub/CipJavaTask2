package oop.assignment1;

public class Square {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double calculateArea(){
        return sideLength*sideLength;
    }

    public double calculatePerimeter(){
        return sideLength*4;
    }
}
