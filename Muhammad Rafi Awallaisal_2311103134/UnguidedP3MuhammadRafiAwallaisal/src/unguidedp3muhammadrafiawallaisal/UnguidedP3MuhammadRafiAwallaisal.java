/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unguidedp3muhammadrafiawallaisal;

/**
 *
 * @author Muhammad Rafi Awallaisal;
 * 2311103134
 * 07C
 */
public class UnguidedP3MuhammadRafiAwallaisal {

    public static void main(String[] args) {
      // Membuat objek buku dan mahasiswa
        Buku buku = new Buku("Game of Thrones", "John Doe", 2020);
        Mahasiswa mahasiswa = new Mahasiswa("Rafi Potter", "2311103134");

        // Membuat objek peminjaman
        Peminjaman peminjaman = new Peminjaman(buku, mahasiswa, "06-01-2024");

        // Menampilkan informasi peminjaman
        peminjaman.tampilkanPeminjaman();

        // Mengembalikan buku
        peminjaman.kembalikanBuku("30-09-2024");

        // Menampilkan informasi peminjaman setelah pengembalian
        peminjaman.tampilkanPeminjaman();
    }
}