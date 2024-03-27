/*
 Faça um programa que peça para n pessoas a sua idade, ao final o
programa devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada
*/

package Desafios;

import java.util.Random;

public class Desafio070{


    public static void main(String[] args){
        Random rand  = new Random();
        int qtdPess = rand.nextInt(100) + 1;
        int soma = 0, num = 0;
        double media;

        System.out.println("Quantidade de números: " + qtdPess);

        for(int i = 0; i < qtdPess; i++){

            num = rand.nextInt(101);

            System.out.printf("%d ", num);
            
            soma += num;

        }

        media = (double) soma/qtdPess;

        System.out.printf("\nSoma: %d\n", soma);
        System.out.printf("Média: %.2f\n", media);

        if(media < 26){
            System.out.println("Turma Jovem");
        }
        else if(media < 60){
            System.out.println("Turma Adulta");
        }
        else{
            System.out.println("Turma Idosa");
        }

    }
}