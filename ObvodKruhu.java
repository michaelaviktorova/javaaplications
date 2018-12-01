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
public class ObvodKruhu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("zadejte polomer kruhu");
        double r = sc.nextDouble();
        System.out.println("obvod kruhu je " + 2 * Math.PI * r);
    }
}
