/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.cordesingpattern;

/**
 *
 * @author levin
 */
public class DepartmentTechnician extends ChangeArticleHandler{

    @Override
    public void checkStatus() {
        if(warrantyCovered())
        {
            setNext(new StorageHead());
            next.checkStatus();
        }
        else
        {
            System.out.println("El producto no está cubierto por la garantía");
        }
    }
    
}
