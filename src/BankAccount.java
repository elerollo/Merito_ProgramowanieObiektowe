import java.util.LinkedList;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private List<String> transactions = new LinkedList<>();

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions.add("Withdrawn: " + amount);
    }

    public void printTransactionHistory() {
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }

}
