/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unguidedp3hafidramadhan;

/**
 *
 * @author dell Hafid Ramadhan
 * 2311103104
 * SI07C
 */
public class NilaiRataRata {
    Siswa siswa;
    int[] nilaiMataPelajaran;
    double hasilRata;
    
    public NilaiRataRata(Siswa siswa, int[] nilaiMataPelajaran) {
        this.siswa = siswa;
        this.nilaiMataPelajaran = nilaiMataPelajaran;
        this.hasilRata = hitungRataRata(nilaiMataPelajaran);
    }
    
    private double hitungRataRata(int[] nilai) {
        double total = 0;
        for (int n : nilai) {
            total += n;
        }
        return total / nilai.length;
    }
    
    public void tampilkanHasil() {
        System.out.println("\n===== PENILAIAN RataRata Siswa =====");
        System.out.println("Nilai rata-rata siswa " + siswa.nama + " adalah " + hasilRata);
    }
}
