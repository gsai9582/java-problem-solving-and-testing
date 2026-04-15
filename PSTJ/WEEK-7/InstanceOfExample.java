class Animal {}
class Dog extends Animal {}

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a instanceof Dog);
    }
}