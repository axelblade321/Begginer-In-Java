/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjava1;

import com.sun.javafx.css.CssError;
import java.util.Scanner;

/**
 *
 * @author Gewa Pratama
 */
public class Belajar {
    public static void main(String[] args) {
        System.out.println("Belajar Scanner");
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nama SIapa.....");
        
        String nama = myObj.nextLine();
        System.out.println("Namamu adalah "+ nama);
        
    }
}
