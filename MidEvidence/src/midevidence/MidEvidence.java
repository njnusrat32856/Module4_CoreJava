
package midevidence;

import productpackage.Electronicproduct;
import productpackage.Product;

public class MidEvidence {

    public static void main(String[] args) {
        
        Product product= new Electronicproduct(1, "PC", 30000);
        
        System.out.println("Electronic Product Price: " + product.getSalePrice());
    }
    
}
