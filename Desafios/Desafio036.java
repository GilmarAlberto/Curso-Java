/*
36.Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.

 */

package Desafios;

import java.util.Scanner;

public class Desafio036{
    public static void main(String[] args){
        int dia, mes, ano;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        dia = scan.nextInt();

        System.out.println("Digite o mês: ");
        mes = scan.nextInt();

        System.out.println("Digitre o ano:");
        ano = scan.nextInt();

        if((( dia > 0 && dia <= 31 && ano > 0) && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 )) || 
           (( dia > 0 && dia <= 30 && ano > 0) && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) ||
           (( dia > 0 && dia <= 29 && ano > 0) && (mes == 2 && (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0))) ||
           ((dia > 0 && dia <= 28 && ano > 0) && mes == 2)){

            System.out.println("Data Válida!");

        }else{
            System.out.println("Data Inválida!");
        }

        scan.close();
    }
}
