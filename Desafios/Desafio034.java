/*
 33.Faça um Programa que peça os 3 lados de um triângulo. Oprograma
deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
 - Dicas:
   - Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
   - Triângulo Equilátero: três lados iguais;
   - TriânguloIsósceles: quaisquer dois lados iguais;
   - Triângulo Escaleno: três lados diferentes;

 */

package Desafios;

import java.util.Scanner;

public class Desafio034 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int ladoA, ladoB, ladoC;

        System.out.println("Digite o lado A: ");
        ladoA = scan.nextInt();
        System.out.println("Digite o lado B: ");
        ladoB = scan.nextInt();
        System.out.println("Digite o lado C: ");
        ladoC = scan.nextInt();

        if(ladoA+ladoB > ladoC &&
           ladoA+ladoC > ladoB &&
           ladoB+ladoC > ladoA){

            if(ladoA == ladoB && ladoA == ladoC){
                System.out.println("É um Triângulo Equilátero");
            }else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
                System.out.println("É um Triângulo Isósceles");
            }else{
                System.out.println("É um Triângulo Escaleno");
            }

        }else{
            System.out.println("Não é um triângulo!");
        }
        
        scan.close();
    }
    
}
