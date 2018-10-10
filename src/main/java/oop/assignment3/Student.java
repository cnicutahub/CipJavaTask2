package oop.assignment3;

public class Student {
    private String name;
    private int age;

    public void setData(String n, int a) {
        name = n;
        age = a;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setData("Ion", 23);

        Student student2 = new Student();
        student2.setData("Ionel", 32);

        double avgAge = (student1.getAge() + student2.getAge()) / 2.0;
        System.out.println(avgAge);
    }
}
