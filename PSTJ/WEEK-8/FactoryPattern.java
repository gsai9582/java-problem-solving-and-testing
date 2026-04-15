interface Animal {
    void speak();
}

class Cat implements Animal {
    public void speak() {
        System.out.println("Meow");
    }
}

class Dog implements Animal {
    public void speak() {
        System.out.println("Bark");
    }
}

class AnimalFactory {
    public static Animal getAnimal(String type) {
        if(type.equalsIgnoreCase("cat")) return new Cat();
        else return new Dog();
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        Animal a = AnimalFactory.getAnimal("cat");
        a.speak();
    }
}