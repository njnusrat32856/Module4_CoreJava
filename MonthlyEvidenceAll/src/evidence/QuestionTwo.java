
package evidence;

import vehiclemanagement.Car;
import vehiclemanagement.Motorcycle;
import vehiclemanagement.Vehicle;


public class QuestionTwo {
    
    public static void main(String[] args) {
        System.out.println("Second Question answer.");
        
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
        
        //Polymorphism
        Vehicle carVehicle = new Car();
        carVehicle.start();
        carVehicle.stop();
        
        Vehicle motorVehicle = new Motorcycle();
        motorVehicle.start();
        motorVehicle.stop();
    }
}
