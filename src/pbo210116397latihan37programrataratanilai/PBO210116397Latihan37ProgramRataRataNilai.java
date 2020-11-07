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
public class PBO210116397Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jmlSiswa;
        Scanner scn = new Scanner(System.in);
        Value rata2 = new Value();

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jmlSiswa = scn.nextInt();
        
        rata2.hitungNilai(jmlSiswa);
        System.out.println("Maka, Rata-rata nilainya adalah : " 
                + rata2.hitungRata2Nilai (rata2.jmlNilai, jmlSiswa));
        
        System.out.println("Developed by : Muhammad Azraqi Saputra");
    
    }
    
}
