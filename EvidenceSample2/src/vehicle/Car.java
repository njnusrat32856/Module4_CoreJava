
package vehicle;

public class Car extends VehicleManage{

    public Car() {
    }

    public Car(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }
    

    @Override
    public void start() {
        System.out.println("Car engine started. ");
//        throw new UnsupportedOperationException("Car engine started. "); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped. ");
//        throw new UnsupportedOperationException("Car engine stopped. "); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
