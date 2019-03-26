/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyle Rayner
 */
public class Modul2 {
    public static void main(String[] args) {
        //Deklarasi Variable
        double panjang = 25;
        double lebar = 10;
        double jumlah, kurang, kali, bagi, modulus;
        // Proses Operasi
        jumlah = panjang + lebar; //operasi penjumlahan
        kurang = panjang - lebar; // proses pengurangan
        kali = panjang * lebar; //perkalian
        bagi = panjang / lebar; // pembagian
        modulus = panjang % lebar; // modulus
        //mencetak hasil
        System.out.println("Hasil Penjumlahan" + jumlah);
        System.out.println("Hasil Pengurngan" + kurang);
        System.out.println("Hasil Perkalian" + kali);
        System.out.println("Hasil Pembagian" + bagi);
        System.out.println("Hasil Modulus" + modulus);
        
        //Rumus Keliling Persegi
        int a, b, c;
        a = 4;
        b = 3;
        c = a * b;
        System.out.println("Hasil Keliling = " + c);
    }
}
