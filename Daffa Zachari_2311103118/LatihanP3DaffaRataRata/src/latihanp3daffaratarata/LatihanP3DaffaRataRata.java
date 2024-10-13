/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3daffaratarata;

/**
 *
 * @author  Daffa Zachari 
 * 2311103118
 * S1SI-07-C
 */
import java.util.Scanner;

public class LatihanP3DaffaRataRata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer
        
        String[] namaMahasiswa = new String[jumlahMahasiswa];
        double[] nilaiMahasiswa = new double[jumlahMahasiswa];
        double totalNilai = 0;
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i+1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();
            
            System.out.print("Masukkan nilai mahasiswa " + namaMahasiswa[i] + ": ");
            nilaiMahasiswa[i] = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan buffer
            
            totalNilai += nilaiMahasiswa[i];
        }
        
        double rataRata = totalNilai / jumlahMahasiswa;
        
        System.out.println("\nHasil Perhitungan:");
        System.out.println("Rata-rata nilai kelas: " + String.format("%.2f", rataRata));
        
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println(namaMahasiswa[i] + ": " + nilaiMahasiswa[i]);
        }
        
        scanner.close();
    }
}
