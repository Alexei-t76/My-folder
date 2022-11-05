
package javalesson1_2;

import java.util.Arrays;


public class JavaLesson1_2 {

    
    public static void main(String[] args) {
        System.out.println("Hallo world!");
        
        int [] arr = {9,2,6,4,0,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int a = sum(2,7,5,5,8);
        System.out.println(a);
        
        StringBuilder sb = new StringBuilder();
        sb.append("Hallow");
        sb.append(' ');
        sb.append("world");
        sb.append('!');
        System.out.println(sb.toString());
    }
    
    private static int sum(int ... x) {
        int s = 0;
        for(int a : x)
            s += a;
        return s;
        
//        for (int i = 0; i < x.length; i++) {
//            s += x[i];
//        }
//        return s;
    }
    
}
