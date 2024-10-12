/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided2p3izmasyabrian;

/**
 *
 * @author HP
 */
public class NilaiRataRata {
    Siswa siswa;
    int[] nilai;
    double hasil;
    
    public NilaiRataRata(Siswa siswa, int[] nilai){
        this.siswa = siswa;
        this.nilai = nilai;
        this.hasil = Hitung(nilai);
    }
    
    private double Hitung(int[] nilai){
        double hasil = 0;
        for(int c:nilai){
            hasil += c;
        }
        return hasil/nilai.length;
    }
    
    public void tampilkanHasil(){
        System.out.println("Nilai rata-rata siswa "+siswa.nama+" adalah "+hasil);
    }
}
