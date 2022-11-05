
package javaapplication23;

import sun.misc.Unsafe;


public class JavaApplication23 {

    
    public static void main(String[] args) {
        NewClass1 v = new NewClass1("Vasy");
        System.out.println(v.getName());
        
        NewClass1 f = new NewClass1("Fedy");
        System.out.println(f.getName());
        
        int [] a = {0,0,0,0,0,0,0,0,0,0,0};
        a[0] = 5;
        a[1] = 10;
        a[2] = 15;
        a[10] = 8;
        
        for (int i = 0; i <= 10; i++) {
            a[i] = i;
            System.out.println(a[i]);
        }
        
    }

    
    
}
