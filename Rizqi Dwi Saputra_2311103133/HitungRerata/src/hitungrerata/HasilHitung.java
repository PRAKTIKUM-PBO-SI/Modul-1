/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitungrerata;

/**
 *
 * @author Rizqi Dwi Saputra / 2311103133
 * S1SI 07 C
 */

public class HasilHitung {
    
    float nilai1, nilai2, nilai3;
    float total;
    Siswa siswa;
    
    public HasilHitung(float nilai1, float nilai2, float nilai3, Siswa siswa){
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.siswa = siswa;
    }
    
    public void tampilkanTotal(){
        total = (nilai1 + nilai2 + nilai3) / 3;
        
        System.out.println("Nama Siswa : " + siswa.namaSiswa);
        System.out.println("Nilai 1 : " + nilai1);
        System.out.println("Nilai 2 : " + nilai2);
        System.out.println("Nilai 3 : " + nilai3);
        System.out.println("Rata - rata nilai : " + total);
    }
    
}
