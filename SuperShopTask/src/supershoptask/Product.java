/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supershoptask;

/**
 *
 * @author Naima
 */
public class Product {
    
    int productId;
    String name;
    double price;
    Category category;
    double quantity;
    double totalPrice;
    
//    double tax;

    public Product(String name, double price, Category category,double quantity) throws InvalidPriceException{
        
        if (price < 0) {
            throw new InvalidPriceException("Price cannot be negative.");
        }
        
        this.name = name;
       
        this.price = price;
        this.category = category;
        this.quantity = quantity;
//        this.totalPrice = quantity * price;
        productId += 1;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    
    

//    @Override
//    public String toString() {
//        return    name + ", Price:" + price + ", Category:" + category + ", Quantity:" + quantity + ", Total Price:" + totalPrice ;
//    }
    
    
    
}
