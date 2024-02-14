/*
 Faça um programa que receba dois números inteiros e gere os
números inteiros que estão no intervalo compreendido por eles.
*/

package Desafios;

import java.util.Scanner;

public class Desafio054{
    public static void main(String[] args){
        int num1, num2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo número ");
        num2 = scan.nextInt();

        if(num2 > num1){
            for(int i = num1; i <= num2; i++){
                System.out.printf("%5d", i);
            }
        }
        else{
            for(int i = num2; i <= num1; i++){
                System.out.printf("%5d", i);
            }
        }

        scan.close();
    }
}
