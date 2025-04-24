
package bankmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class BankManagement {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. View All Accounts");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Delete Account");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter name: ");
                        sc.nextLine(); 
                        String name = sc.nextLine();
                        System.out.print("Enter initial balance: ");
                        double balance = sc.nextDouble();
                        BankAccount account = new BankAccount(name, balance);
                        accounts.add(account);
                        System.out.println("Account created: " + account);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    for (BankAccount acc : accounts) {
                        System.out.println("Account Details: " + acc);
                    }
                    break;

                case 3:
                    System.out.print("Enter account ID: ");
                    int depId = sc.nextInt();
                    System.out.print("Enter deposit amount: ");
                    double depAmt = sc.nextDouble();
                    accounts.stream()
                            .filter(a -> a.getId() == depId)
                            .findFirst()
                            .ifPresentOrElse(a -> a.deposit(depAmt),
                                    () -> System.out.println("Account not found."));
                    break;

                case 4:
                    System.out.print("Enter account ID: ");
                    int witId = sc.nextInt();
                    System.out.print("Enter withdraw amount: ");
                    double witAmt = sc.nextDouble();
                    accounts.stream()
                            .filter(a -> a.getId() == witId)
                            .findFirst()
                            .ifPresentOrElse(a -> a.withdraw(witAmt),
                                    () -> System.out.println("Account not found."));
                    break;

                case 5:
                    System.out.print("Enter account ID to delete: ");
                    int delId = sc.nextInt();
                    boolean removed = accounts.removeIf(a -> a.getId() == delId);
                    if (removed) {
                        System.out.println("Account deleted.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        
    }
    
}
