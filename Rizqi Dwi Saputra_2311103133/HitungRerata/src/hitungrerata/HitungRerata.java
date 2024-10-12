/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hitungrerata;

/**
 *
 * @author Rizqi Dwi Saputra / 2311103133
 * S1SI 07 C
 */
public class HitungRerata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Siswa siswa = new Siswa("Saputra");
        HasilHitung rerata = new HasilHitung(95, 88, 90, siswa);
        
        rerata.tampilkanTotal();
    }
    
}
