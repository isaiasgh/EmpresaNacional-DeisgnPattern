/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.cordesingpattern;

/**
 *
 * @author levin
 */
public class DepartmentAssistant extends ChangeArticleHandler{

    @Override
    public void checkStatus() {
        if(verifyWarrant())
        {
            setNext(new DepartmentTechnician());
            next.checkStatus();
        }
        else
        {
            System.out.println("La garantía está vencida");
        }
    }
    
}
