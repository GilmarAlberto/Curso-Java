/*
13. Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
a. Para homens: (72.7*h) - 58
b. Para mulheres: (62.1*h) - 44.7
*/

package Desafios;

import java.util.Scanner;

public class Desafio011{
    public static void main(String[] args){

        double ideal = 0;
        String sexo;
        double altura;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.println("Digite o sexo (M/F): ");
            sexo = scan.nextLine().toUpperCase();

            if (!(sexo.equals("M") || sexo.equals("F"))) {
                
                System.out.println("Por favor, insira apenas 'M' ou 'F'.");
            }

        } while (!(sexo.equals("M") || sexo.equals("F")));

        System.out.println("Digite a altura:");
        altura = scan.nextDouble();

        if(sexo.equals("M")){
            ideal = (72.7*altura) - 58;
        }
        else{
            ideal = (62.1*altura) - 44.7;
        }

        System.out.println(String.format("O peso ideal é %.2f", ideal));  

        scan.close();
        
    }
}

