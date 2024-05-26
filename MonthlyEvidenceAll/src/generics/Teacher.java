
package generics;

public class Teacher extends Student<Object>{
    
    private Object id;
    private Object name;
    private Object age;
    private Object email;

    public Teacher() {
    }

    public Teacher(Object id, Object name, Object age, Object email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public Object getId() {
        return id;
    }

    @Override
    public void setId(Object id) {
        this.id = id;
    }

    @Override
    public Object getName() {
        return name;
    }

    @Override
    public void setName(Object name) {
        this.name = name;
    }

    public Object getAge() {
        return age;
    }

    public void setAge(Object age) {
        this.age = age;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Teacher{" + "id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + '}';
    }

    
    
    
}
