
package evidence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class QuestionThree {
    
    public static void main(String[] args) {
        System.out.println("Provide the Java code showcasing Binary I/O operations.");
        
        List<StudentForQ3> students = new ArrayList<>();
        
        students.add(new StudentForQ3("Najmul", 20));
        students.add(new StudentForQ3("Raju", 22));
        students.add(new StudentForQ3("Nusrat", 19));
        
        writeStudentsToFile(students);
        
         List<StudentForQ3> readStudents = readStudentsFromFile();
        for (StudentForQ3 student : readStudents) {
            System.out.println(student);
        }
    }
    private static final String FILE_NAME = "students.dat";
    
    public static void writeStudentsToFile(List<StudentForQ3> students) {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
    
    public static List<StudentForQ3> readStudentsFromFile() {
        List<StudentForQ3> students = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            students = (List<StudentForQ3>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
        return students;
    }
}
