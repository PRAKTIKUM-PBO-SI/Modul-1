
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package nilairatarata;
import java.util.Scanner;
/**
 *
 * @author ARDZARICHO REVANSYAH
 * 2311103137
 * 07C
 * sumber : https://www.sanfoundry.com/java-program-calculate-sum-average-array/
 */
public class NilaiRataRata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nama;
        float nilai1, nilai2, nilai3, rataRata;

        System.out.print("Masukkan nama siswa: ");
        nama = scanner.nextLine();

        System.out.print("Masukkan nilai mapel 1: ");
        nilai1 = scanner.nextFloat();
        System.out.print("Masukkan nilai mapel 2: ");
        nilai2 = scanner.nextFloat();
        System.out.print("Masukkan nilai mapel 3: ");
        nilai3 = scanner.nextFloat();

        rataRata = (nilai1 + nilai2 + nilai3) / 3;

        System.out.println("\nNama Siswa: " + nama);
        System.out.println("Rata-rata nilai: " + rataRata);

        scanner.close();
    }
}