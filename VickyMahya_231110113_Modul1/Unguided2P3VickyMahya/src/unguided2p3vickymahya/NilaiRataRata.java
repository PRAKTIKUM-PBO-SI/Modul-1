/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguided2p3vickymahya;

/**
 *
 * @author user
 */
public class NilaiRataRata {
     public double hitungRataRata(double[] nilai) {
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        return total / nilai.length;
    }

}
