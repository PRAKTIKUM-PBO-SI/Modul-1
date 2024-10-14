/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp3riskavanydewi;

/**
 @author Riska Vany Dewi
 * 2311103111
 * S1SI07C
 */
public class Pengembalian {
    Buku buku;
    Mahasiswa mahasiswa;
    String tanggalPengembalian;
    
    public Pengembalian(Buku buku, Mahasiswa mahasiswa, String tanggalPengembalian){
        this.buku = buku;
        this.mahasiswa = mahasiswa;
        this.tanggalPengembalian = tanggalPengembalian;
    }
    
    public void tampilkanPengembalian(){
        System.out.println (mahasiswa.nama+ " mengembalikan buku dengan judul " +
                buku.judul+ " pada tanggal " +tanggalPengembalian);
    }
    
}
