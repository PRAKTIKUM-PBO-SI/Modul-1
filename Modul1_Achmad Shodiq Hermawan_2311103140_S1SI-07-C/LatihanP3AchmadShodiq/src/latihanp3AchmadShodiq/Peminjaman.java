/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp3AchmadShodiq;

/**
 *
 * @author Achmad Shodiq Hermawan
 * 231103140
 * S1SI-07-C
 */
public class Peminjaman {
    Buku buku;
    Mahasiswa mahasiswa;
    String tanggalPeminjaman;
  
        public Peminjaman (Buku buku, Mahasiswa mahasiswa, String tanggalPeminjaman){
        this.buku = buku;
        this.mahasiswa = mahasiswa;
        this.tanggalPeminjaman = tanggalPeminjaman;
    }
    public void tampilkanPeminjaman(){
        System.out.println(mahasiswa.nama +" meminjam buku dengan judul "+ buku.judul+ "pada tanggal " + tanggalPeminjaman);
        
    }
}
