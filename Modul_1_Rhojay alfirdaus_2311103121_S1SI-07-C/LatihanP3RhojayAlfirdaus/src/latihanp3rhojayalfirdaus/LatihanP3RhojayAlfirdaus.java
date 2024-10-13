/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3rhojayalfirdaus;

/**
 *
 * @author Rhojay Alfirdaus
 * 2311103121
 * S1SI-07-C
 */
public class LatihanP3RhojayAlfirdaus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buku buku = new Buku("Cara jadi musisi", "Jay", 2024);
        Mahasiswa mahasiswa = new Mahasiswa ("Deddy Corbuzier","123456");
        Peminjaman peminjaman = new Peminjaman(buku,mahasiswa,"07/10/2024");
        
        peminjaman.tampilkanPeminjaman();
        
        peminjaman.kembalikanBuku("13/10/2024");
    }
    
}
