/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3ardza;

/**
 *
 * @author ARDZARICHO REVANSYAH
 * 2311103137
 * 07C 
 */
public class LatihanP3Ardza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Buku buku = new Buku("Pemrograman Java Tengah", "John Doe", 2020);
        Mahasiswa mahasiswa = new Mahasiswa("Muhammad Ali", "123456");
        Peminjaman peminjaman = new Peminjaman(buku, mahasiswa, "20-09-2024"); 
        peminjaman.tampilkanPeminjaman();
        
        Pengembalian pengembalian = new Pengembalian(buku, mahasiswa, "20-09-2024", "27-09-2024");
        pengembalian.tampilkanPengembalian();
    }
}
