
package teststringdimentionalarray;

import java.util.Arrays;
import java.util.Random;

public class TestStringDimentionalArray {
     
    public static void main(String[] args) {
        //Array Declaration
        int[] myListNum = new int[15];
        
//        myList[0]=20;

        for(int i =0; i < myListNum.length; i++){
            Random r = new Random();
            int num=r.nextInt(50)+1;
            myListNum[i]= num;
        }
        
        //Sum
        int sum =0;
        for(int val: myListNum){
            
            sum += val;
        }
        
        //Avg
        int avg =0;
        avg =sum/ myListNum.length;
        
        //Greater than avegare
        int count =0;
        //New list
        int[] newlist= new int[myListNum.length];
        int index =0;
        for(int val: myListNum){
            
            if(val>avg){
                count +=1;
                newlist[index]= val;
                index ++;
            }
        }
        
        int max =0;
        int min=99;
        for(int val: myListNum){
            if(max < val){  // 0<5
                max =val;   // max=5
            }
            if(min > val){
                min =val;
            }
        }
        
        int max1 =0;
        for(int i=0; i< myListNum.length-1; i++){
            if(myListNum[i] >= myListNum[i+1]){
                max1 = myListNum[i];
            }
        }
        
        System.out.println(Arrays.toString(myListNum));
        System.out.println("Sum is "+sum);
        System.out.println("Avg is "+avg);
        System.out.println("The Greater Num than avg is "+count);
        System.out.println(Arrays.toString(newlist));
        System.out.println("Max num is "+max);
        System.out.println("Min num is "+min);
        System.out.println("Max1 num is "+max);
        
        
    }
    
}
