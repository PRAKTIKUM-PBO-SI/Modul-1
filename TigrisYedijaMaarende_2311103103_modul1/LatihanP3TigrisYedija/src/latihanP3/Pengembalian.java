/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanP3;

/**
 *
 * @author Tigris Yedija Maarende 
 * 231103103
 * S1 SI07-C
 */
class Pengembalian {
    Buku buku;
    Mahasiswa mahasiswa;
    String tanggalPengembalian;

    public Pengembalian(Buku buku, Mahasiswa mahasiswa, String tanggalPengembalian) {
        this.buku = buku;
        this.mahasiswa = mahasiswa;
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public void tampilkanPengembalian() {
        System.out.println(mahasiswa.nama + " mengembalikan buku dengan judul " + buku.judul +" dan dikembalikan pada tanggal " + tanggalPengembalian);
    }
}
    


