
package javaapplication5;


public class Singleton {
    
    private static volatile Singleton instance;
    
    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if(instance == null) instance = new Singleton();
        return instance;
    }
    
    
}
