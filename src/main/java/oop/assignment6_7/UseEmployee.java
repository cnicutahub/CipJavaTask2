package oop.assignment6_7;

public class UseEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.hours = 8;
        System.out.println(employee.getTariffPerHour());
        System.out.println(employee.getSalary());

        Manager manager = new Manager();
        manager.hours = 8;
        System.out.println(manager.getTariffPerHour());
        System.out.println(manager.getSalary());
    }
}
