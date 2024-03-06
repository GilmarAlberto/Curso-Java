/*
 Escreva a função maior_primo que recebe um número inteiro maior ou igual a 2 como parâmetro e devolve o maior número primo menor ou igual ao número passado à função

*/

package Desafios;

import java.util.Scanner;

public class Desafio061{

    public static int maior_primo(int n){

        for(int i = n; i >= 2; i--){
            boolean primo = true;            

            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    primo = false;
                    break;
                }
            }

            if(primo == true){
                return(i);
            }

        }

        return -1;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("Digite um número maior ou igual a 2. ");
            num = scan.nextInt();
            
        } while (num < 2);

        System.out.printf("O maior número primo é: %d",  maior_primo(num));

        scan.close();
    }
}
