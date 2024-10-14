package latihanp3zoe;

/**
 *
 * @author Zoe Satrian / 2311103141
 */
public class Pengembalian {

    Buku   buku; Mahasiswa mahasiswa;
    String tanggalKembali;
    
    public Pengembalian(Buku buku, Mahasiswa mahasiswa, String tanggalKembali){ this.buku = buku;
    this.mahasiswa = mahasiswa;
    this.tanggalKembali = tanggalKembali;
}


    public void tampilkanPengembalian(){
    System.out.println("Buku " + buku.judul + " Berhasil dikembalikan oleh " + mahasiswa.nama + " pada tanggal : " + tanggalKembali );

}

}