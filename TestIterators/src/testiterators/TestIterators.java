
package testiterators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterators {

    public static void main(String[] args) {
        
        Collection<String> c =new ArrayList<>();
        c.add("New York");
        c.add("Atlanta");
        c.add("Dallas");
        c.add("Madison");
        
        Iterator<String> i = c.iterator();
        while (i.hasNext()){
            System.out.println(i.next().toUpperCase() + " ");
        }
        
        System.out.println();
    }
    
}
