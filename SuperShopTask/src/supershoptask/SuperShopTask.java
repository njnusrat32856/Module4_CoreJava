
package supershoptask;

import java.util.Scanner;


public class SuperShopTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
//        try {
//            Product dress = new Product("Tops", 8000, Category.Fashion, 1);
//            Product milk = new Product("Milk", 2.5, Category.Grocery, 10);
//
//            UserPart user = new UserPart("Nusrat");
//
//
//            Transaction t1 = new Transaction(user, dress, PaymentMethod.Card);
//            Transaction t2 = new Transaction(user, milk, PaymentMethod.Cash);
//
//            
//            System.out.println(t1);
//            System.out.println(t2);
//
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }




        Scanner scanner = new Scanner(System.in);

        
        try {
            
            
            System.out.print("Enter your name: ");
            String userName = scanner.nextLine();
            UserPart user = new UserPart(userName);

            
            System.out.print("Enter product name: ");
            String productName1 = scanner.nextLine();
            
            System.out.print("Select category (1. Grocery, 2. Fashion): ");
            int catChoice1 = scanner.nextInt();
            Category category1 = (catChoice1 == 1) ? Category.Grocery : Category.Fashion;
            

            System.out.print("Enter product price: ");
            double price1 = scanner.nextDouble();

            System.out.print("Enter product quantity: ");
            double quantity1 = scanner.nextDouble();

            

            Product product1 = new Product(productName1, price1, category1, quantity1);

            
            System.out.print("Select payment method (1. Cash, 2. Card): ");
            int payChoice1 = scanner.nextInt();
            PaymentMethod paymentMethod1 = (payChoice1 == 1) ? PaymentMethod.Cash : PaymentMethod.Card;

            Transaction t1 = new Transaction(user, product1, paymentMethod1);

            System.out.println("\nTransaction Summary:");
            System.out.println(t1);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }


    }
    
}
