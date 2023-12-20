/*
 31.Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.

 */

package Desafios;

import java.util.Scanner;

public class Desafio032{
    public static void main(String[] args){
        String diaString;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia da semana");
        int dia = scan.nextInt();

        switch(dia){
            case 1: {
                diaString = "Domingo";
                break;
            }
            case 2: {
                diaString = "Segunda-feira";
                break;
            }
            case 3: {
                diaString = "Terça-feira";
                break;
            }
            case 4: {
                diaString = "Quarta-feira";
                break;
            }
            case 5: {
                diaString = "Quinta-feira";
                break;
            }
            case 6: {
                diaString = "Sexta-feira";
                break;
            }
            case 7: {
                diaString = "Sábado";
                break;
            }
            default:
                diaString = "Opção Inválida";
                break;
        }

        System.out.println(diaString);
        
        scan.close();
    }
}