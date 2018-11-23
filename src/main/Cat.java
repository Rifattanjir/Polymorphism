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
public class Cat extends Animal{
    public void sound(){
        System.out.println("Cat is createing sound : Mewww....");
    }
    public static void main(String[] args) {
        Animal obj3 = new Cat();
        obj3.sound();
    }
}
