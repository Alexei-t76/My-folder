
package javaapplication2_2;


public class JavaApplication2_2 {

    
    public static void main(String[] args) throws InterruptedException {
        
        DemoThread th1 = new DemoThread();
        DemoThread th2 = new DemoThread();
        
        th1.start();
        th2.start();
        
        th1.join();
        th2.join();
        
        System.out.println("End of main()!");
    }
    
}
