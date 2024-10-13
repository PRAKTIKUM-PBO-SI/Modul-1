/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unguidedp3hafidramadhan;

/**
 *
 * @author Hafid Ramadhan
 * 2311103104
 * SI07C
 */
public class Unguidedp3HafidRamadhan {
    
    public static void main(String[] args) {
       Siswa siswa = new Siswa("Hafid Ramadhan", "11223344");
        NilaiRataRata nilaiRataRata = new NilaiRataRata(siswa, new int[]{90, 84, 89, 95, 92});
        nilaiRataRata.tampilkanHasil();
    }
}
