
package evidence;

import java.io.Serializable;

public class StudentForQ3 implements Serializable{

    private String name;
    private int age;

    public StudentForQ3() {
    }

    public StudentForQ3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentForQ3{" + "name=" + name + ", age=" + age + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
