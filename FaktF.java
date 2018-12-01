package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class FaktF {
    static int ctiPrirozene(){
        Scanner sc = new Scanner(System.in);
        System.out.println("zadejte prirozene cislo");
        int n =sc.nextInt();
        if (n<1) {
            System.out.println(n+ " neni prirozene cislo");
            System.exit(0);       
        }
        return n;
    
    }
    static int faktorial(int n){
        int i = 1;
        int f = 1;
        while (i < n){
        f = f * i;
    }
    return f;
    
    }
    public static void main(String[] args){
        System.out.println("faktorial je"+faktorial(ctiPrirozene()));
    }
}