/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3riskavanydewi;

/**
 *
 * @author Riska Vany Dewi
 * 2311103111
 * S1SI07C
 */
public class LatihanP3RiskaVanyDewi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buku buku = new Buku ("The Hunger Games", "Suzanne Collins", 2008);
        Mahasiswa mahasiswa = new Mahasiswa ("Riska Vany Dewi", "2311103111");
        Peminjaman peminjaman = new Peminjaman (buku, mahasiswa, "07/10/2024");
        
        peminjaman.tampilkanPeminjaman();
        
        Pengembalian pengembalian = new Pengembalian (buku, mahasiswa, "13/10/2024");
            
        pengembalian.tampilkanPengembalian();
    }
    
}
