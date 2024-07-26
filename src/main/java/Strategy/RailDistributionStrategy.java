/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author luisvergara
 */
public class RailDistributionStrategy implements DistributionStrategy{
    @Override
    public void distribute(String item, String destination) {
        System.out.println("Distribuyendo el artículo " + item + " por vía férrea a " + destination + ".");
    }
}
