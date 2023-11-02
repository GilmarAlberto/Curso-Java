package Desafios;

import java.util.Scanner;

public class Desafio003 {
    public static void main(String[] args) {
        /*
         * Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        scan.nextLine();
        
        System.out.println("O número informado foi " + num);

        scan.close();
    }
    
}
