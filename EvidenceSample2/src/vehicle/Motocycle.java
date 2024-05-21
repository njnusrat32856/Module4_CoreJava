
package vehicle;

public class Motocycle extends VehicleManage{

    public Motocycle() {
    }

    public Motocycle(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }
    
    

    @Override
    public void start() {
        System.out.println("Motorcycle engine started.");
        
//        throw new UnsupportedOperationException("Motorcycle engine started."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle engine stopped. ");
//        throw new UnsupportedOperationException("Motorcycle engine stopped."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
