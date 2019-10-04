/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan21.rataratanilai;
// package scanner
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menghitung
 *                     rata-rata nilai
 * 
 */
public class PBO210118071Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // membuat objek dari class scanner
        Scanner input = new Scanner(System.in);
        // variabel untuk menyimpan input dari user
        int bykMhs, nilai;
        float rata, jumlah;
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        bykMhs = input.nextInt();
        
        jumlah = 0;
        for (int i = 1; i <= bykMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = input.nextInt();
            
            jumlah = nilai + jumlah;
        }
        
        rata = jumlah / bykMhs;
        System.out.println("Maka, Rata-rata Nilainya adalah " + rata);
        System.out.println("Developed by : David Aditya Winarto");
    }
    
}
