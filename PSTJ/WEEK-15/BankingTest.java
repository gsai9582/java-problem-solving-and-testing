public class BankingTest {
    public static void main(String[] args) throws InterruptedException {
        AccountService acc = new AccountService();

        Thread[] threads = new Thread[100];

        for(int i=0;i<50;i++){
            threads[i] = new Thread(() -> acc.deposit(100));
        }

        for(int i=50;i<100;i++){
            threads[i] = new Thread(() -> acc.withdraw(50));
        }

        for(Thread t : threads) t.start();
        for(Thread t : threads) t.join();

        System.out.println("Final Balance: " + acc.getBalance());
    }
}