/*
 Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
*/

package Desafios;

import java.util.Scanner;

public class Desafio062{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num, fat = 1;

        System.out.println("Digite um número inteiro:");
        num = scan.nextInt();

        if(num < 0){
            System.out.println("Não existe fatorial!");
            scan.close();
            return;
        }else if(num <= 1){
            fat = 1;
        }else{
            for(int i = num; i > 1; i--){
                fat *= i;
            }
        }

        System.out.printf("O fatorial de %d é %d", num, fat);

        scan.close();
    }
}
