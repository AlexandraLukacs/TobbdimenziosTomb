/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tobbdimenziostombok;

public class TobbdimenziosTombok {

    public static void main(String[] args) {
        final int sor_db = 3;
        final int oszl_db = 5;
        /* Léterhozás */
        int[][] negyzetes = new int [sor_db][oszl_db];
        
        /* Közvetlen elérés: */
        negyzetes[1][2] = 1;
        
        /* Megjelenítés */
        System.out.println("Négyzetes:");
        for (int sor = 0; sor < sor_db; sor++) {
            /* Adott sorban lévő tömb memóriacímei: */
            //System.out.println(negyzetes[i]);
            for (int oszl = 0; oszl < oszl_db; oszl++) {
                System.out.print(negyzetes[sor][oszl] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        /* Léterhozás */
        int[][] fureszes = new int[7][];
        for (int sor = 0; sor < 7; sor++) {
            /* Adott sorban nincs semmi, null: */
            //System.out.println(fureszes[i]);
            //for (int oszl = 0; oszl < 3; oszl++) {
                /* NullPointerException */
                //System.out.println(fureszes[i][j]);
                // fureszes[sor] = new int[3]; // 3 oszlop minden sorban
                // fureszes[sor] = new int[3+sor]; // lépcsőzetes
                int db = (int)(Math.random()*5)+3;
                fureszes[sor] = new int[db]; // 3 oszlop minde sor
            //}
        }
        
        /* Közvetlen elérés: */
        fureszes[1][2] = 1;
        fureszes[2][1] = 1;
        
        /* Megjelenítés */
        System.out.println("Fűrészes:");
        int sorDb = fureszes.length;
        for (int sor = 0; sor < sorDb; sor++) {
            int oszlDb = fureszes[sor].length;
            for (int oszl = 0; oszl < sorDb; oszl++) {
                int oszlopDb = fureszes[sor].length;
                System.out.print(fureszes[sor][oszl] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        
    }
    
}
