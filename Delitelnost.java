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
