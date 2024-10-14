/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mengitungratarata;
/**
 *
 * @author Shahifah Sajadiyah
 * 2311103116
 * SI 07 C
 */
public class MengitungRatarata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Mahasiswaa mahasiswa1 = new Mahasiswaa("Shahifah Sajadiyah", 100, 89, 99);
      
        System.out.println("Nama: " + mahasiswa1.nama());
        System.out.println("Nilai 1: " + mahasiswa1.nilai1());
        System.out.println("Nilai 2: " + mahasiswa1.nilai2());
        System.out.println("Nilai 3: " + mahasiswa1.nilai3());
        
        float rataRata1 = Perhitungan.hitungRataRata(mahasiswa1);
        System.out.println("Rata-rata nilai: " + rataRata1);
        System.out.println();
    

    }  
}
