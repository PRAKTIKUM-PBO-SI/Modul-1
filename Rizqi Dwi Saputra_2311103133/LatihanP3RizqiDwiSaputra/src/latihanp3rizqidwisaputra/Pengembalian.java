/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp3rizqidwisaputra;

/**
 *
 * @author Rizqi Dwi Saputra / 2311103133
 * S1SI 07 C
 */
public class Pengembalian {
    
    Buku buku;
    Mahasiswa mahasiswa;
    String tanggalKembali;
    
    public Pengembalian(Buku buku, Mahasiswa mahasiswa, String tanggalKembali){
        this.buku = buku;
        this.mahasiswa = mahasiswa;
        this.tanggalKembali = tanggalKembali;
    }
    
    public void tampilkanPengembalian(){
        System.out.println("Buku " + buku.judul + " Berhasil dikembalikan oleh " + mahasiswa.namaMhs + 
                " pada tanggal : " + tanggalKembali );
    }
    
}
