/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp3najwa;

/**
 *
 * @author Najwa Darmawan
 * 2311103108
 * 07C
 */
public class Peminjaman {
    Buku buku;
    Mahasiswa mahasiswa;
    String tanggalPeminjaman;
    String tanggalPengembalian;
    Boolean sudahKembali;
    public Peminjaman(Buku buku, Mahasiswa mahasiswa, String tanggalPeminjaman){
        this.buku= buku;
        this.mahasiswa= mahasiswa;
        this.tanggalPeminjaman= tanggalPeminjaman;
        this.sudahKembali = false;
        
    }
    public void kembalikanBuku(String tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
        this.sudahKembali = true;
 }
    
    public void tampilkanPeminjaman(){
        System.out.println (mahasiswa.nama+" meminjam buku dengan judul "
                +buku.judul+" pada tanggal "+tanggalPeminjaman);
        if (sudahKembali) {
        System.out.println("Buku telah dikembalikan pada tanggal " + 
                tanggalPengembalian);
        } else {
        System.out.println("Buku belum dikembalikan");
        }
    }
}
    


