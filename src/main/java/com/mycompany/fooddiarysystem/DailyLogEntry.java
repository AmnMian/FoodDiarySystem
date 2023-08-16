/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fooddiarysystem;

/**
 *
 * @author Amn Mian
 */
public class DailyLogEntry {
    private double numServings;
    private ConsumableItem item;
    
    public ConsumableItem getItem() {return item; }
    public double getNumServings() { return numServings; }
    
    public DailyLogEntry(ConsumableItem item, double numServings) {
        this.item = item;
        this.numServings = numServings;
    }
    
}
