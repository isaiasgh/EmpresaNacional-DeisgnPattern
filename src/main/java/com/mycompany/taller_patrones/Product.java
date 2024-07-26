/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller_patrones;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisvergara
 */

public class Product {
    private String name;
    private String category;
    private boolean isInRepair;
    private boolean hasFault;

    // Constructor
    public Product(String name, String category, boolean isInRepair, boolean hasFault) {
        this.name = name;
        this.category = category;
        this.isInRepair = isInRepair;
        this.hasFault = hasFault;
    }

    // Getters
    public String getName() { return name; }
    public String getCategory() { return category; }
    public boolean isInRepair() { return isInRepair; }
    public boolean hasFault() { return hasFault; }
}
    
