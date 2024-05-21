
package evidencesample2;

import vehicle.Car;
import vehicle.Motocycle;

public class EvidenceSample2 {

    public static void main(String[] args) {
        
        Car c= new Car("NJN23", "BMW", 2020);
        c.start();
        c.stop();
        
        Motocycle m =new Motocycle("ABC", "Honda", 2021);
        m.start();
        m.stop();
    }
    
}
