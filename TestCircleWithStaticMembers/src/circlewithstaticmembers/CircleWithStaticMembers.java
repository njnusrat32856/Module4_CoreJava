
package circlewithstaticmembers;

public class CircleWithStaticMembers {
    
    double radius;
    
    static int numberOfObjects =0;

    public CircleWithStaticMembers() {
        radius =1;
        numberOfObjects++;
    }

    public CircleWithStaticMembers(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }
    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    
    double getArea(){
        return radius * radius * Math.PI;
    }
}
