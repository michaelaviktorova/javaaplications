package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ObvodKruhu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("zadejte polomer kruhu");
        double r = sc.nextDouble();
        System.out.println("obvod kruhu je " + 2 * Math.PI * r);
    }
}
