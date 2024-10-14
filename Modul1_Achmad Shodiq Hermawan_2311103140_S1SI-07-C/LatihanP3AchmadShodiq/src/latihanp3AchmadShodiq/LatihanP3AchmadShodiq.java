/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3AchmadShodiq;

/**
 *
 * @author User
 * 2311103140
 * 07c
 */
public class LatihanP3AchmadShodiq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Buku buku = new Buku("buku PBO ","ACHMAD",2023);
       Mahasiswa mahasiswa = new Mahasiswa("Achmad Shodiq ","2311103140");
       Peminjaman peminjaman = new Peminjaman(buku,mahasiswa,"12/11/2024");
       pengembalian pengembalian = new pengembalian(buku,mahasiswa,"27-11-2024");
       
       peminjaman.tampilkanPeminjaman();
       pengembalian.tampilkanPengembalian();
    }
    
}
