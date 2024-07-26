/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller_patrones;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisvergara
 */
public class Taller_patrones {

        ConcreteInventory inventory = new ConcreteInventory();

        // Agregar productos
        inventory.addProduct(new Product("Laptop", "Computación", false, false));
        inventory.addProduct(new Product("Impresora", "Impresión", true, true));
        inventory.addProduct(new Product("Celular", "Celulares", false, false));

        Iterator buyerIterator = inventory.createIterator(new BuyerFilter());
        while (buyerIterator.hasNext()) {
            System.out.println("Product for Buyer: " + buyerIterator.next().getName());
        }

        Iterator storeSellerIterator = inventory.createIterator(new StoreSellerFilter("Computación"));
        while (storeSellerIterator.hasNext()) {
            System.out.println("Product for Store Seller: " + storeSellerIterator.next().getName());
        }

        Iterator supplierIterator = inventory.createIterator(new SupplierFilter());
        while (supplierIterator.hasNext()) {
            System.out.println("Product for Supplier: " + supplierIterator.next().getName());
        }

        Iterator maintenanceAssistantIterator = inventory.createIterator(new MaintenanceAssistantFilter());
        while (maintenanceAssistantIterator.hasNext()) {
            System.out.println("Product for Maintenance Assistant: " + maintenanceAssistantIterator.next().getName());
        }
    }
}
