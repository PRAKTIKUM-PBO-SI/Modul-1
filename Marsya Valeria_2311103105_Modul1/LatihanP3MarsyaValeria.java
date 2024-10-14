/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3marsyavaleria;

/**
 *
 * @author Marsya Valeria
 * 2311103105
 * 07C
 */
public class LatihanP3MarsyaValeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Buku buku = new Buku("AZZAMINE", "SHOPIE", 2022);
       Mahasiswa mahasiswa = new Mahasiswa("Marsya", "2311103105");
       Peminjaman peminjaman = new Peminjaman(buku, mahasiswa, "07/10/2024");
       
       peminjaman.tampilkanPeminjaman();
       peminjaman.kembalikanBuku("14/10/2024");
       peminjaman.kembalikanBuku("15/10/2024");

    }
    
}
