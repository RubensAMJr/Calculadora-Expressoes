/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilhas;



/**
 *
 * @author Rubens Augusto Montibeller Junior , Maik Henrique Carminati
 */
public interface Pilha<T> {
    
    void push(T v)throws Exception;
    T pop()throws Exception;
    T peek();
    boolean vazia();
    void libera();
}
