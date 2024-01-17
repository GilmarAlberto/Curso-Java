/*
 38.Faça um Programa para um caixa eletrônico. O programa deverá
perguntar ao usuário a valor do saque e depois informar quantas notas de cada valor serão fomecidas. As notas disponíiveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com a quantidade de notas existentes na máquina.
Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.

 */

package Desafios;

import java.util.Scanner;

public class Desafio038{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int valor, aux, cem, cinquenta, dez, cinco, um;

        do {
            System.out.println("Digite o valor do saque (Entre R$ 10,00 e R$ 600,00) ");
            valor = scan.nextInt();

            if(valor < 10 || valor > 600){
                System.out.println("O valor deve ser entre R$ 10,00 e R$ 600,00!");
            }
          
        } while (valor < 10 || valor > 600);

        cem       = valor / 100;
        aux       = valor - (cem * 100);
        cinquenta = aux / 50;
        aux      -= (cinquenta * 50);
        dez       = aux / 10;
        aux      -= (dez * 10);
        cinco     = (aux / 5);
        um        = aux - (cinco * 5);

        if(cem != 0){
            System.out.println("Notas de cem      : " + cem);
        }
        if(cinquenta != 0){
            System.out.println("Notas de cinquenta: " + cinquenta);
        }
        if(dez != 0){
            System.out.println("Notas de dez      : " + dez);
        }
        if(cinco != 0){
            System.out.println("Notqs de cinco    : " + cinco);
        }
        if(um != 0){
            System.out.println("Notas de um       : " + um);
        }

        scan.close();
    }

    
}
