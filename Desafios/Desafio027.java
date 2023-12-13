/*
26. Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

*/

package Desafios;

import java.util.Scanner;

public class Desafio027 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o preço do Produto 1?");
        double prod1 = scan.nextDouble();

        System.out.println("Qual o preço do Produto 2?");
        double prod2 = scan.nextDouble();

        System.out.println("Qual o preço do Produto 3?");
        double prod3 = scan.nextDouble();

        double menor   = prod1;
        String prod = "Produto 1";
        
        if(prod2 < menor){
            menor = prod2;
            prod = "Produto 2";
        }

        if(prod3 < menor){
            menor = prod3;
            prod = "Produto 3";
        }

        System.out.printf("O produto mais barato é o %s com o valor R$ %.2f", prod, menor);
        
        scan.close();
    }
    
}
