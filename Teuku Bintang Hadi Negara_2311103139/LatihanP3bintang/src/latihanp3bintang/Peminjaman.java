/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp3bintang;

/**
 *
 * @author TeukuBintangHadiNegara
 */
public class Peminjaman { 
    Buku buku;
    Mahasiswa mahasiswa; 
    String tanggalPeminjaman;
    String tanggalPengembalian;

    public Peminjaman(Buku buku, Mahasiswa mahasiswa, String tanggalPeminjaman) {
        this.buku = buku; 
        this.mahasiswa = mahasiswa;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public void tampilkanPeminjaman() { 
        System.out.println(mahasiswa.nama + " meminjam buku berjudul " +
        buku.judul + " pada tanggal " + tanggalPeminjaman);
    }

    public void kembalikanBuku(String tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
        System.out.println(mahasiswa.nama + " telah mengembalikan buku berjudul " + buku.judul +
        " pada tanggal " + tanggalPengembalian);
    }
}



