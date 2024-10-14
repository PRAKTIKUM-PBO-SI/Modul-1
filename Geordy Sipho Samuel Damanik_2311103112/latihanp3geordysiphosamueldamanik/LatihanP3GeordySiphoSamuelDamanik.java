/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3geordysiphosamueldamanik;

/**
 *
 * @author Geordy Sipho Samuel Damanik
 * 2311103112
 * S1SI-07-C
 */

public class LatihanP3GeordySiphoSamuelDamanik {
    public static void main(String[] args) {
        ClassBuku buku = new ClassBuku("buku PBO", "Geo", 2005);
        Mahasiswa mahasiswa = new Mahasiswa("Najwa", "2311103108");
        Peminjaman peminjaman = new Peminjaman(buku, mahasiswa, "07/10/2024");
        
        System.out.println("Sebelum pengembalian:");
        peminjaman.tampilkanPeminjaman();
        
        peminjaman.kembalikanBuku("14/10/2024");
        
        System.out.println("\nSetelah pengembalian:");
        peminjaman.tampilkanPeminjaman();
    }
}

