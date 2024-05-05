package PrototypeDesign;

public class Student implements Prototype{

    public int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public Prototype clone() {
     return new Student(age, name);
    }
}
