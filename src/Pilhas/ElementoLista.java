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
class ElementoLista<T> {
    
    private T info;
    private ElementoLista proximo;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public ElementoLista getProximo() {
        return proximo;
    }

    public void setProximo(ElementoLista proximo) {
        this.proximo = proximo;
    }
    
    
    
}
