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
public class StoreSellerFilter implements FilterCriteria{
    private String storeCategory;

    public StoreSellerFilter(String storeCategory) {
        this.storeCategory = storeCategory;
    }

    @Override
    public boolean matches(Product product) {
        return product.getCategory().equals(storeCategory);
    }
}
