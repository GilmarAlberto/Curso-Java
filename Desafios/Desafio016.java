/*
15. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
a. salário bruto.
b. quanto pagou ao INSS.
c. quanto pagou ao sindicato.
d. o salário líquido.
e. calcule os descontos e o salário líquido, conforme a tabela abaixo:

+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$

Obs.: Salário Bruto - Descontos = Salário Líquido.
 */

package Desafios;

import java.util.Scanner;

public class Desafio016 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double ganhoPorHora = 0.0, horasTrab = 0.0, bruto = 0.0, ir = 0.0, inss = 0.0, sind = 0.0, liquido = 0.0;

        System.out.println("Quanto você ganha por hora?");
        ganhoPorHora = scan.nextDouble();

        System.out.println("Quantas horas trabalhou no mês?");
        horasTrab = scan.nextDouble();

        scan.close();

        bruto = ganhoPorHora * horasTrab;
        ir = bruto * 0.11;
        inss = bruto * 0.08;
        sind = bruto * 0.05;
        liquido = bruto - ir - inss - sind;

        System.out.println(String.format("O salário bruto é de R$ %.2f", bruto));
        System.out.println(String.format("O imposto de renda é de R$ %.2f",ir));
        System.out.println(String.format("O INSS é de R$ %.2f", inss));
        System.out.println(String.format("O valor pago ao sindicado é de R$ %.2f", sind));
        System.out.println(String.format("O salário líquido é de R$ %.2f", liquido));

    }
    
}
