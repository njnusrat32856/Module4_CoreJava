
package evidencesample3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import student.Student;

public class EvidenceSample3 {

    public static void main(String[] args) throws IOException {
        File file =new File("C:\\Users\\Dell New\\OneDrive\\Desktop\\students.dat");
        
        Student s1 =new Student("Eva", 16);
        Student s2 = new Student("Panna", 10);
        Student s3 = new Student("Jhorna", 16);
        Student s4 = new Student("Nipa",12);
        
//        DataOutputStream dos = new DataOutputStream(new FileOutputStream("students.dat"));
//        dos.writeUTF(s1.toString());
//        dos.writeUTF(s2.toString());
//        dos.writeUTF(s3.toString());
//        dos.writeUTF(s4.toString());
//        dos.close();
//        
//        DataInputStream dis = new DataInputStream(new FileInputStream("students.dat"));
//        dis.available();


        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            dos.writeUTF(s1.getName());
            dos.writeInt(s1.getAge());
            dos.writeUTF(s2.getName());
            dos.writeInt(s2.getAge());
            dos.writeUTF(s3.getName());
            dos.writeInt(s3.getAge());
            dos.writeUTF(s4.getName());
            dos.writeInt(s4.getAge());
        } catch (IOException e) {
            System.err.println("Error writing student data to file: " + e.getMessage());
        } 
        
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            while (dis.available() > 0) {
                String name = dis.readUTF();
                int age = dis.readInt();
                System.out.println("Name: " + name + ", Age: " + age);
            }
        } catch (IOException e) {
            System.err.println("Error reading student data from file: " + e.getMessage());
        }
    }
    
}
