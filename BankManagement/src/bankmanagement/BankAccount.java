
package bankmanagement;


public class BankAccount {
    
    private static int counter = 1;
    private int id;
    private String name;
    private double balance;
    
    public BankAccount(String name, double balance) throws BalanceException{
        if (balance < 500) {
            throw new BalanceException("Minimum balance must be at least 500.");
        }
        this.id = counter++;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
            return;
        }
        if (balance - amount < 500) {
            System.out.println("Insufficient balance. Must maintain minimum of 500.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Balance: " + balance;
    }
    
}
