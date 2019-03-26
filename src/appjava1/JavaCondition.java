/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjava1;

import java.io.DataInput;

/**
 *
 * @author Kyle Rayner
 * OWO what is this???
 */
public class JavaCondition {
    public static void main(String[] args) {
        System.out.println("Pertemuan 4");
        if (20<18) {
            System.out.println("20 Lebih Besar 18");
        } else {
            System.out.println("Kondisi Salah");
        }
        
        System.out.println("________________");
        
        int nilai = 50;
        if (nilai < 50) {
            System.out.println("Anda dapat c");
        } else if (nilai < 70) {
            System.out.println("Anda Dapat B");
        } else {
            System.out.println("Anda Dapat A");
        }
        
        String input ="L";
        String JK = (input == "L") ? "Laki-laki" : "Perempuan";
        System.out.println("Jenis Kelamin = "+JK);
        
        String grade ="j";
        switch (grade){
            case "A":
                System.out.println("Excelent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Bad");
                break;
            default:
                System.out.println("Undefined");
        }
    }
}
