/*
 * 8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
 */

package Desafios;

import java.util.Scanner;

public class Desafio009 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora em R$?");
        double salario = scan.nextDouble();

        System.out.println("Quantas horas você trabalhou no mês?");
        double horas = scan.nextDouble();

        System.out.println(String.format("Você ganhou no mês R$ %.2f", salario * horas));       
        scan.close();

    }
}
