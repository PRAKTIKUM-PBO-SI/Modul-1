/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp3radityaputra;

/**
 *
 * @author Raditya Putra Anugra Pratama
 * 2311103143
 * S1SI07-C
 */
public class peminjaman {
    Buku buku;
    mahasiswa mahasiswa;
    String tanggalPeminjaman;
    
    public peminjaman(Buku buku, mahasiswa mahasiswa, String tanggal){
        this.buku = buku;
        this.mahasiswa = mahasiswa;
        this.tanggalPeminjaman = tanggal;
    }
    
    public void tampilkanPeminjaman(){
        System.out.println(mahasiswa.nama+" meminjam buku dengan berjudul "+buku.judul+" pada tanggal "+tanggalPeminjaman);
        
    }
}