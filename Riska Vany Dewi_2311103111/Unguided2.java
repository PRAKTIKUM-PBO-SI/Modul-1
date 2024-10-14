/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unguided2;

/**
 * @author Riska Vany Dewi
 * 2311103111
 * S1SI07C
 */
public class Unguided2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa ("Riska Vany Dewi", "2311103111");
        Nilai nilai = new Nilai (95, 87, 91);
        RataRata rataRata = new RataRata(nilai);
        double hasilRataRata = rataRata.hitungRataRata();
        
        System.out.println("Nama Mahasiswa : " + mahasiswa.nama);
        System.out.println("NIM : " + mahasiswa.nimMahasiswa);
        System.out.println("Rata-rata Nilai : " + hasilRataRata);
    }
    
}
