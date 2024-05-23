
package testcirclewithstaticmembers;

import circlewithstaticmembers.CircleWithStaticMembers;

public class TestCircleWithStaticMembers {

    public static void main(String[] args) {
        
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " + CircleWithStaticMembers.getNumberOfObjects());
        
        CircleWithStaticMembers c1 = new CircleWithStaticMembers(5);
        
        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" +c1.getRadius()+ ") and number of circle objects (" + c1 +")");
        
    }
    
}
