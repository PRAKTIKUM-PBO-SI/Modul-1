/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p3hanafiilham;

/**
 *
 * @author hanaf
 */
public class P3HanafiIlham {

    public static void main(String[] args) {
       buku buku = new buku("buku PBO ","Hanafi",2023);
       mahasiswa mahasiswa = new mahasiswa("Hanafi Ilham ","2311103146");
       pinjam peminjaman = new pinjam(buku,mahasiswa, "20/09/2024");
       
       peminjaman.tampilkanPeminjaman();
       
       pengembalian pengembalianBuku = new pengembalian(buku, mahasiswa, "20/09/2024", "27/09/2024");
       pengembalianBuku.tampilkanPengembalian();
    }

}
