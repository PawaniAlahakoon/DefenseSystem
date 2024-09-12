/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.defensesystem;

/**
 *
 * @author DELL
 */
public class DefenseSystem {

   public static void main(String[] args) {
        Observable observable = new Observable();
        
        observable.addTroup(new MainController(observable));
    }
}
   