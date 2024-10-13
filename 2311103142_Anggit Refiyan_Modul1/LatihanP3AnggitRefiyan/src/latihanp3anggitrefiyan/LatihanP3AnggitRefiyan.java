/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3anggitrefiyan;

/**
 *
 * @author Anggit Refiyan
 * 2311103142
 * 07C
 */
public class LatihanP3AnggitRefiyan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buku buku = new Buku("Buku PBO", "Anggit", 2005);
        Mahasiswa mahasiswa = new Mahasiswa("Anggit", "2311103142");
        Peminjaman peminjaman = new Peminjaman(buku, mahasiswa, "07/10/2024");
        Pengembalian pengembalian = new Pengembalian(buku, mahasiswa, "09/10/2024");
        
        
        peminjaman.tampilkanPeminjaman();
        pengembalian.tampilkanPengembalian();
    }
    
}
