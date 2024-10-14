/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp3marsyavaleria;

/**
 *
 * @author Marsya Valeria
 * 2311103105
 * 07C
 */
public class Peminjaman {
    Buku buku;
    Mahasiswa mahasiswa;
    String tanggalPeminjaman;
    String tanggalPengembalian;
    boolean statusDipinjam;
    
    public Peminjaman(Buku buku, Mahasiswa mahasiswa, String tanggalPeminjaman){
       this.buku = buku;
       this.mahasiswa = mahasiswa;
       this.tanggalPeminjaman = tanggalPeminjaman;
       this.statusDipinjam = true;
    }  
    
    public void tampilkanPeminjaman(){
        System.out.println(mahasiswa.nama+" meminjam buku dengan judul "
                +buku.judul+" pada tanggal "+tanggalPeminjaman);
    }
    
    public void kembalikanBuku(String tanggalPengembalian) {
        if (statusDipinjam){
            this.tanggalPengembalian = tanggalPengembalian;
            this.statusDipinjam = false;
            System.out.println("Buku " + buku.judul + " dikembalikan oleh "
                + mahasiswa.nama + " pada tanggal " + tanggalPengembalian);
        }else{
            System.out.println("Buku " + buku.judul + " sudah dikembalikan.");
        }
    }
}   
