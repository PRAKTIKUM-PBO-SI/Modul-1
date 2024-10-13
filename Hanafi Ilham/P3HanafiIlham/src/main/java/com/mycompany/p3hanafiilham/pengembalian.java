/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3hanafiilham;

/**
 *
 * @author hanaf
 */
public class pengembalian {
    buku buku;
    mahasiswa mahasiswa;
    String tanggalPeminjaman;
    String tanggalPengembalian;

    public pengembalian(buku buku, mahasiswa mahasiswa, String tanggalPeminjaman, String tanggalPengembalian) {
        this.buku = buku;
        this.mahasiswa = mahasiswa;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public void tampilkanPengembalian() {
        System.out.println(mahasiswa.nama + " mengembalikan buku dengan judul " + buku.judul + 
                           " yang dipinjam pada tanggal " + tanggalPeminjaman + 
                           " dan dikembalikan pada tanggal " + tanggalPengembalian);
    }
}
