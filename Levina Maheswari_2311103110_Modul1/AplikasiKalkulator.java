/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasikalkulator;

/**
 *
 * @author Levina Maheswari M.L
 * 2311103110
 * S1SI07C
 */
public class AplikasiKalkulator {
    public static void main(String[] args) {
         Mahasiswa mahasiswa = new Mahasiswa("Levina Maheswari","2311103110","Sistem Informasi","3");
         Perhitungan   perhitungan = new Perhitungan (100,97,75,mahasiswa);
         perhitungan.tampilPerhitungan();
        
    }
    
}
