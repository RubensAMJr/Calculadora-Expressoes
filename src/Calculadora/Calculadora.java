/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import Pilhas.PilhaVetor;
import Pilhas.PilhaLista;
import Pilhas.Pilha;

/**
 *
 * @author Rubens Augusto Montibeller Junior , Maik Henrique Carminati
 */
public class Calculadora {

    private Pilha<String> pilha;

    public void constroiVetor(int tamanho) {
        pilha = new PilhaVetor<>(tamanho);
    }

    public void constroiLista() {
        pilha = new PilhaLista<>();
    }

    public void Calcular(String expressao) {
        for (int i = 0; i < expressao.length(); i++) {
            String numero = "";
            int j = i;
            while (Character.isDigit(expressao.charAt(j)) || Character.toString(expressao.charAt(j)).equals(".")) {
                numero += Character.toString(expressao.charAt(j));
                j++;
            }
            if (!numero.equals("")) {
                AdicionarOperando(numero);
            }
            i = j;
            char atual = expressao.charAt(i);
            if (!Character.toString(atual).equals(" ")) {
                CalculaOperador(atual);
            }
        }
    }

    private void AdicionarOperando(String numero) {
        try {
            pilha.push(numero);
        } catch (Exception e) {
            //Logger.getLogger(Apresentacao.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void CalculaOperador(char atual) {
        try {
            double valor1;
            double valor2;
            if (atual == '+') {
                valor1 = Double.parseDouble(pilha.pop());
                valor2 = Double.parseDouble(pilha.pop());
                System.out.println(valor1);
                System.out.println(valor2);
                double resultado = valor1 + valor2;
                pilha.push(Double.toString(resultado));
                System.out.println(pilha.peek());
            } else if (atual == '-') {
                valor1 = Double.parseDouble(pilha.pop());
                valor2 = Double.parseDouble(pilha.pop());
                double resultado = valor2 - valor1;
                pilha.push(Double.toString(resultado));
            } else if (atual == '/') {
                valor1 = Double.parseDouble(pilha.pop());
                valor2 = Double.parseDouble(pilha.pop());
                double resultado = valor2 / valor1;
                pilha.push(Double.toString(resultado));
            } else if (atual == '*') {
                valor1 = Double.parseDouble(pilha.pop());
                valor2 = Double.parseDouble(pilha.pop());
                double resultado = valor1 * valor2;
                pilha.push(Double.toString(resultado));
            }
        } catch (Exception e) {

        }
    }

    public String getResultadoFinal() {
       String str = "Erro"; 
       try{ 
        str = pilha.pop();
       }catch(Exception e){
           
       }
       return str;
    }
}
