/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewMain;

/**
 *
 * @author Rifat
 */
public class Overload {
    void demo(int a){
        System.out.println("Value of Interger is : "+a);
    }
    void demo(int a , int b){
        System.out.println("Value of two Integers : "+a+" and "+b);
    }
    double demo(double a){
        System.out.println("Double value is :"+a);
        return a;
    }
}
