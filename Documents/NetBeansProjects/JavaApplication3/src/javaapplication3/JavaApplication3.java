
package javaapplication3;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JavaApplication3 {

    
    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            file.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return;
        }
        
        File dir = new File(".");
        File[] files = dir.listFiles((File a) -> a.isFile());
        for (File f : files) {
            System.out.println(f.getName());
        }
    }
    
}
