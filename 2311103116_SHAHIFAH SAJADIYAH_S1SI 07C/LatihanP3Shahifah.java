/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3shahifah;

/**
 *
 * @author Shahifah Sajadiyah
 * 2311103116
 * 07C
 */
public class LatihanP3Shahifah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buku buku = new Buku("buku Dilan", "Pidi Baiq", 2014);
        Mahasiswa mahasiswa = new Mahasiswa("Shahifah", "2311103116");
        Peminjaman peminjaman = new Peminjaman (buku, mahasiswa, "07/10/2024");
        Pengembalian pengembalian = new Pengembalian(buku, mahasiswa, "12/10/2024");
        
        
        peminjaman.tampilkanPeminjaman ();
        pengembalian.tampilkanPengembalian();
    }
    
}
