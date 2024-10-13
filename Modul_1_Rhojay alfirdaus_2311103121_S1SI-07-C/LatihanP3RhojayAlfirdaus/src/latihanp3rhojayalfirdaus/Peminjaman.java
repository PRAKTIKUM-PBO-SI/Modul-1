/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp3rhojayalfirdaus;

/**
 *
 * @author Rhojay Alfirdaus
 */
public class Peminjaman {
    Buku buku ;
    Mahasiswa mahasiswa ;
    String tanggalPeminjaman ;
    String tanggalPengembalian ;
    
    public Peminjaman (Buku buku,Mahasiswa mahasiswa, String tanggalPeminjaman){
        
        this.buku = buku;
        this.mahasiswa = mahasiswa;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tanggalPengembalian = null;
        
    }
        public void tampilkanPeminjaman (){
        
        System.out.println(mahasiswa.nama+ " meminjam buku dengan judul " +
                buku.Judul + " pada tanggal " + tanggalPeminjaman);
    
    }
    
      public void kembalikanBuku(String tanggalPengembalian) {        
        this.tanggalPengembalian = tanggalPengembalian;        
        System.out.println(mahasiswa.nama + " mengembalikan buku dengan judul " + buku.Judul + " pada tanggal " + tanggalPengembalian);
}
}
