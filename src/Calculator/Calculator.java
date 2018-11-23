/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.util.Scanner;

/**
 *
 * @author Rifat
 */
public class Calculator {
    public static void main(String[] args) {
        int a, b, c;
        double x,y,z;
        SimpleCalculator obj = new SimpleCalculator();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter First Integer Number :");
        a = sc.nextInt();        
        System.out.println("Please Enter Secound Integer Number :");
        b = sc.nextInt();
        System.out.println("Please Enter Third Integer Number :");
        c = sc.nextInt();
        
        System.out.println("Please Enter First Double Number :");
        x = sc.nextDouble();        
        System.out.println("Please Enter Secound Double Number :");
        y = sc.nextDouble();
        System.out.println("Please Enter Third Double Number :");
        z = sc.nextDouble();
        
        
        System.out.println("Summation of two integer : "+obj.add(a, b));
        System.out.println("Summation of three integer : "+obj.add(a, b,c));
        
        System.out.println("Summation of two Double : "+obj.add(x, y));
        System.out.println("Summation of three Double : "+obj.add(x, y,z));
    }
}
