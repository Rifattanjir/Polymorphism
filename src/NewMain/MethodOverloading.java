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
public class MethodOverloading {
    public static void main(String[] args) {
        Overload obj = new Overload();
        NewOverload obj2 = new NewOverload();
        
        obj.demo(1.5);
        obj.demo(5);
        obj.demo(3, 7);
        
        System.out.println("Sub of two int number "+obj2.sub(4, 5));
        System.out.println("Sub of two  double number "+obj2.sub(2.2, 4.3));
        System.out.println("Addition of two double number "+obj2.sum(2.2, 4.3));
        System.out.println("Addition of two int number "+obj2.sum(2, 3));
        obj2.sum(5, 3);
    }
}
