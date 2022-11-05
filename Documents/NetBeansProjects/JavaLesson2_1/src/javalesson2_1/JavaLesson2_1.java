
package javalesson2_1;


public class JavaLesson2_1 {

    
    public static void main(String[] args) {
        Test test = new Test();
        test.setX(500);
        System.out.println(test.getX());
    }
    
}


class Test {
    private int x;
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getX() {
        return x;
    }
}
