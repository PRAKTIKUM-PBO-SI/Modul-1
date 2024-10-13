/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp3rajendraikmalveorozzan;

/**
 *
 * @author Rajendra Ikmal Veorozzan
 * 2311103122
 * 07C
 */
public class Pengembalian {
    Buku buku;
    Mahasiswa mahasiswa;
    String tanggalPengembalian;
    
    public Pengembalian(Buku buku, Mahasiswa mahasiswa, String tanggal){
        this.buku = buku;
        this.mahasiswa = mahasiswa;
        this.tanggalPengembalian = tanggal;
    }
    
    public void tampilkanPengembalian(){
        System.out.println(mahasiswa.nama+" memngembalikan buku dengan judul "+buku.judul+" pada tanggal "+tanggalPengembalian);
        
    }
}