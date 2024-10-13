/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilairatarata;

/**
 *
 * @author Anggit Refiyan 
 * 2311103142 
 * 07C
 */
public class NilaiRataRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student = new Student("Anggit", new double[]{90, 90, 80, 75, 85});
        double average = hitung.Hitung(student.getGrades());
        
        System.out.println("Nama Mahasiswa: " + student.getName());
        System.out.println("Nilai Rata-rata: " + String.format("%.2f", average));

    }
    
}
