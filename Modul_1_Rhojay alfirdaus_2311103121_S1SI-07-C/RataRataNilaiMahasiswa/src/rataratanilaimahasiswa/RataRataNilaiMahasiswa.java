/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rataratanilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author Rhojay Alfirdaus
 */
public class RataRataNilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
            String nama;       
            float nilai1, nilai2, nilai3, rataRata; 
 
        System.out.print("Masukkan nama siswa: ");       
        nama = input.nextLine();   
 
        System.out.print("Masukkan nilai mata pelajaran 1: ");  
        nilai1 = input.nextFloat(); 
        System.out.print("Masukkan nilai mata pelajaran 2: ");  
        nilai2 = input.nextFloat(); 
        System.out.print("Masukkan nilai mata pelajaran 3: ");   
        nilai3 = input.nextFloat(); 
 
        rataRata = (nilai1 + nilai2 + nilai3) / 3; 
 
        System.out.println("\nNama siswa: " + nama); 
        System.out.println("Rata-rata nilai: " + rataRata); 
         
        input.close(); 
    } 
} 

