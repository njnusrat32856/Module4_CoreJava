
package evidencesample1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EvidenceSample1 {

    public static void main(String[] args) {
        
        // Try by myself
//        int[] arr = new int[100];
//        Random random = new Random();
//        
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = random.nextInt(100);
//            System.out.println(arr[i]);
//        }
//        
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter an index: ");
//        
//        int index = s.nextInt();
//        
//        
//        try{
//            int value = arr[index];
//            System.out.println("Element at index " + index + " is: " + value);
//        } catch(IndexOutOfBoundsException e){
//            System.out.println("Out of Bounds");
//        }
        
        
        
        
//        ArrayList<Integer> myList =new ArrayList<>();
//        try{
//            Random number = new Random();
//            for(int i= 0; i < 100; i++){
//                myList.add(number.nextInt(101));
//                
//            }
//            System.out.println(myList);
//            Scanner s= new Scanner(System.in);
//            System.out.println("Enter index: ");
//            int index = s.nextInt();
//            System.out.println(myList.get(index));
//        } catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Out of Bounds");
//        } catch(Exception e){
//            System.out.println(" " + e);
//        }



        List<Integer> myList = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            myList.add(random.nextInt(201));
        }
        System.out.println("List: " + myList);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Index: ");

        try {
            int index = scanner.nextInt();
            System.out.println(myList.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
