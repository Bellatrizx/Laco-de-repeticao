/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Jess
 */
public class Tabuada {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
       int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para ver sua tabuada:"));
        StringBuilder resultado = new StringBuilder("Tabuada do " + numero + ":\n");
        for (int i = 1; i <= 10; i++) {
            resultado.append(numero).append(" x ").append(i).append(" = ").append(numero * i).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}


