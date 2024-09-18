/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordem;

import java.util.Scanner;
/**
 *
 * @author Jess
 */
public class Ordem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o valor inicial: ");
        int inicio = scanner.nextInt();
        
        System.out.print("Informe o valor final: ");
        int fim = scanner.nextInt();

        for (int i = fim; i >= inicio; i--) {
            if (i % 2 == 0) {
                
                System.out.println(i);
            }
        }
    }
}
