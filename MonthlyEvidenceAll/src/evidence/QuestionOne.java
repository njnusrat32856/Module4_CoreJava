
package evidence;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuestionOne {
    
    public static void main(String[] args) {
        System.out.println("Write a Java program that creates an array with 100 randomly chosen integers. It prompts the user "
                + "for an index and displays the corresponding element value. If the index is out of bounds, it shows \"Out of Bounds\" with an "
                + "exception handler.");
        
        ArrayList<Integer> myList = new ArrayList<>();
        try {
            Random r = new Random();
            for(int i=0; i < 100; i++){
                myList.add(r.nextInt(101));
            }
            System.out.println(myList);
            Scanner s = new Scanner(System.in);
            System.out.println("Enter index: ");
            int index = s.nextInt();
            System.out.println(index + " No. index  of Array List is " + myList.get(index));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        } catch (Exception e) {
            System.out.println(" " + e);
        }
    }
}
