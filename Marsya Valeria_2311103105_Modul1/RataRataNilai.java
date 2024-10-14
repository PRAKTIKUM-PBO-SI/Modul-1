/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rataratanilai;

/**
 *
 * @author Marsya Valeria
 * 2311103105
 * 07C
 */
import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        float nilai1, nilai2, nilai3, rataRata;
        System.out.print("Masukkan nama : ");
        nama = input.nextLine();
        
        System.out.print("Nilai 1: ");
        nilai1 = input.nextFloat();
        
        System.out.print("Nilai 2: ");
        nilai2 = input.nextFloat();
        
        System.out.print("Nilai 3: ");
        nilai3 = input.nextFloat();
        
        rataRata = (nilai1 + nilai2 + nilai3) / 3;
        System.out.println("Rata-rata: " + rataRata);
        input.close();
        
    }
    
}
