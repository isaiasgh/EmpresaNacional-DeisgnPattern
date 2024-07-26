/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.cordesingpattern;

/**
 *
 * @author levin
 */
public class StorageHead extends ChangeArticleHandler{

    @Override
    public void checkStatus() {
        if(inStorage() && overThousand())
        {
            setNext(new StoreManager());
            next.checkStatus();
        }
        else if(inStorage())
        {
            System.out.println("El producto se puede reponer");
        }
        else
        {
            System.out.println("El producto no se puede reponer");   
        }
    }
    
}
