/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided2;

/**
 *@author Riska Vany Dewi
 * 2311103111
 * S1SI07C
 */
public class RataRata {
    Nilai nilai;
    
    public RataRata(Nilai nilai) {
        this.nilai = nilai;
    }
    
    public double hitungRataRata(){
        return(nilai.nilai1 + nilai.nilai2 + nilai.nilai3) / 3.0;
    }
}
