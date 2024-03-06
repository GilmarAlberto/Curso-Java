/*
 Altere o programa de cálculo dos números primos, informando, caso o
número não seja primo, por quais número ele é divisível
*/

package Desafios;

import java.util.Scanner;

public class Desafio067{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = scan.nextInt();

        if(num < 2){
            System.out.println("Não é primo!");
            scan.close();
            return;
        }

        boolean primo = true;

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                primo = false;
                System.out.printf("%4d ", i);
            }
        }

        if(primo){
            System.out.println("É primo!");
        }else{
            System.out.println("\nNão é primo!");
        }

        scan.close();
    }
}
