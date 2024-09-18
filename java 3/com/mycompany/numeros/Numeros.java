/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeros;

/**
 *
 * @author Jess
 */
public class Numeros {

    public static void main(String[] args) {
          int inicio = 2000;
        int fim = 2250;
        int quantidade = 0;

        for (int i = inicio; i <= fim; i++) {
            quantidade++;
        }

        System.out.println("A quantidade de números entre 2000 e 2250 é: " + quantidade);
    }
}
