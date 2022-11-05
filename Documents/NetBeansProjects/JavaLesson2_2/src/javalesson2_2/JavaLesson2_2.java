
package javalesson2_2;


public class JavaLesson2_2 {

    
    public static void main(String[] args) throws ClassNotFoundException {
        
        System.out.println("Total points: " + Point.getPointCounter());
        
        Point p1 = new Point();
        p1.setX(2);
        p1.setY(5);
        System.out.println(p1.getID() + ":" + p1 + " lenght = " + p1.getLength());
        
        Point p2 = new Point(6, 8);
        System.out.println(p2.getID() + ":" + p2 + " lenght = " + p2.getLength());
        
        System.out.println("Total points: " + Point.getPointCounter());
        
        System.out.println("Distans = " + p1.distanceTo(p2));
        
        Point p3 = p1.addTo(p2);
        System.out.println(p3.getID() + ":" + p3 + " lenght = " + p3.getLength());
        
        System.out.println("Total points: " + Point.getPointCounter());

//        Class.forName("javalesson2_2.Point");
    }
    
}
