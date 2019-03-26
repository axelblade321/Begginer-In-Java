/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjava1;

import java.util.Scanner;

/**
 *
 * @author Kyle Rayner
 */
public class AplikasiMinuman {
    public static void main(String[] args) {
        Scanner minuman = new Scanner(System.in);
        int sodagembira=1, escicau=2, esteler=3;
        
        System.out.println("Soda Gembira = 10000");
        System.out.println("Es Cincau = 10000");
        System.out.println("Es Teller = 10000");
        
        System.out.print("Silahkan Pilih minuman anda:");
        String pilihan = minuman.nextLine();
        int jumlah = minuman.nextInt();
        System.out.println("Anda memesan" + pilihan + ", sebanyak :"+jumlah);
        System.out.println("Total belanja adalah"+ (jumlah * 10000));
        int total_belanja =jumlah * 10000;
        boolean is_diskon =total_belanja>50000;
        System.out.println("Apakah anda mendapat diskon " + is_diskon);
        do {            
           System.out.println("Apakah anda maubelanja lagi?");
           String lagi = minuman.nextLine();
        } while ( lagi.equals("Y"));
        
    }
}
