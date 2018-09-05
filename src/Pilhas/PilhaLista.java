/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilhas;

import Pilhas.Pilha;

/**
 *
 * @author Rubens Augusto Montibeller Junior , Maik Henrique Carminati
 */
public class PilhaLista<T> implements Pilha<T> {
private ElementoLista topo;
// implementacao de métodos da interface Pilha

    public PilhaLista() {
        topo = new ElementoLista();
    }

     

    @Override //Empilhar
    public void push(T v) throws Exception {
        if (v == null) {
            throw new IllegalArgumentException("Item não informado");
        }
        ElementoLista item = new ElementoLista();
        item.setInfo(v);
        item.setProximo(topo);
        this.topo = item;
    }

    @Override
    public T pop() throws Exception {
        if (topo == null) {
            throw new IllegalArgumentException("Pilha vazia");
        }
        T item = (T) topo.getInfo();
        System.out.println(item);
        topo = topo.getProximo();
        return item;      
    }

    @Override
    public T peek() {
        T retorno = (T) topo;
        return retorno;
    }

    @Override
    public boolean vazia() {
        if (topo == null) {
            return true;
        }
        return false;
    }

    @Override
    public void libera() {
        topo = null;
    }
}
