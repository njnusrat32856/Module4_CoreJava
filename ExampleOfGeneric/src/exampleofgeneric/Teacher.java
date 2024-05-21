
package exampleofgeneric;

public class Teacher<E> {
    
    private E data;

    public Teacher(E data) {
        this.data = data;
    }

    public Teacher() {
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    
    
    public void addData(E names){
        this.data= names;
    }
}
