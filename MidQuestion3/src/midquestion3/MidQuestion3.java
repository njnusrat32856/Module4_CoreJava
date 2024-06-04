
package midquestion3;

import printcharandnum.PrintChar;
import printcharandnum.PrintNum;

public class MidQuestion3 {

    public static void main(String[] args) {
        
        Runnable printA = new PrintChar('a', 50);
        Runnable printB = new PrintChar('b', 50);
        Runnable print50 = new PrintNum(50);
        
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print50);
        
        thread1.start();
        thread2.start();
        thread3.start();
    }
    
}
