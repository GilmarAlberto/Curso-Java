/*
 39. um Programa que peça um número inteiro e determine se ele é
par ou impar. Dica: utilize o operador módulo (resto da divisão).

 */

package Desafios;

import java.util.Scanner;

public class Desafio039{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        if(num == 0){
            System.out.println("O número é zero!");
        }else if(num % 2 == 0){
            System.out.println("O número é par!");
        }else{
            System.out.println("O número é impar!");
        }

        scan.close();
    }
}
