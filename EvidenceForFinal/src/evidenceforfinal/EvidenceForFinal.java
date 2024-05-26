
package evidenceforfinal;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EvidenceForFinal {

    public static void main(String[] args) {
        
        ArrayList<Integer> myList =new ArrayList<>();
        
        Random r = new Random();
        
        for(int i=0; i < 100; i++){
            myList.add(r.nextInt(100));
        }
        System.out.println("Array List: "+myList);
        
        Scanner s= new Scanner(System.in);
        System.out.println("Enter index: ");
        
        try {
            int index= s.nextInt();
            System.out.println("Index of Array List result is: " + myList.get(index));
        } catch (IndexOutOfBoundsException e){
            System.out.println("Out of bBounds");
        }
        
        catch (Exception e) {
            System.out.println("e");
        }
    }
    
}
