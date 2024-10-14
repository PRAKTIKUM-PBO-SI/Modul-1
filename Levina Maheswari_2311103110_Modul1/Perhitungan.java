package aplikasikalkulator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Levina Maheswari
 * 2311103110
 * S1SI07C
 */
public class Perhitungan {
    Mahasiswa mahasiswa;
    double nilai1,nilai2,nilai3;
    double hasil;
    
    public Perhitungan(int nilai1, int nilai2, int nilai3,Mahasiswa mahasiswa){
        this.mahasiswa= mahasiswa;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
         hasil= ((nilai1+nilai2+nilai3)/3);
    }
    public void tampilPerhitungan(){
        System.out.println("Nama     : "+mahasiswa.nama + "\n" + 
                           "NIM      : "+mahasiswa.nim+"\n"+
                           "Prodi    : "+mahasiswa.prodi+"\n"+
                           "Semester : "+mahasiswa.semester+"\n"+ 
                           "Nilai 1  : "+nilai1+"\n"+ 
                           "Nilai 2  : "+nilai2+"\n"+ 
                           "Nilai 3  : "+nilai3+"\n"+ "\n"+
                           "IPK      : "+hasil+"\n");
                
    }
}
