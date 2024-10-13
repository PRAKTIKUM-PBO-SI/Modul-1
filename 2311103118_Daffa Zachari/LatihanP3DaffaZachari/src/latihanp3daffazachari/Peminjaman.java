/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp3daffazachari;

/**
 *
 * @author Daffa Zachari
 * 2311103118
 * 07C
 */
public class Peminjaman {
    Buku buku;
    Mahasiswa mahasiswa;
    String tanggalPeminjaman;
    String tanggalPengembalian;
    boolean sudahDikembalikan;
    
    public Peminjaman(Buku buku, Mahasiswa mahasiswa, String tanggalPeminjaman) {
        this.buku = buku;
        this.mahasiswa = mahasiswa;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.sudahDikembalikan = false;
    }
    
    public void kembalikanBuku(String tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
        this.sudahDikembalikan = true;
    }
    
    public void tampilkanPeminjaman() {
        System.out.println(mahasiswa.nama + " meminjam buku dengan judul " + buku.judul + " pada tanggal " + tanggalPeminjaman);
        if (sudahDikembalikan) {
            System.out.println("Buku sudah dikembalikan pada tanggal " + tanggalPengembalian);
        } else {
            System.out.println("Buku belum dikembalikan");
        }
    }
}