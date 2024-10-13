/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided2p3muhammadrafiawallaisal;
/**
 *
 * @author Muhammad Rafi Awallaisal;
 * 2311103134
 * 07C
 */
import java.util.Scanner;

public class InputNilai {
     // Method untuk mengambil input nilai dari pengguna
    public double[] ambilNilai(int jumlahNilai) {
        Scanner scanner = new Scanner(System.in);
        double[] nilai = new double[jumlahNilai];
        
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextDouble();
        }
        
        return nilai;
    }

}
