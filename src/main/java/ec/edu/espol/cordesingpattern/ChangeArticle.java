/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espol.cordesingpattern;

/**
 *
 * @author levin
 */
public interface ChangeArticle {
    
    void setNext(ChangeArticle handler);
    void checkStatus();
    
}
