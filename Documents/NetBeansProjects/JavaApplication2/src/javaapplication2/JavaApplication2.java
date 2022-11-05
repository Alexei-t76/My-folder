
package javaapplication2;

import java.util.Arrays;
import java.util.Comparator;


public class JavaApplication2 {

    
    public static void main(String[] args) {
        
        Box[] boxes = {
            new Box(10, 1, 1),
            new Box(1, 10, 10),
            new Box(2, 2, 2)
        };
        
        Arrays.sort(boxes);
        
        for (Box box : boxes) 
            System.out.println(box);
        
//        Arrays.sort(boxes, new Box(0,0,0).new CompareByA());

//        Arrays.sort(boxes, new Box.CompareByA());

//        Arrays.sort(boxes, Box.compareByA());

//        Arrays.sort(boxes, new Comparator<Box>() {
//            @Override
//            public int compare(Box b1, Box b2) {
//                return b1.getA() - b2.getA();
//            }
//        });

        Arrays.sort(boxes, (Box b1, Box b2) -> b1.getA() - b2.getA());
        
        for (Box box : boxes) {
            System.out.println(box);
        }
        
    }
    
}
