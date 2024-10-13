/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp3geordysiphosamueldamanik;

/**
 *
 * @author Geordy Sipho Samue Damanik
 * 2311103112
 * S1SI-07-C
 */

public class Peminjaman {
   ClassBuku buku;
   Mahasiswa mahasiswa;
   String tanggalPeminjaman;
   String tanggalPengembalian;
   boolean sudahDikembalikan;
   
   public Peminjaman(ClassBuku buku, Mahasiswa mahasiswa, String tanggalPeminjaman) {
       this.buku = buku;
       this.mahasiswa = mahasiswa;
       this.tanggalPeminjaman = tanggalPeminjaman;
       this.sudahDikembalikan = false;
   }
   
   public void kembalikanBuku(String tanggalPengembalian) {
       this.tanggalPengembalian = tanggalPengembalian;
       this.sudahDikembalikan = true;
   }
   
   public void tampilkanPeminjaman() {
       System.out.println(mahasiswa.nama + " meminjam buku dengan judul " + buku.judul + " pada tanggal " + tanggalPeminjaman);
       if (sudahDikembalikan) {
           System.out.println("Buku telah dikembalikan pada tanggal " + tanggalPengembalian);
       } else {
           System.out.println("Buku belum dikembalikan");
       }
   }
}
