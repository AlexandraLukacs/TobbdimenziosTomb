package tobbdimenziostombok;

import java.util.Random;


public class MelyikKockaval {
    
    static Random rnd = new Random();
    
    public static void main(String[] args) {
        final int dobas_db = 500;
        final int kocka_oldal = 6;
        int[][] dobasok = new int [dobas_db+1][kocka_oldal+1];
        
        /* Feltöltés */
        for (int i = 0; i < dobas_db; i++) {
            int dobas1 = (int)(Math.random()*kocka_oldal)+1;
            int dobas2 = (int)(Math.random()*kocka_oldal)+1;
            dobasok[dobas1][dobas2]++;
        }
        
        /* Megjelenítés */
        System.out.println("Mennyiszer:");
        for (int sor = 0; sor <= kocka_oldal; sor++) {
            for (int oszl = 0; oszl <= kocka_oldal; oszl++) {
                System.out.printf("%3d", dobasok[sor][oszl]);
            }
            System.out.println("");
        }
        System.out.println("");
        
        
        
        
        
    }
}
