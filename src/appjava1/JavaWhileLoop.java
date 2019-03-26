/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjava1;

/**
 *
 * @author Kyle Rayner
 */
public class JavaWhileLoop {
    public static void main(String[] args) {
        int i = 0, r = 0;
        while (i < 5) {
            r =r+i;
            System.out.println(i);
            i++;
            
        }
        System.out.println("Jumlahnya adalah = " +r);
        System.out.println("================");
        i =0;
        do {            
            System.out.println(i);
            i++;
        } while (i < 5);
        System.out.println("=================");
        System.out.println("=================");
              
    }
}
