package latihanp3zoe;

/**
 *
 * @author User
 */
public class Peminjaman {
    Buku buku;
    Mahasiswa mahasiswa;
    String tanggalPeminjaman;
    
    public Peminjaman(Buku buku, Mahasiswa mahasiswa, String tanggalPeminjaman){
        this.buku = buku;
        this.mahasiswa = mahasiswa;
        this.tanggalPeminjaman = tanggalPeminjaman;
    }
    
    public void tampilkanPeminjaman(){
        System.out.println(mahasiswa.nama + "meminjam buku dengan judul" + buku.judul + "pada tanggal" + tanggalPeminjaman);
    }
}
