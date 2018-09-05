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
public class PilhaVetor<T> implements Pilha<T>{
    
    private int n = 0; // quantidade de valores armazenados     
    private int tam; // tamanho do vetor    
    private T[] vet; // vetor que armazena elementos

    public PilhaVetor(int tam) {
        this.tam = tam;
        vet = (T[])new Object[tam];
    }
    
    

    // implementação dos métodos...
    @Override
    public void push(T v) throws Exception{
        if (n > tam) {
            throw new IllegalArgumentException("Quantidade maxima de elementos na pilha alcançado");
        }
        vet[n] = v;
        n++;
    }

    @Override
    public T pop() throws Exception{
        T temp;
        if (n == 0) {
            throw new IllegalArgumentException("Pilha vazia");
        }
        temp = vet[n-1];
        vet[n-1] = null;
        n--;
        return temp;
    }

    @Override
    public T peek() {
        return vet[n-1];
    }

    @Override
    public boolean vazia() {
        if (n == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void libera() {
        n = 0;
    }
}

   
