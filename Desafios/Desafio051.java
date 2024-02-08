/*
 Faça um programa que leia 5 números e informe o maior número.
*/

package Desafios;

import java.util.Random;

public class Desafio051{
    public static void main(String[] args){
    
        Random rand = new Random();

        int maior = Integer.MIN_VALUE;

        for(int i = 0; i < 5; i++){
            int num = rand.nextInt(101);

            if(num > maior){
                maior = num;
            }

            System.out.printf("%3d\n", num);
        }

        System.out.printf("O maior número é %3d\n", maior);
    }
}
