
package generics;

import java.util.LinkedList;

public class GenericsEvidence {
    
    public static void main(String[] args) {
        System.out.println("Generic: ");
        
        LinkedList<Student> students = new LinkedList<>();
        Student s1 = new Student("Nusrat", 1281608);
        Student s2 = new Student("Panna", 1281609);
        Student s3 = new Student("Eva", 1281610);
        Student s4 = new Student("Samima", 1281612);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        
        System.out.println(students);
        
        LinkedList<Teacher> teachers = new LinkedList<>();
        Teacher t1= new Teacher(12, "Md. Emran",
                40, "emran@gmail.com");
        teachers.add(t1);
        
        System.out.println(teachers);
    }
}
