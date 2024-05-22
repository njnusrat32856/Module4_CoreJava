
package teststringdimentionalarray;

import java.util.Random;
import java.util.Arrays;

public class TestArrayWithMethod {

    public static void main(String[] args) {
         //Array Declaration
        int[] myListNum = new int[15];

        for(int i =0; i < myListNum.length; i++){
            Random r = new Random();
            int num=r.nextInt(50)+1;
            myListNum[i]= num;
        }
        System.out.println(Arrays.toString(myListNum));
        int maxNumber = maxNumber(myListNum);
        int avg = avg(myListNum);
        
        minNumber(myListNum);
        System.out.println("Max Num "+maxNumber);
        System.out.println("Avg "+avg);
    }
    public static int maxNumber(int[] myArray){
    
        int max= myArray[0];
        for(int val: myArray){
            if(max < val){
                max =val;
            }
        }
        
        return max;
    }
    public static void minNumber(int[] myArray){
        
        int min= myArray[0];
        for (int val: myArray){
        
            if(min > val){
                min= val;
            }
        }
        System.out.println("Min Num "+min);
    }
    public  static int avg(int[] myArray){
        
        int sum =0;
        int avg =0;
        
        for(int val: myArray){
            sum+= val;
        }
        avg = sum / myArray.length;
        
        return  avg;
    }
}
