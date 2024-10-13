/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilairatarata;

import java.util.Scanner;

public class NilaiRataRata {

    /**
     * @author Rajendra Ikmal Veorozzan
     * 2311103122
     * 07C
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama siswa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan nilai pertama: ");
        double nilai1 = input.nextDouble();
        System.out.print("Masukkan nilai kedua: ");
        double nilai2 = input.nextDouble();
        System.out.print("Masukkan nilai ketiga: ");
        double nilai3 = input.nextDouble();

        double rataRata = (nilai1 + nilai2 + nilai3) / 3;

        System.out.println("\nNama siswa: " + nama);
        System.out.printf("Nilai rata-rata: %.2f\n", rataRata);

        input.close();
    }
}
