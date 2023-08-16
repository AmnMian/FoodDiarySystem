/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fooddiarysystem;

/**
 *
 * @author Amn Mian
 */
public class Food extends ConsumableItem {
    private int fibrePerServ;
    
    public int getFibrePerServ() {
        return fibrePerServ;
    }
    
    public Food(String name, String servUnit, double singleServSize, int calsPerServ, int fibrePerServ) {
        super(name, servUnit, singleServSize, calsPerServ);                
        this.fibrePerServ = fibrePerServ;
    }
    
    @Override
    public String toString() {
        return super.toString() + "," + fibrePerServ;
    }
}
