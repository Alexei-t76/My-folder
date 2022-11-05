
package javaapplication1;


public class JavaApplication1 {

    
    public static void main(String[] args) {
        Rect r1 = new Rect(5,8,4,10,"Rect-0");
        Circle c1 = new Circle(10,5,8,"Circle-0");
        
//        System.out.println(r1);
//        System.out.println(c1);
        
        Shape [] shapes = {
            r1, c1, new Rect(1,4,10,20,"Rect-1")
        };
        
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        
//        printAreas(shapes);

        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
    }

//    private static void printAreas(Shape[] shapes) {
//        for (Shape shape : shapes) {
//            if(shape instanceof Rect)
//                System.out.println(((Rect)shape).area());
//            else if(shape instanceof Circle)
//                System.out.println(((Circle)shape).area());
//        }
//    }
    
}
