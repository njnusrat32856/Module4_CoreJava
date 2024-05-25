
package testgenerics;

import java.util.ArrayList;
import student.Student;

public class TestGenerics {

    public static void main(String[] args) {
        
        ArrayList<String> stringList = new ArrayList<>();
        
        stringList.add("Nusrat");
        stringList.add("Jahan");
        
        System.out.println(stringList);
        
        ArrayList<Integer> intList = new ArrayList<>();
        
        intList.add(14);
        intList.add(10);
        intList.add(2000);
        
        System.out.println(intList);
        
        ArrayList<Student> stuList = new ArrayList<>();
        
        stuList.add(new Student(1, "Eva", "eva@gmail.com"));
        stuList.add(new Student(2, "Jhorna", "eva@gmail.com"));
        stuList.add(new Student(3, "Panna", "eva@gmail.com"));
        
        System.out.println(stuList);
    }
    
}
