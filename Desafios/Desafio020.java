/*
19. Faça um Programa que peça dois numeros e imprima o maior deles. 
*/

package Desafios;

import java.util.Scanner;


public class Desafio020 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scan.nextInt();

        System.out.println("O maior número é "+ (num1 > num2 ? num1 : num2));

        scan.close();
        
    }
    
}
