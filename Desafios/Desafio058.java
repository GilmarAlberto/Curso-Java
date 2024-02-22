/*
 Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números impares
*/

package Desafios;

import java.util.Random;

public class Desafio058{
    public static void main(String[] args){
        Random rand = new Random();
        int num, par = 0, impar = 0;

        for(int i = 1; i <= 10; i++){
            num = rand.nextInt(101);

            System.out.printf("%3d ", num);

            if(num % 2 == 0){
                par += 1;
            }else{
                impar += 1;
            }
        }

        System.out.printf("\nPares: %d\n", par);
        System.out.printf("Impares: %d\n", impar);
  
    }
}
