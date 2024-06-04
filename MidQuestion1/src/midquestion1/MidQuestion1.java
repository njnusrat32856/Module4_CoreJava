
package midquestion1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MidQuestion1 {

    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("C:\\Users\\Admin\\Desktop\\nusrat.txt");
        
        PrintWriter writer= new PrintWriter(file);
        
        writer.print("Name: ");
        writer.append("\nNusrat");
        writer.append("\nNaima");
        writer.append("\nEva");
        writer.close();
        
        Scanner scanner= new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        
    }
    
}
