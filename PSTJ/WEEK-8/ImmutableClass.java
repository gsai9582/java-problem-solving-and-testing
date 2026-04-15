final class Immutable {
    private final int value;

    public Immutable(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class ImmutableClass {
    public static void main(String[] args) {
        Immutable obj = new Immutable(10);
        System.out.println(obj.getValue());
    }
}