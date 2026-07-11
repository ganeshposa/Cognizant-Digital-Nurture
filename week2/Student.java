package week2;

public class Student {

    int id = 101;
    String name = "Ganesh";

    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {

        Student s = new Student();
        s.display();
    }
}