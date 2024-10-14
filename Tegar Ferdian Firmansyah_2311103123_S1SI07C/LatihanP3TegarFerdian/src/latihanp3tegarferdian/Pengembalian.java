/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp3tegarferdian;

/**
 *
 * @author Tegar / 2311103123
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
    
    
    public void tampilkanPengembalian() {
        System.out.println(buku.judul + "Berhasil di kembalikan oleh "
                + mahasiswa.nama + " Pada tanggal: " + tanggalPengembalian );
    }
}
