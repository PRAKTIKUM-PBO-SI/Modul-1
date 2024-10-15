/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unguidedp3vickymahya;

/**
 *
 * @author vicky mahya mafaza
 */
public class UnguidedP3VickyMahya {


    public static void main(String[] args) {
        Buku buku = new Buku("buku PBO","vicky",2024);
        
        Mahasiswa mahasiswa = new Mahasiswa("mahya","2311103113");
        
        Peminjaman peminjaman = new Peminjaman(buku, mahasiswa, "07/10/2024");
        
        peminjaman.tampilkanPeminjaman();
        
        peminjaman.kembalikanBuku("23-02-2024");
        
        peminjaman.tampilkanPeminjaman();
       
    }
    
}
