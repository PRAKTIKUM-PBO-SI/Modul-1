/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3chrishotasirajagukguk;

/**
 *
 * @author Chris
 */
public class LatihanP3ChrisHotasiRajagukguk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buku buku = new Buku("Pemrograman PBO", "John Doe", 2020); 
        Mahasiswa mahasiswa = new Mahasiswa("Chris", "123456"); 
        Peminjaman peminjaman = new Peminjaman(buku, mahasiswa, "20-09-2024");
        
        peminjaman.tampilkanPeminjaman();
        
        peminjaman.kembalikanBuku("10-10-2024");
    }
}
