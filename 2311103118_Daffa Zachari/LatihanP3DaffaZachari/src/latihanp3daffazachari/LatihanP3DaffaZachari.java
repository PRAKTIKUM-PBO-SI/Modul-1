/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3daffazachari;

/**
 *
 * @author Daffa Zachari
 * 2311103118
 * 07C
 */
public class LatihanP3DaffaZachari {
    public static void main(String[] args) {
        Buku buku = new Buku("5 Sec to death", "ZachD", 2023);
        Mahasiswa mahasiswa = new Mahasiswa("Daffa", "2311103118");
        Peminjaman peminjaman = new Peminjaman(buku, mahasiswa, "07/10/2024");
        
        peminjaman.tampilkanPeminjaman();
        
        peminjaman.kembalikanBuku("14/10/2024");
        
        System.out.println("\nSetelah pengembalian:");
        peminjaman.tampilkanPeminjaman();
    }
}
