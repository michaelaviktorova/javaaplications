/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Rok {
    
    public static int ctiRok(){
    Scanner sc = new Scanner(System.in);
    int rok;
    System.out.println("zadejte rok");
    rok = sc.nextInt();
    return rok;
    }
    
    public static void prestupny(int rok){
        System.out.println("rok"+ rok);
        
        if (rok % 4 == 0 && (rok % 100 != 0 || rok % 400 == 0 ))
            System.out.println("je prestupny");
        
    }
}
