/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilairerata;

/**
 *
 * @author Najwa Darmawan
 * 2311103108
 * S1SI07C
 */
public class NilaiRerata {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Murid murid = new Murid("Najwa Darmawan", "0050817756");
        Nilai nilai = new Nilai(murid, new int[] {90,91,92,93,94,95});
        
        nilai.tampilkanHasil();
    }
}

