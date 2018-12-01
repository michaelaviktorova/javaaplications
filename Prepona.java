package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Prepona {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("zadejte delku odvesen pravouhleho trojuhelnika");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = Math.sqrt(x * x + y * y);
        System.out.println("delka prepony je " + z);
   }
    
}
