public class AccountService {
    private int balance = 1000;

    public synchronized void deposit(int amount){
        balance += amount;
    }

    public synchronized void withdraw(int amount){
        if(balance >= amount){
            balance -= amount;
        }
    }

    public int getBalance(){
        return balance;
    }
}