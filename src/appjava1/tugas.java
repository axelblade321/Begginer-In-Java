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
public class tugas {
    public static void main(String[] args) {
         System.out.print("apakah kamu mau bermain? : ");  
         Scanner scan = new Scanner(System.in);  
         if(scan.nextBoolean()==true) {  
            System.out.println("ok.");  
         }else {  
            System.out.println("selamat tinggal");  
         }  
         scan.close();  
    }
}
