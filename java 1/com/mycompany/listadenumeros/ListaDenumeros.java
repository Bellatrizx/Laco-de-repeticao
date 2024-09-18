/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listadenumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author Jess
 */
public class ListaDenumeros {

     public static void main(String[] args) {
        StringBuilder resultado = new StringBuilder("Números pares entre 2 e 300:\n");
        for (int i = 2; i <= 300; i += 2) {
            resultado.append(i).append(" ");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
