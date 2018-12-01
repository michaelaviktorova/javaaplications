package javaapplication1;
import sugar.Sys;

/**
 *
 * @author admin
 */
public class Sugar {
 public static void main(String[] args) {
    Sys.pln("zadejte počet čísel");
    int[] pole = new int[Sys.readInt()];
    Sys.pln("zadejte "+pole.length+" čísel");
    for (int i=0; i<pole.length; i++)
        pole[i] = Sys.readInt();
    Sys.pln("výpis čísel v obráceném pořadí");
    for (int i=pole.length-1; i>=0; i--)
    Sys.pln(pole[i]);
 }
}