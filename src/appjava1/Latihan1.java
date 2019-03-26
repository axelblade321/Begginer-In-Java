/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjava1;

import java.util.Scanner;

/**
 *
 * @author Gewa Pratama
 */
public class Latihan1 {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        
        System.out.print("Input angka 1= ");        
        double angka1 = angka.nextDouble();
        
        System.out.print("Input angka 2= ");
        double angka2 = angka.nextDouble();
        
        double Hasil;
        Hasil = angka1 * angka2;
        System.out.println("Hasil Penjumlahan="+ Hasil);
        
        
        
    }
}
