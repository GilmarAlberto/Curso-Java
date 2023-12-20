/*
 30. Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
 Salário Bruto: (5 * 220)  : R$ 1100,00
 (-) IR (5%)               : R$   55,00
 (-) INSS  (10%)           : R$  110,00
 FGTS (11%)                : R$  121,00
 Total de descontos        : R$  165,00
 Salário Liquido           : R$  935,00

 */

package Desafios;

import java.util.Scanner;

public class Desafio031{
    public static void main(String[] args){
        double vlrHora, totalHoras, bruto, desconto, liquido, pctIr, vlrIr, fgts, inss;
        Scanner scan = new Scanner(System.in);

        System.out.println(": Valor Hora ");
        vlrHora = scan.nextDouble();

        System.out.println("Horas Trabalhadas: ");
        totalHoras = scan.nextDouble();
        
        bruto = vlrHora * totalHoras;

        if(bruto <= 900){
            pctIr = 0;
        }
        else if(bruto <= 1500){
            pctIr = 5;
        }
        else if(bruto <= 2500){
            pctIr = 10;
        }
        else{
            pctIr = 20;
        }

        vlrIr     = bruto * (pctIr/100);
        inss      = bruto * 0.1;
        fgts      = bruto * 0.11;
        desconto  = vlrIr + inss;
        liquido   = bruto - desconto;

        System.out.println(String.format("Salário Bruto (%.2f * %.2f ): R$ %.2f", vlrHora, totalHoras, bruto));
        System.out.println(String.format("IR (%.2f%%)                   : R$ %.2f", pctIr, vlrIr));
        System.out.println(String.format("INSS (10%%)                   : R$ %.2f", inss));
        System.out.println(String.format("FGTS (11%%)                   : R$ %.2f", fgts));
        System.out.println(String.format("Total de Descontos           : R$ %.2f", desconto));
        System.out.println(String.format("Salário Líquido              : R$ %.2f", liquido));

        scan.close();
    }
}