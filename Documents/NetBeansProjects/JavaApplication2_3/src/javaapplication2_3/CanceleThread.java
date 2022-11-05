
package javaapplication2_3;


public class CanceleThread implements Runnable {
    
    private Thread self;
    private static int count;
    private int id;
    private int counter;
    private volatile boolean canWork;

    public CanceleThread() {
        id = count++;
        self = new Thread(this, "CanceleThread-" + id);
    }
    
    public int start() {
        canWork = true;
        self.start();
        return counter;
    }
    
    public int stop() {
        System.out.println("stop!");
        canWork = false;
        return counter;
    }
    
    public int interrupt() {
        System.out.println("interrupt!");
        self.interrupt();
        return counter;
    }
    
    public int join(int ms) throws InterruptedException {
        self.join(ms);
        return counter;
    }

    @Override
    public void run() {
//        while(true) {
//            try{
//                Thread.sleep(50);
//            } catch (InterruptedException ex) {
//                System.out.println("InterruptedException!");
//                break;
//            }
//            counter++;
//        }

        while(canWork) {
            counter++;
        }
    }
    
}
