/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unguidedp3geordysiphosamueldamanik07c;

/**
 *
 * @author Geordy Sipho Samuel Damanik
 * 2311103112
 * S1SI-07-C
 */
public class UnguidedP3GeordySiphoSamuelDamanik07C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Siswa siswa = new Siswa("Geordy Sipho Samuel Damanik","005212012205");
        NilaiRataRata nilaiRatarata = new NilaiRataRata(siswa, new int[]{96,92,95,90,88});
        
        nilaiRatarata.tampilkanHasil();

    }
    
}
