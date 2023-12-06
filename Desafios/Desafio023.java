/*
 22. Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
 */

package Desafios;

import java.util.Scanner;

public class Desafio023 { 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letra = scan.next().toUpperCase().charAt(0);

        switch (letra) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':

                System.out.println("Vogal");
                break;
        
            default:
                System.out.println("Consoante");
                break;
        }        

        scan.close();
        
    }
    
}
