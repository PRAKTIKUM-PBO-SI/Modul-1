package latihanp3levinamaheswari;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Levina Maheswari M.L
 * 2311103110
 * S1SI07C
 */
public class Pengembalian {
    Buku buku;
    Mahasiswa mahasiswa;
    String tanggalPengembalian;
    
    public Pengembalian(Buku buku, Mahasiswa mahasiswa,  String tanggalPengembalian){
        this.buku = buku;
        this.mahasiswa = mahasiswa;
        this.tanggalPengembalian = tanggalPengembalian;
    }
    
    public void tampilPengembalian(){
        System.out.println(mahasiswa.nama+" mengembalikan buku dengan judul "+
                buku.judul+" pada tanggal "+tanggalPengembalian);
    }
 
}
