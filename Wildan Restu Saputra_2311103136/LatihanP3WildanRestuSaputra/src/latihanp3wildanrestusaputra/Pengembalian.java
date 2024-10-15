/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp3wildanrestusaputra;

/**
 *
 * @author Wildan Restu Saputra
 * 2311103136
 * S1SI-07-C
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
        System.out.println(mahasiswa.nama+" Mengembalikan buku dengan berjudul "+buku.judul+" pada tanggal "+tanggalPengembalian);
    }
}
