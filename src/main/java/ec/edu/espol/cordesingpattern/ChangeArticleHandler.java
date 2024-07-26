/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.cordesingpattern;

/**
 *
 * @author levin
 */
public class ChangeArticleHandler implements ChangeArticle{
    protected ChangeArticle next;

    @Override
    public void setNext(ChangeArticle handler) {
       next = handler;
    }

    @Override
    public void checkStatus() {
        if(next == null)
            System.out.println("No se ha procesado su solicitud");
        next.checkStatus();
    }
    
    
}
