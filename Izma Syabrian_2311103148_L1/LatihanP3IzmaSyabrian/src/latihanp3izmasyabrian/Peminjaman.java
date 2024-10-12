/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp3izmasyabrian;

/**
 *
 * @author Izma Syabrian
 * 2311103148
 * 07C
 */
public class Peminjaman {
    Buku buku;
    Mahasiswa mahasiswa;
    String tanggalPeminjaman;
    
    public Peminjaman(Buku buku, Mahasiswa mahasiswa, String tanggal){
        this.buku = buku;
        this.mahasiswa = mahasiswa;
        this.tanggalPeminjaman = tanggal;
    }
    
    public void tampilkanPeminjaman(){
        System.out.println(mahasiswa.nama+" meminjam buku dengan judul "+buku.judul+" pada tanggal "+tanggalPeminjaman);
        
    }
}
