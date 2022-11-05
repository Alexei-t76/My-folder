
package javalesson2_2;


public class Point {
    private int x, y;
    private double length;
    private static int pointCounter;
    private final int pointID;

    static {
        System.out.println("Static Block!");
    }
    
    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
        pointID = pointCounter++;
    }

    public int getX() {
        return x;
    }

    public final void setX(int x) {
        this.x = x;
        length();
    }

    public int getY() {
        return y;
    }

    public final void setY(int y) {
        this.y = y;
        length();
    }

    public double getLength() {
        return length;
    }

    public int getID() {
        return pointID;
    }

    public double distanceTo(Point rValue) {
        return Math.sqrt((this.x-rValue.x)*(this.x-rValue.x)+(this.y-rValue.y)*(this.y-rValue.y));
    }
    
    public Point addTo(Point rValue) {
        return new Point(x+rValue.x, y+rValue.y);
    }
    
    public static int getPointCounter() {
        return pointCounter;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(" (");
        sb.append(x);
        sb.append(", ");
        sb.append(y);
        sb.append(')');
        return sb.toString();
    }
    
    private void length() {
        length = Math.sqrt(x*x + y*y);
    }
}
