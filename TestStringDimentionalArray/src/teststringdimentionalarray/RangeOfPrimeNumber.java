
package teststringdimentionalarray;

import java.util.Arrays;

public class RangeOfPrimeNumber {
    
    public static void main(String[] args) {
        
        int[] numArray= new int[100];
        
        for(int i=1; i< numArray.length; i++){
            numArray[i]= i+1;
        }
        int[] result =rangeOfPrimeNum(numArray);
        System.out.println(Arrays.toString(result));
    }
    public static int[] rangeOfPrimeNum(int[] myArray){
    
        int[] newArray = new int[50];
        int index=0;
        
        for(int item: myArray){
            
            int count=0;
            for(int i=1; i <= item; i++){
                if(item%i ==0){
                    count++;
                }
            }
            
            if( count== 2){
                newArray[index]= item;
                index++;
            }
        }
        return newArray;
    }
}
