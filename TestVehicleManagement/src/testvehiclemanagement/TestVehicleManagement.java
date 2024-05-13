
package testvehiclemanagement;

import vehiclesystem.Truck;

public class TestVehicleManagement {

    public static void main(String[] args) {
        
        Truck myTruck = new Truck(2001,60, 3000, "Yellow");
        
        System.out.println("Truck Sale Price: $" + myTruck.getSalePrice());
        System.out.println(myTruck.getRegularPrice());
    }
    
}
