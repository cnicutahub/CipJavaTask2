package oop.assignment6_7;

public class Manager extends Employee {
    @Override
    public double getSalary() {
        return super.getSalary() + (super.getSalary() / 2);
    }
}
