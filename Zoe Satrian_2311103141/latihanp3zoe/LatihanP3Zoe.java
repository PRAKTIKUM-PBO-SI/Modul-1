package latihanp3zoe;

/**
 *
 * @author Zoe Satrian;
 * 2311103141
 * 07C
 */
public class LatihanP3Zoe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buku buku = new Buku("Belajar PBO", "Mr. Sena",2023);
        Mahasiswa mahasiswa = new Mahasiswa("Joe","2311103141");
        Peminjaman peminjaman = new Peminjaman(buku, mahasiswa, "07/10/2024");
        
        peminjaman.tampilkanPeminjaman();
        
        System.out.println("");
        Pengembalian pengembalian = new Pengembalian(buku, mahasiswa, "13/10/24");
        pengembalian.tampilkanPengembalian();
    }
    
}