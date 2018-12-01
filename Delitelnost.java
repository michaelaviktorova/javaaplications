package javaapplication1;
import java.util.Scanner;


/**
 *
 * @author admin
 */
public class Delitelnost {
    public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Zadejte delenec a delitel");
            int cislo = sc.nextInt();
            int delitel = sc.nextInt();
            String s = (cislo%delitel==0)? "je":"neni";
            System.out.println("cislo " +cislo+" " +s+" delitelne cislem: " +delitel);
            
    }
}
