
package testfileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class TestFileClass {

    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println("Hi");

        File file =new File("C:\\Users\\Dell New\\OneDrive\\Desktop\\nusrat.txt");
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.length());
        System.out.println(file.isDirectory());
        System.out.println(file.isAbsolute());
        System.out.println(file.isHidden());
        System.out.println(new Date(file.lastModified()));
        
        PrintWriter output = new PrintWriter(file);
        output.append("Hello,");
        output.append(" Nusrat");
        
        output.close();
        
        Scanner input = new Scanner(file);
        System.out.println(input.nextLine());
    }   
    
    
}
