class Printer<T> {
    T value;
    Printer(T value) { this.value = value; }
    void print() { System.out.println(value); }
}

public class GenericsExample {
    public static void main(String[] args) {
        Printer<Integer> p1 = new Printer<>(10);
        Printer<String> p2 = new Printer<>("Hello");
        p1.print();
        p2.print();
    }
}