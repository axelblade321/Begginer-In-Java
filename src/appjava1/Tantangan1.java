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
public class Tantangan1 {
    public static void main(String[] args) {
        int i=2,b=0;
        while (i <=10) {            
            if (i%2==0) {
            b =b+i;
            System.out.println(i);
            }
            i++;

        }
        System.out.println("HAsil Penjumlhan = "+ b);
    }
}
