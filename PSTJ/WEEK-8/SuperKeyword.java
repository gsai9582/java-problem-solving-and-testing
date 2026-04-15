class Vehicle {
    int speed = 50;
}

class Car extends Vehicle {
    int speed = 100;

    void display() {
        System.out.println("Parent speed: " + super.speed);
        System.out.println("Child speed: " + speed);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}