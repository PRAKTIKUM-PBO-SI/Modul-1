/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp3muhammadrafiawallaisal;
/**
 *
 * @author Muhammad Rafi Awallaisal;
 * 2311103134
 * 07C
 */
public class LatihanP3MuhammadRafiAwallaisal {

    public static void main(String[] args) {
    Buku buku = new Buku("Pemrograman Java", "John Doe", 2020);
    Mahasiswa mahasiswa = new Mahasiswa("Ali","123456");
    Peminjaman peminjaman = new Peminjaman (buku, mahasiswa, "20-09-2024");
    peminjaman.tampilkanPeminjaman();
    
    }
   
}
