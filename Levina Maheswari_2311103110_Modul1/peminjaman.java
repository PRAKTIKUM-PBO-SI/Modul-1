/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp3levinamaheswari;

/**
 *
 * @author Levina Maheswari
 * 2311103110
 * S1SI07C
 */
public class peminjaman {
    Buku buku;
    Mahasiswa mahasiswa;
    String tanggalPeminjaman;
    
    public peminjaman(Buku buku, Mahasiswa mahasiswa,  String tanggalPeminjaman){
        this.buku = buku;
        this.mahasiswa = mahasiswa;
        this.tanggalPeminjaman = tanggalPeminjaman;
    }
    
    public void tampilPeminjaman (){
        System.out.println(mahasiswa.nama+" meminjam buku dengan judul "+
                buku.judul+" pada tanggal "+tanggalPeminjaman);
    }
}
