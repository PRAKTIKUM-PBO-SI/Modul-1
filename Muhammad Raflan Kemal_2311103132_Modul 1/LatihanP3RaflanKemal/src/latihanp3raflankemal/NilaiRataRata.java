/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp3raflankemal;

/**
 *
 * @author Muhammad Raflan Kemal
 * 2311103132
 * 07C
 */
import java.util.Scanner;

public class NilaiRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Selamat datang =====");

        System.out.print("Masukan nama : ");
        String nama = input.nextLine();

        System.out.print("Nilai 1 : ");
        double nilai1 = input.nextDouble();
        System.out.print("Nilai 2 : ");
        double nilai2 = input.nextDouble();
        System.out.print("Nilai 3 : ");
        double nilai3 = input.nextDouble();

        double rataRata = (nilai1 + nilai2 + nilai3) / 3;

        System.out.println("Nama siswa : " + nama);
        System.out.println("Nilai rata-rata : " + rataRata);

        input.close();
    }
}
    
