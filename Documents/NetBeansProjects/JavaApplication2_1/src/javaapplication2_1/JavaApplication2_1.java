
package javaapplication2_1;

import java.util.logging.Level;
import java.util.logging.Logger;


public class JavaApplication2_1 {

    
    public static void main(String[] args) {
        
        System.out.println("Start of " + Thread.currentThread().getName());
        
        HalloThread thread = new HalloThread();
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("End of main!");
        
    }
    
}
