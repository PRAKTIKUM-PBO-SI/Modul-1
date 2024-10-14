/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3levinamaheswari;

/**
 *
 * @author Levina Maheswari M.L
 * 2311103110
 * S1SI07C
 */
public class LatihanP3LevinaMaheswari {
    public static void main(String[] args) {
        Buku buku = new Buku("Aroma Karsa","Dewi Lestari", 2018);
        Mahasiswa mahasiswa = new Mahasiswa("Levina", "2311103110");
        peminjaman Peminjaman = new peminjaman(buku, mahasiswa, " 07/10/2024");
        Pengembalian pengembalian = new Pengembalian (buku, mahasiswa, " 14/11/2024");
        
        Peminjaman.tampilPeminjaman();
        pengembalian.tampilPengembalian();
        
    }
    
}
