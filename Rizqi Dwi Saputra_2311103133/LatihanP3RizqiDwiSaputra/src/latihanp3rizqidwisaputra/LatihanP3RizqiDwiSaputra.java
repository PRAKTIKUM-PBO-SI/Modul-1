/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3rizqidwisaputra;

/**
 * @author Rizqi Dwi Saputra / 2311103133
 * S1SI 07 C
 */
public class LatihanP3RizqiDwiSaputra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Buku bukuSewa = new Buku("Belajar PBO", "Mr. Sena", 2023);
        Mahasiswa mhsSewa = new Mahasiswa("Saputra", "2311103133");
        Peminjaman peminjaman = new Peminjaman(bukuSewa, mhsSewa, "07/10/24");
        
        peminjaman.tampilkanPeminjaman();
        
        System.out.println(" ");
        
        Pengembalian pengembalian = new Pengembalian(bukuSewa, mhsSewa, "13/10/24");
        
        pengembalian.tampilkanPengembalian();
        
    }
    
}

