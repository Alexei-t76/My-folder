
package javaapplication2_3;


public class JavaApplication2_3 {

    
    public static void main(String[] args) throws InterruptedException {
        
        CanceleThread tr1 = new CanceleThread();
        
        System.out.println("start() = " + tr1.start());
        System.out.println("join() = " + tr1.join(1000));
        System.out.println("stop() = " + tr1.stop());
        
    }
    
}
