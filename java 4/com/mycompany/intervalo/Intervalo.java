/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.intervalo;
import java.util.Scanner;

/**
 *
 * @author Jess
 */
public class Intervalo {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor inicial: ");
        int inicio = scanner.nextInt();
        System.out.print("Informe o valor final: ");
        int fim = scanner.nextInt();
        int soma = 0;

        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos números pares do intervalo é igual a: " + soma);
    }
}
