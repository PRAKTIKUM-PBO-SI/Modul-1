/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3rajendraikmalveorozzan;

/**
 *
 * @author Rajendra Ikmal Veorozzan
 * 2311103122
 * 07C
 */
public class LatihanP3RajendraIkmalVeorozzan {

    public static void main(String[] args) {
        Buku buku = new Buku("Anomali","windah",2024);
        Mahasiswa mahasiswa = new Mahasiswa("Ozan","2311103122");
        Peminjaman peminjaman = new Peminjaman(buku,mahasiswa,"31-05-2024");
        Pengembalian pengembalian = new Pengembalian(buku,mahasiswa,"27-09-2024");
        
        peminjaman.tampilkanPeminjaman();
        pengembalian.tampilkanPengembalian();
    }
}