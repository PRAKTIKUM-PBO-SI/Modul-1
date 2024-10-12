/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp3rizqidwisaputra;

/**
 *
 * @author Rizqi Dwi Saputra / 2311103133
 * SI07C
 */
public class Peminjaman {
    
    Buku buku;
    Mahasiswa mahasiswa;
    String tanggalPeminjaman;
    
    public Peminjaman(Buku buku, Mahasiswa mahasiswa, String tanggalPeminjaman) {
        this.buku = buku;
        this.mahasiswa = mahasiswa;
        this.tanggalPeminjaman = tanggalPeminjaman;
    }
 
    public void tampilkanPeminjaman(){
        System.out.println(mahasiswa.namaMhs + " meminjam buku " + buku.judul + 
                " pada tanggal " + tanggalPeminjaman);
    }
    
}