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
public class ConcreteIterator implements Iterator{
    private List<Product> products;
    private int position = 0;
    private FilterCriteria criteria;

    public ConcreteIterator(List<Product> products, FilterCriteria criteria) {
        this.products = products;
        this.criteria = criteria;
    }

    @Override
    public boolean hasNext() {
        while (position < products.size()) {
            if (criteria.matches(products.get(position))) {
                return true;
            }
            position++;
        }
        return false;
    }

    @Override
    public Product next() {
        return products.get(position++);
    }
}
