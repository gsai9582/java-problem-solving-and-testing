class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void show() {
        System.out.println("Singleton instance created");
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        obj.show();
    }
}