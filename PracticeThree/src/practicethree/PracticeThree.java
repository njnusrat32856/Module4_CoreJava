
package practicethree;

public class PracticeThree {

    public static void main(String[] args) {
        
        System.out.println("Hi");
        int[][] array ={{1,2},{3,4},{5,6}};
        
//        for(int i=array.length-1; i>=0; i--){
//            for(int j=array[i].length-1; j>=0; i--){
//                System.out.println(array[i][j]+" ");
//            }
//            System.out.println();
//        }
        
        int sum=0;
        for(int i=0; i < array.length; i++){
            sum += array[i][0];
        }
        System.out.println("Sum= " + sum);
    }
    
}
