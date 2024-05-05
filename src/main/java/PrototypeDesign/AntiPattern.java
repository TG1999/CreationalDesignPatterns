package PrototypeDesign;

public class AntiPattern {
    public static void main(String[] args) {
        Student student = new Student(13, "Doe");
        System.out.println(student);

        // This is wrong because private fields are not accessible
        Student clone = new Student(student.age, student.name);
        clone.age = student.age;
        clone.name = student.name;
    }
}
