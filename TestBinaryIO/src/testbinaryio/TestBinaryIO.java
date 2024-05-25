
package testbinaryio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestBinaryIO {

    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println("Hi");

        File f = new File("C:\\Users\\Dell New\\OneDrive\\Desktop\\nusrat.txt");
        
        PrintWriter write = new PrintWriter(f);
        write.print("Today I was late in my Written Exam.");
        write.append("\nI went to Bengal Book at 2.00 PM.");
        write.close();
        
        Scanner s= new Scanner(f);
        while (s.hasNext()){
            System.out.println(s.nextLine());
        }
    }
    
}
