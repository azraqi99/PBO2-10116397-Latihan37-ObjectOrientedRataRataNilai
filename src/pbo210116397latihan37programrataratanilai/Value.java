/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Program Rata Rata Nilai
 */
package pbo210116397latihan37programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Zetro
 */
public class Value {
    public double rataRata;
    public double jmlNilai = 0;
    
    public void hitungNilai(int jmlSiswa) {
        int i;
        double nilai;
        Scanner value = new Scanner(System.in);
        
        for(i = 1; i <= jmlSiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = value.nextDouble();
            jmlNilai = jmlNilai + nilai;
        }
    }
    
    public double hitungRata2Nilai(double jmlNilai, int jmlSiswa) {
        rataRata = jmlNilai / jmlSiswa;
        return rataRata;
    }   
}
