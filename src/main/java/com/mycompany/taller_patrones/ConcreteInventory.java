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
public class ConcreteInventory implements IterableCollection{
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public Iterator createIterator(FilterCriteria criteria) {
        return new ConcreteIterator(products, criteria);
    }
}
