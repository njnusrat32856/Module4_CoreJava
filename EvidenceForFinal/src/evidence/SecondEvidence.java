
package evidence;

import vehicle.Car;
import vehicle.Motorcycle;

public class SecondEvidence {

    public static void main(String[] args) {
        
        Car car= new Car("Bmw-123", "BMW", 10);
//        car.getBrand();
//        car.getRegistrationNumber();
//        car.getYear();
        car.start();
        car.stop();
//        System.out.println("car details: " + car.toString());
        
        Motorcycle motorcycle= new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
    }
}
