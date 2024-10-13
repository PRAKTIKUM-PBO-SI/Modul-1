/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3radityaputra;

/**
 *
 * @author Raditya Putra Anugra Pratama
 * 2311103143
 * S1SI07-C
 */
public class LatihanP3RadityaPutra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buku buku = new Buku("Peradaban","Feast",2024);
        mahasiswa mahasiswa = new mahasiswa("Raditya","2311103143");
        peminjaman peminjaman = new peminjaman(buku,mahasiswa,"13-10-2024");
        pengembalian pengembalian = new pengembalian(buku,mahasiswa,"14-10-2024");
        
        peminjaman.tampilkanPeminjaman();
        pengembalian.tampilkanPengembalian();
    }
}