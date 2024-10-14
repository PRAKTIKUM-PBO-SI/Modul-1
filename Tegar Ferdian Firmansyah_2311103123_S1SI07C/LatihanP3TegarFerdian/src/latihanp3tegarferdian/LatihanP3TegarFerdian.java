/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3tegarferdian;

/**
 *
 * @author Tegar / 2311103123
 * S1SI07C
 */
public class LatihanP3TegarFerdian {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buku buku = new Buku(" Buku PBO ", " Hafid ", 2024);
        Mahasiswa mahasiswa = new Mahasiswa ("Tegar ", " 2311103123 ");
        Peminjaman peminjaman = new Peminjaman (buku, mahasiswa, " 7/10/2024 ");   
    
        peminjaman.tampilkanPeminjaman();
        
        System.out.println( " ");
        Pengembalian pengembalian = new Pengembalian(buku, mahasiswa, "13/10/24");
        pengembalian.tampilkanPengembalian();
       
    }
}