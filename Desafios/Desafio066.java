/*
 Faça um programa que peça um número inteiro e determine se ele é
ou não um número primo. Um número primo é aquele que é divisível
somente por ele mesmo e por 1.
*/

package Desafios;

import java.util.Scanner;

public class Desafio066{
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

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                primo = false;
                break;
            }
        }

        if(primo){
            System.out.println("É primo!");
        }else{
            System.out.println("Não é primo!");
        }
        scan.close();
    }
}
