package javaapplication1;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class KopieSouboru1 {
    
    static String inF = "vstup.txt";
    static String outF = "vystup.txt";
    
    
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream(new File (inF));
        FileOutputStream out = new FileOutputStream (new File (outF));
    }
    
}
