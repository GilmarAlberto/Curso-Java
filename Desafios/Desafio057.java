/*
 .Faça um programa que peça dois números, base e expoente, calcule e
mostre o primeiro número elevado ao segundo número. Não utilize a
função de potência da linguagem.
*/

package Desafios;

import java.util.Scanner;

public class Desafio057{
    public static void main(String[] args){
        int base, expo, total = 1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a base: ");
        base = scan.nextInt();

        System.out.println("Digite o expoente: ");
        expo = scan.nextInt();

        if(expo == 0){
            total = 1;
        }else{
            for(int i = 1; i <= expo; i++){
                total *= base;
            }
        }

        System.out.printf("%d ** %d = %d", base, expo, total);

        scan.close();
    }
}
