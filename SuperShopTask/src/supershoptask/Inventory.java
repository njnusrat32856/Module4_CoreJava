/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supershoptask;

/**
 *
 * @author Naima
 */
public class Inventory {
    
    private final Product[] products;

    public Inventory(Product[] products) {
        this.products = products;
    }
    
    public Product getProductById(int id){
        for(Product p : products){
            if(p.getProductId()== id){
                return p;
            }
            
        }
        return null;
    }

    public boolean isAvailable(int id, int quantity){
        Product product = getProductById(id);

        return product != null & product.getQuantity() >= quantity;
    }

    public void displayProduct(){
        for(Product product : products){
            System.out.println(product.getProductId()+ ". " + product.getName());
        }
    }

    public void stock(int id, int quantity){
        Product p = getProductById(id);

        if(p != null && p.getQuantity() >= quantity){
            p.setQuantity(p.getQuantity() - quantity);
        }
    }
    
}
