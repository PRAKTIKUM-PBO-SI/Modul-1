/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unguided2p3izmasyabrian;

/**
 *
 * @author Izma Syabrian
 * 2311103148
 * 07C
 */
public class Unguided2P3IzmaSyabrian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Siswa siswa = new Siswa("Rian Syabrian","0049733482");
        NilaiRataRata nilaiRatarata = new NilaiRataRata(siswa, new int[]{90,80,85,89,84});
        
        nilaiRatarata.tampilkanHasil();
    }
    
}
