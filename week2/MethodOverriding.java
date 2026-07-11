package week2;
class Parent {

    void display() {
        System.out.println("Parent Class");
    }
}

class Child extends Parent {

    @Override
    void display() {
        System.out.println("Child Class");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        Child c = new Child();

        c.display();
    }
}