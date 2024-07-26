/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author luisvergara
 */
public class LogisticsContext {
    private DistributionStrategy strategy;

    public void setStrategy(DistributionStrategy strategy) {
        this.strategy = strategy;
    }

    public void distributeItem(String item, String destination) {
        if (strategy == null) {
            throw new IllegalStateException("La estrategia de distribución no está definida.");
        }
        strategy.distribute(item, destination);
    }
}
