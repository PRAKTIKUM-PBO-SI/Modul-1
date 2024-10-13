/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp3daffazachari;

/**
 *
 * @author imansan
 */
public class Pengembalian {
    Buku buku;
    Mahasiswa mahasiswa;
    Peminjaman tanggalPeminjaman;
    String tanggalPengembalian;
    
    public Pengembalian (Buku buku, Mahasiswa mahasiswa,String tanggalPeminjaman, String tanggalPengembalian){
        this.buku = buku;
        this.mahasiswa = mahasiswa;
        this.tanggalPengembalian = tanggalPengembalian;
    }
    
    public void tampilkanpengembalian (){
        System.out.println(mahasiswa.nama+" Meminjam buku dengan judul "+buku.judul+" pada tanggal "+tanggalPeminjaman+
                " Dan akan dikembalikan pada tanggal "+tanggalPengembalian);
    }
}
