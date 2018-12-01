package javaapplication1;
import sugar.Sys;

/**
 *
 * @author admin
 */
public class Palindrom {
    public static void main(String[] args) {
        Sys.pln( "Zadejte jeden radek" );
        String radek = Sys.readLine();
        String vysl;
        if (jePalindrom(radek)) vysl = "je" ;
        else vysl = "neni" ;
        Sys.pln( "Na radku " +vysl+ " palindrom" );
    }
    
    static boolean jePalindrom(String str) {
        int i = 0, j = str.length()-1;
        while (i<j) {
            while (str.charAt(i)==' ') i++;
            while (str.charAt(j)==' ') j--;
            if (str.charAt(i)!=str.charAt(j))return false;
            i++; j--;
        }
        return true;
    }
}
