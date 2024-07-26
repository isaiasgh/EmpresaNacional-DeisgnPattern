/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author luisvergara
 */
public class main {
    public static void main(String[] args) {
        LogisticsContext logisticsContext = new LogisticsContext();

        // Establecer y usar estrategia de distribución automotriz
        logisticsContext.setStrategy(new AutomotiveDistributionStrategy());
        logisticsContext.distributeItem("Laptop", "Tienda A");

        // Cambiar a estrategia de distribución ciclista
        logisticsContext.setStrategy(new CyclingDistributionStrategy());
        logisticsContext.distributeItem("Smartphone", "Tienda B");

        // Cambiar a estrategia de distribución férrea
        logisticsContext.setStrategy(new RailDistributionStrategy());
        logisticsContext.distributeItem("Impresora", "Tienda C");

        // Cambiar a estrategia de distribución aérea
        logisticsContext.setStrategy(new AirDistributionStrategy());
        logisticsContext.distributeItem("Tablet", "Tienda D");

        // Cambiar a estrategia de distribución fluvial
        logisticsContext.setStrategy(new WaterDistributionStrategy());
        logisticsContext.distributeItem("Televisor", "Tienda E");
    }
}
