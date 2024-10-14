/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanP3;

/**
 *
 * @author Tigris Yedija Maarende
 * 2311103103
 * SI 07C
 */
public class LatihanP3TigrisYedija {

    public static void main(String[] args) {
        Buku buku = new Buku("buku PBO", "Tigris", 2024);
        Mahasiswa mahasiswa = new Mahasiswa("Tigris", "2311103130");
        Peminjaman peminjaman = new Peminjaman(buku, mahasiswa,"07-10-2024");
        Pengembalian pengembalian = new Pengembalian(buku, mahasiswa,"11-10-2024");
        
        peminjaman.tampilkanPeminjaman();
        pengembalian.tampilkanPengembalian();
    }
}
