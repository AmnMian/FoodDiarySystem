/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.fooddiarysystem;

import java.io.File;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Amn Mian
 */
public class FoodDiarySystem {

    private static LinkedList<DailyLog> dailyLogs = new LinkedList<DailyLog>();
    private static LinkedList<ConsumableItem> items = new LinkedList<ConsumableItem>();

    public static LinkedList<ConsumableItem> getItems() {
        return items;
    }

    public static boolean addFoodItem(String name, String servUnit, double singServSize,
            int calsPerServ, int fibrePerServ) {

        ConsumableItem item = searchConsumableItem(name);

        if (item == null) {
            Food f = new Food(name, servUnit, singServSize, calsPerServ, fibrePerServ);
            addToItemList(f);
            return true;
        } else {
            return false;
        }
    }

    public static boolean addBeverageItem(String name, String servUnit, double singServSize,
            int calsPerServ, int caffeinePerServ) {

        ConsumableItem item = searchConsumableItem(name);

        if (item == null) {
            Beverage f = new Beverage(name, servUnit, singServSize, calsPerServ, caffeinePerServ);
            addToItemList(f);
            return true;
        } else {
            return false;
        }
    }

    public static void addToItemList(ConsumableItem item) {
        items.add(item);
    }

    public static ConsumableItem searchConsumableItem(String name) {
        for (int i = 0; i < items.size(); i++) {
            //get the ith element
            ConsumableItem ithItem = items.get(i);
            String ithItemName = ithItem.getName();
            if (ithItemName.equals(name)) {
                return ithItem;
            }
        }
        return null;
    }

    public static DailyLog searchDailyLog(int day, int month, int year) {
        for (int i = 0; i < dailyLogs.size(); i++) {
            DailyLog ithLog = dailyLogs.get(i);
            LocalDate ithLogDate = ithLog.getDate();
            int ithLogDay = ithLogDate.getDayOfMonth();
            int ithLogMonth = ithLogDate.getMonthValue();
            int ithLogYear = ithLogDate.getYear();
            if ((ithLogDay == day) && (ithLogMonth == month) && (ithLogYear == year)) {
                return ithLog;
            }
        }
        return null;
    }

    public static LinkedList<ConsumableItem> searchConsumableItemsByPartialName(String partialName) {
        LinkedList<ConsumableItem> retList = new LinkedList<ConsumableItem>();
        for (int i = 0; i < items.size(); i++) {
            //get the ith element
            ConsumableItem ithItem = items.get(i);
            String ithItemName = ithItem.getName();
            if (ithItemName.contains(partialName)) {
                retList.add(ithItem);
            }
        }
        return retList;
    }

    public static void addToDailyLog(DailyLog log) {
        dailyLogs.add(log);
    }

    public static void importItemsFromFile() {
        Scanner input = null;
        try {
            File file = new File("items.txt");
            input = new Scanner(file);
            
            while (input.hasNextLine()) {  // checks if there is another line in the file
                String line = input.nextLine();  //reads the next line from the file
                String[] tokens = line.split(",");
                if(tokens[0].equals("F")) { //food item
                    addFoodItem(tokens[1], tokens[3], Double.parseDouble(tokens[2]), 
                            Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]) );
                } else { //beverage item
                    addBeverageItem(tokens[1], tokens[3], Double.parseDouble(tokens[2]), 
                            Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]) );
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            if (input != null) {
                input.close();
            }
        }

    }
}
