/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3hafidramadhan;

/**
 *
 * @author Hafid Ramadhan
 * 2311103104
 * SI07c
 */
public class LatihanP3HafidRamadhan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buku buku = new Buku ("buku PBO","Tegar",2024);
        Mahasiswa mahasiswa = new Mahasiswa("Geo","2311103107");
        Peminjaman peminjaman = new Peminjaman(buku,mahasiswa,"31/10/2025");
        
       System.out.println("Sebelum pengembalian:");
        peminjaman.tampilkanPeminjaman();
        peminjaman.mengembalikanBuku("07/11/2025");
        System.out.println("\nSetelah pengembalian:");
        peminjaman.tampilkanPeminjaman();
}
}

