/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unguided2p3vickymahya;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Unguided2P3VickyMahya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Membuat objek dari kelas InputNilai
        InputNilai inputNilai = new InputNilai();
        
        // Meminta jumlah nilai dari pengguna
        System.out.println("Berapa banyak nilai yang ingin Anda masukkan?");
        Scanner scanner = new Scanner(System.in);
        int jumlahNilai = scanner.nextInt();
        
        // Mengambil nilai dari pengguna
        double[] nilai = inputNilai.ambilNilai(jumlahNilai);
        
        // Membuat objek dari kelas NilaiRataRata
        NilaiRataRata penghitungan = new NilaiRataRata();
        
        // Menghitung rata-rata
        double rataRata = penghitungan.hitungRataRata(nilai);
        
        // Menampilkan hasil
        System.out.println("Rata-rata nilai siswa: " + rataRata);
        
        // Menutup scanner
        scanner.close();
    }
}