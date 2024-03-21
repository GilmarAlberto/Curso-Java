/*
 Faça um programa que calcule o mostre a média aritmética de N
notas.
*/

package Desafios;

import java.util.Random;

public class Desafio069{
    public static void main(String[] args){  
        Random rand  = new Random();
        int    num   = rand.nextInt(101);
        int    soma  = 0, nota = 0;
        double media = 0.0;

        System.out.println("Número de notas: " + num);

        for(int i = 1; i <= num; i++){
            nota = rand.nextInt(101);
            System.out.printf("%4d", nota);
            soma += nota;
        }
        System.out.println("\nSoma: " + soma);

        media = (double) soma / num;

        System.out.printf("Media: %.2f ", media);

    }
}