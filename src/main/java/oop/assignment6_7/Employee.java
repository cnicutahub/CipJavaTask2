package oop.assignment6_7;

public class Employee {
    public int hours;
    private double tariffPerHour = 5.5;

    public double getSalary() {
        return tariffPerHour * hours;
    }

    public double getTariffPerHour() {
        return tariffPerHour;
    }
}
