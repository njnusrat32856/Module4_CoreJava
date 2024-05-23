
package testtwodimensionalarray;

import java.util.Random;

public class TestTwoDimensionalArray {

    public static void main(String[] args) {
        
//        System.out.println("HI");

        int[][] numbers = new int[3][4];
        
        Random random = new Random();
        
        for(int row=0; row < numbers.length; row++){
            for(int column = 0; column < numbers[0].length; column++){
                int randomNumber = random.nextInt(20);
                numbers[row][column] = randomNumber;
            }
        }
    }
    
}
