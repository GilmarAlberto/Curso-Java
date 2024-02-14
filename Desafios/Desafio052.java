/*
 Faça um programa que leia 5 números e informe a soma e a média
dos números.
*/

package Desafios;

import java.util.Random;

public class Desafio052{
    
    
    public static void main(String[] args){
        int   soma  = 0;
        float media = 0;

        Random rand = new Random();

        for(int i = 0; i < 5; i++){
            int num = rand.nextInt(101);

            soma += num;

            System.out.printf("%3d\n", num);
        }

        media = (float)soma / 5;

        System.out.printf("A soma dos números é: %3d\n", soma);
        System.out.printf("A média é: %.2f\n", media);

        
    }
}
