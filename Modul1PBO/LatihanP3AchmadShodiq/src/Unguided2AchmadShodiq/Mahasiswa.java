/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided2AchmadShodiq;

/**
 *
 * @author User
 */
public class Mahasiswa {
    private String nama;
    private double nilai1,nilai2,nilai3;
    
    public Mahasiswa(String nama, double nilai1, double nilai2, double nilai3){
        this.nama= nama;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
    }
    public void tampilkanData(){
        double rataRata = (nilai1 + nilai2 + nilai3)/3;
        System.out.println("    NILAI RATA-RATA MAHASISWA   ");
        System.out.println("Nama:" + nama);
        System.out.println("Nilai1:" + nilai1);
        System.out.println("Nilai2:" + nilai2);
        System.out.println("Nilai3:" + nilai3);
        System.out.printf("Rata-rata:%2f%n",rataRata);
    }

    
    }

