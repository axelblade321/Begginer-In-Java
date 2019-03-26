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
public class Exercise {
    public static void main(String[] args) {
        Scanner sales1 = new Scanner(System.in);
        
        System.out.print("Input Your Sales = ");
        Integer sales = sales1.nextInt();
        
        if (sales>= 10000) {
            System.out.println("Your Performance is satisfactory");
            float bonus = (float) (100+0.01*(sales-10000));
            System.out.println("you got bonus " + bonus);
        } else {
            System.out.println("Your Performance is unsatisfactory");
            System.out.println("you got no bonus");
        }
    }
}
