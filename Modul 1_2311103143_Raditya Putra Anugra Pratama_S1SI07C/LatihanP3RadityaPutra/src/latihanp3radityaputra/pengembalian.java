/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp3radityaputra;

/**
 *
 * @author Raditya Putra Anugra Pratama
 * 2311103143
 * S1SI07-C
 */
public class pengembalian {
    Buku buku;
    mahasiswa mahasiswa;
    String tanggalPengembalian;
    
    public pengembalian(Buku buku, mahasiswa mahasiswa, String tanggal){
        this.buku = buku;
        this.mahasiswa = mahasiswa;
        this.tanggalPengembalian = tanggal;
    }
    
    public void tampilkanPengembalian(){
        System.out.println(mahasiswa.nama+" Memngembalikan buku dengan berjudul "+buku.judul+" pada tanggal "+tanggalPengembalian);
        
    }
}