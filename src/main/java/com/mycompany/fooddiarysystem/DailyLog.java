/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fooddiarysystem;

import java.time.LocalDate;
import java.util.LinkedList;

/**
 *
 * @author Amn Mian
 */
public class DailyLog {
    private LocalDate date;
    private double weight;
    private LinkedList<DailyLogEntry> logEntries = new LinkedList<DailyLogEntry>();
    
    public LocalDate getDate() { return date; }
    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }
    public LinkedList<DailyLogEntry> getLogEntries() { return logEntries; }
    
    public DailyLog(int day, int month, int year) {
        date = LocalDate.of(year, month, day);
    }
    
    public void addEntry(ConsumableItem item, double numServings) {
        DailyLogEntry e = new DailyLogEntry(item, numServings);
        addToEntryList(e);
    }
    
    public void addToEntryList(DailyLogEntry entry) {
        logEntries.add(entry);
    }
    
}
