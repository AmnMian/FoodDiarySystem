/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fooddiarysystem;

/**
 *
 * @author Amn Mian
 */
public class ConsumableItem {
    private String name;
    private String servingUnit;
    private double singleServSize;
    private int calsPerServ;
    
    public String getName() { return name; }
    public String getServingUnit() { return servingUnit; }
    public double getSingleServSize() { return singleServSize; }
    public int getCalsPerServ() { return calsPerServ; }
    
    public ConsumableItem(String name, String servUnit, double singleServSize, int calsPerServ) {
        this.name = name;
        this.servingUnit = servUnit;
        this.singleServSize = singleServSize;
        this.calsPerServ = calsPerServ;
    }
    
    @Override
    public String toString() {
        return name + "," + servingUnit + "," + singleServSize + "," + calsPerServ;
    }
}
