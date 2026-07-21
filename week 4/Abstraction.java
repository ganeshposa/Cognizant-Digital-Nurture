abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle Stopped");
    }
}

class Bike extends Vehicle {

    void start() {
        System.out.println("Bike Started");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Bike b = new Bike();

        b.start();
        b.stop();

    }
}