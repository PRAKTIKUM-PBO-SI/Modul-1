/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitungrata.rata;

/**
 *
 * @author ASUS
 */
public class HasilHitung {
    float nilai1, nilai2, nilai3;
    float total;
    Mahasiswa mahasiswa;
    
    public HasilHitung(float nilai1, float nilai2, float nilai3, Mahasiswa mahasiswa){
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.mahasiswa = mahasiswa;
    }
    
   public void tampilkanTotal(){
       total = (nilai1 + nilai2 + nilai3)/3;
       
       System.out.println( "Nama mahasiswa: " + mahasiswa.namaMhs);
       System.out.println("nilai1:" + nilai1);
       System.out.println("nilai2:" + nilai2);
       System.out.println("nilai3:" + nilai3);
       System.out.println(" Rata-rata nilai: " + total);
   }
}

