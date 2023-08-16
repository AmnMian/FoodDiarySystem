/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fooddiarysystem;

/**
 *
 * @author Amn Mian
 */
public class Beverage extends ConsumableItem{
    private int caffeinePerServ;
    
    public int getCaffeinePerServ() { return caffeinePerServ; }
    
    public Beverage(String name, String servUnit, double singleServSize, int calsPerServ, int caffeinePerServ){
        super(name, servUnit, singleServSize, calsPerServ);
        this.caffeinePerServ = caffeinePerServ;
    }
    
    @Override
    public String toString() {
        return super.toString() + "," + caffeinePerServ;
    }
}
