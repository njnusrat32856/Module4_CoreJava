
package midquestion2;

import vehiclemanagement.Truck;

public class MidQuestion2 {

    public static void main(String[] args) {
        
        Truck t = new Truck(2500, 20, 50000, "Black");
        
        System.out.println("Truck Sale Price: $ " + t.getSalePrice());
        
        System.out.println("Regular Price: $ " + t.getRegularPrice());
    }
    
}
