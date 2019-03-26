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
public class exercise2 {
    public static void main(String[] args) {
        Scanner sales1 = new Scanner(System.in);
        
        System.out.print("Please Input your Sales = ");
        Integer sales = sales1.nextInt();
        
        if (sales>=20000) {
            System.out.println("Your Performance is Excelent");
            int bonus1 = 1000;
            System.out.println("You Got Bonus = " + bonus1);
        } else if(sales>=7500){
            System.out.println("Your Performance is Fine");
            int bonus2 = 500;
            System.out.println("You Got Bonus = " + bonus2);
        } else if(sales>=5000){
            System.out.println("Your Performance is Satisfactry");
            int bonus3 = 100;
            System.out.println("You Got Bonus = " + bonus3);
        } else {
            System.out.println("You are Fired");
        }
    }
    
}
