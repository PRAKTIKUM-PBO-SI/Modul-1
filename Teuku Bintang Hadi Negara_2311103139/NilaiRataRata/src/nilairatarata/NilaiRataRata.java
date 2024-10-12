/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilairatarata;

/**
 *
 * @author TeukuBintangHadiNegara
 */
public class NilaiRataRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama = "Bintang"; // Nama siswa
        int n1 = 85; // Nilai IPA
        int n2 = 90; // Nilai BAHASA INDONESIA
        int n3 = 95; // Nilai MATEMATIKA
        
        int total = n1 + n2 + n3;
        double rata = total / 3.0;

        System.out.println("===== SISTEM AKADEMIK SISWA =====");
        System.out.println("Nama siswa : " + nama);
        System.out.println("Nilai IPA : " + n1);
        System.out.println("Nilai BAHASA INDONESIA : " + n2);
        System.out.println("Nilai MATEMATIKA : " + n3);
        System.out.println("Rata-rata nilai : " + rata);
    }
    
}
