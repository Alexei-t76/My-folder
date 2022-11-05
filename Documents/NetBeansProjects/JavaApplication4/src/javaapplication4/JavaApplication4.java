
package javaapplication4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JavaApplication4 {

    
    public static void main(String[] args) {
        
        writeFile("Hallo.txt");
        
        try{
            String str = redFile("Hallo.txt");
            System.out.println(str);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void writeFile(String hallotxt) {
        try(FileWriter writer = new FileWriter(hallotxt)) {
            writer.write("Привет, из Java!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static String redFile(String stringtxt) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(stringtxt), "cp1251"));
        String str = reader.readLine();
        return str;
    }
    
    
}
