/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3hanafiilham;

/**
 *
 * @author hanaf
 */
public class pinjam {
    buku buku;
    mahasiswa mahasiswa;
    String tanggalPeminjaman;
  
        public pinjam (buku buku, mahasiswa mahasiswa, String tanggalPeminjaman){
        this.buku = buku;
        this.mahasiswa = mahasiswa;
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    /**
     *
     */
    public void tampilkanPeminjaman(){
        System.out.println(mahasiswa.nama+"meminjam buku dengan judul "+buku.judul+" pada tanggal"+tanggalPeminjaman);
        
    } 
}
