/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3izmasyabrian;

/**
 *
 * @author Izma Syabrian
 * 2311103148
 * 07C
 */
public class LatihanP3IzmaSyabrian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buku buku = new Buku("Makeine","Amamori",2021);
        Mahasiswa mahasiswa = new Mahasiswa("Rian","2311103148");
        Peminjaman peminjaman = new Peminjaman(buku,mahasiswa,"07-10-2024");
        Pengembalian pengembalian = new Pengembalian(buku,mahasiswa,"15-10-2024");
        
        peminjaman.tampilkanPeminjaman();
        pengembalian.tampilkanPengembalian();
    }
}
