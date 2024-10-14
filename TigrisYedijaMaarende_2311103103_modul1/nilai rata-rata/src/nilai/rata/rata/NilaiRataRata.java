/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilai.rata.rata;

import java.util.Scanner;

/**
 *
 * @author Tigris Yedija Maarende
 * 2311103103
 * S1 SI07-C
 */
public class NilaiRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta jumlah nilai yang akan diinputkan
        System.out.print("Masukkan jumlah nilai: ");
        int jumlahNilai = input.nextInt();
        
        // Membuat array untuk menyimpan nilai-nilai
        double[] nilai = new double[jumlahNilai];
        double total = 0;

        // Menginput nilai dari pengguna
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextDouble();
            total += nilai[i];
        }

        // Menghitung rata-rata
        double rataRata = total / jumlahNilai;

        // Menampilkan hasil rata-rata
        System.out.println("Rata-rata nilai adalah: " + rataRata);

        input.close();
    }

}
   
