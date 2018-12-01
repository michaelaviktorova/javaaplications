package javaapplication1;
import sugar.Sys;

/**
 *
 * @author admin
 */
public class Matice {
    public static void main(String[] args) {
        Sys.pln("zadejte pocet radku a pocet sloupcu matice");
        int r = Sys.readInt();
        int s = Sys.readInt();
        int[][] m1 = ctiMatici(r, s);
        int[][] m2 = ctiMatici(r, s);
        int[][] m3 = soucetMatic(m1, m2);
        Sys.pln("soucet matic");
        vypisMatice(m3);
 }
    
static int[][] ctiMatici(int r, int s) {
    int[][] m = new int[r][s];
    Sys.pln("zadejte celocislenou matici "+r+"x"+s);
    for (int i=0; i<r; i++)
        for (int j=0; j<s; j++)
            m[i][j] = Sys.readInt();
    return m;
 }
    
static void vypisMatice(int[][] m) {
    for (int i=0; i<m.length; i++) {
        for (int j=0; j<m[i].length; j++)
            Sys.p(m[i][j]+" ");
            Sys.pln();
    }
 }
    
static int[][] soucetMatic(int[][] m1, int[][] m2) {
    int r = m1.length;
    int s = m1[0].length;
    int[][] m = new int[r][s];
    for (int i=0; i<r; i++)
        for (int j=0; j<s; j++)
            m[i][j] = m1[i][j]+m2[i][j];
        return m;
}

}
