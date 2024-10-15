/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3wildanrestusaputra;

/**
 *
 * @author Wildan Restu Saputra
 * 2311103136
 * S1SI-07-C
 */
public class LatihanP3WildanRestuSaputra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buku buku = new Buku("buku PBO", "Saputra", 2024);
        Mahasiswa mahasiswa;
        mahasiswa = new Mahasiswa("Wildan", "2311103136");
        Peminjaman peminjaman = new Peminjaman(buku, mahasiswa,"07/10/2024");
        Pengembalian pengembaliann = new Pengembalian(buku , mahasiswa , "17/10/2024");
        
        peminjaman.tampilkanPeminjaman();
        pengembaliann.tampilkanPengembalian();
    }
    
    
}
