package javaapplication1;
import sugar.Sys;

/**
 *
 * @author admin
 */
public class Hexa {
    final static String hexa = "0123456789abcdef";
static String hexadecimal(int x) {
    if (x==0) return "0" ;
    char[] znaky = new char[9];
    int y;
    if (x<0) y=-x; else y=x;
    int prvni = 9; 
    do {
        prvni--; 
        znaky[prvni] = hexa.charAt(y%16); 
        y = y / 16; 
    } while (y>0);
    if (x<0) {
        prvni--; znaky[prvni] = '-'; 
    }
    return new String(znaky, prvni, 9-prvni); 
    }

static int hexToInt(String s){
    int n = 0;
    boolean minus = false;

if(s.charAt(0)=='-'){
    s = s.substring(1);
    minus = true;
}

for (int i = s.length() - 1; i >= 0; i--){
    n = n +(int) (hexa.indexOf(s.charAt(i)) * Math.pow(16, s.length() - 1 - i));
//    System.out.println("n= "+n);
}
return minus ? -n : n;
}

public static void main(String[] args){
    Sys.pln("zadejte cele cislo:");
    int n = Sys.readInt();
    String s = hexadecimal(n);
    Sys.pln("hexa tvar: " + s);
    Sys.pln("puvodni cislo: " + hexToInt(s));
}
}
