package PrototypeDesign;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(13, "Doe");
        System.out.println(student);
        Student student2 = (Student) student.clone();
    }
}
