/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Rifat
 */
public class Dog extends Animal {
    public void sound(){
        System.out.println("Dog is createing sound : Barking ....");
    }
    
    public static void main(String[] args) {
        Animal obj2 = new Dog();
        obj2.sound();
    }
}
