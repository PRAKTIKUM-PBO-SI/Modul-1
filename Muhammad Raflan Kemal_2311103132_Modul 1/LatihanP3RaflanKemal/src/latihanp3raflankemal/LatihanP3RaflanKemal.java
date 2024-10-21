/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3raflankemal;

/**
 *
 * @author Muhammad Raflan Kemal
 * 2311103132
 * 07C
 */
public class LatihanP3RaflanKemal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buku buku = new Buku ("Ancika dia yang bersamaku 1995", "Kemal",2024);
        Mahasiswa mahasiswa = new Mahasiswa ("Kemal","2311103132");
        Peminjaman peminjaman = new Peminjaman (buku, mahasiswa, "07/10/2024");
        
        peminjaman.tampilkanPeminjaman();
        
        pengembalian pengembalianBuku = new pengembalian(buku, mahasiswa, "07/10/2024", "14/10/2024");
        
        pengembalianBuku.tampilkanPengembalian();
  } 
    }
    

