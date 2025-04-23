/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supershoptask;

/**
 *
 * @author Naima
 */
public class Transaction {
    
    static int transactionId = 0;
    UserPart user;
    Product product;
    PaymentMethod paymentMethod;
    
    

    public Transaction(UserPart user, Product product, PaymentMethod paymentMethod) {
        this.user = user;
        this.product = product;
        this.paymentMethod = paymentMethod;
        
        transactionId += 1;
        
    }

    @Override
    public String toString() {
        
        return "tid"+ transactionId+"\nUser: " + user +
           "\nProduct: " + product.getName() +
           "\nPrice: " + product.getPrice() +
           "\nQuantity: " + product.getQuantity() +
           "\nTotal Price: $" + product.getQuantity() * product.getPrice() +
           "\nPayment Method: " + paymentMethod;
}
    
    
    
}
