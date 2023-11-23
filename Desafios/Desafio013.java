/*
12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
*/

package Desafios;

import java.util.Scanner;

public class Desafio013{
    public static void main(String[] args){

        double ideal = 0;
        double altura;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a altura:");
        altura = scan.nextDouble();

        ideal = (72.7*altura) - 58;
        
        System.out.println(String.format("O peso ideal é %.2f", ideal));  

        scan.close();
        
    }
}

