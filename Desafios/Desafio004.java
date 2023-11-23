package Desafios;

/*
* 3. Faça um Programa que peça dois números e imprima a soma.
*/

import java.util.Scanner;

public class Desafio004 {

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scan.nextInt();

        System.out.println(String.format("A soma de %d + %d é igual a %d", num1, num2, num1+num2));

        scan.close();
        
    }    
    
}
