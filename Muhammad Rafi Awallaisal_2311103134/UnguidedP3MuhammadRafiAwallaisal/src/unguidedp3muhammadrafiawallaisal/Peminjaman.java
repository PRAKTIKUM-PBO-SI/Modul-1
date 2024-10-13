/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguidedp3muhammadrafiawallaisal;

/**
 *
 * @author Muhammad Rafi Awallaisal;
 * 2311103134
 * 07C
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
        this.tanggalPengembalian = null; 
    }
    public void tampilkanPeminjaman() {
        System.out.println(mahasiswa.nama + " meminjam buku berjudul " + buku.judul + " pada tanggal " + tanggalPeminjaman);
        if (tanggalPengembalian != null) {
            System.out.println("Buku dikembalikan pada tanggal " + tanggalPengembalian);
        } else {
            System.out.println("Buku belum dikembalikan.");
        }
    }

    // Metode untuk mengembalikan buku dan mencatat tanggal pengembalian
    public void kembalikanBuku(String tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
        System.out.println("Buku berjudul " + buku.judul + " telah dikembalikan oleh " + mahasiswa.nama + " pada tanggal " + tanggalPengembalian);
    }
}
