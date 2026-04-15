// Debugging Loop Error
public class LoopDebug {
    public static void main(String[] args) {
        int i = 0;

        while(i < 5){
            System.out.println("i = " + i);
            i++; // Fix infinite loop
        }
    }
}