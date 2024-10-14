/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp3AchmadShodiq;

/**
 *
 * @author User
 */
public class pengembalian {
    Buku buku;
    Mahasiswa mahasiswa;
    String tanggalPengembalian;
    
    public pengembalian(Buku buku, Mahasiswa mahasiswa, String tanggal){
        this.buku = buku;
        this.mahasiswa = mahasiswa;
        this.tanggalPengembalian = tanggal;
    }
    public void tampilkanPengembalian(){
        System.out.println(mahasiswa.nama +" Mengembalikan buku dengan berjudul"+ buku.judul+" pada tanggal "+ tanggalPengembalian);
    }
}
