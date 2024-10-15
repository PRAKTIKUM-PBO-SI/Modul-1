/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguidedp3vickymahya;

/**
 *
 * @author vicky mahya mafaza
 */
public class Peminjaman {
    Buku buku;
    Mahasiswa mahasiswa;
    String tanggalPengembalian;
    String tanggalPeminjaman;
    
    public Peminjaman(Buku buku, Mahasiswa mahasiswa, String tanggalPeminjaman){
        this.buku = buku;
        this.mahasiswa = mahasiswa;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tanggalPengembalian = null;
    }
    
    public void tampilkanPeminjaman(){
    System.out.println(mahasiswa.nama+" meminjam buku dengan judul "+buku.judul+"pada tanggal"+ tanggalPeminjaman);
    if (tanggalPengembalian != null){
        System.out.println("Buku dikembalikan pada tanggal" + tanggalPengembalian);
    }else{
        System.out.println("Buku belum dikembalikan");
    }
}
    //Metode untuk mengembalikan buku
    public void kembalikanBuku(String tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
        System.out.println("Buku berjudul" + buku.judul + "telah dikembalikan" + mahasiswa.nama + "pada tanggal" + tanggalPengembalian);
        
}        
}

