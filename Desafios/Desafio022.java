/*
 21. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F -Feminino, M- Masculino, Sexo Inválido.
 */

package Desafios;

import java.util.Scanner;

public class Desafio022 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Sexo M/F: ");

        String letra = scan.next();

        letra = letra.toUpperCase();

        if(letra.equals("M")){
            System.out.println("Sexo Masculino");
        }
        else if(letra.equals("F")){
            System.out.println("Sexo Feminino");
        }
        else{
            System.out.println("Sexo inválido");
        }

        scan.close();
    }
    
}
