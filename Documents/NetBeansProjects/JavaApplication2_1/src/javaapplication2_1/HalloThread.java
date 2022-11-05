
package javaapplication2_1;


public class HalloThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName() + "!");
    }
    
    
    
}
