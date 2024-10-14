/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hitungrata.rata;

/**
 *
 * @author ASUS
 */
public class HitungRataRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa( " Tegar Ferdian Firmansyah ");
        HasilHitung rerata = new HasilHitung( 75, 85, 90, mahasiswa);
        
        rerata.tampilkanTotal();
                
    }
    
}
