package tobbdimenziostombok;

public class Szorzotabla {
    public static void main(String[] args) {
        final int MERET = 5;
        /* létrehozás */
        int[][] tabla = new int [MERET+1][MERET+1];
        
        /* Feltöltés */
        for (int sor = 0; sor <= MERET; sor++) {
            for (int oszl = 0; oszl <= MERET; oszl++) {
                tabla[sor][oszl] = sor*oszl;
            }
        }
        
        /* Megjelenítés */
        for (int i = 1; i <= MERET; i++) {
            for (int j = 1; j < MERET; j++) {
                System.out.printf("%4d", tabla[i][j]);
            }
            System.out.println("");
        }
    }
}
