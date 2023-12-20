/*
 29.As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual: salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.
*/

package Desafios;

import java.util.Scanner;

public class Desafio030{
    public static void main(String[] args){
        double salario, pctReajuste, vlrReajuste, novoSalario;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o salário do funcionário: ");
        salario = scan.nextDouble();

        if(salario <= 280){
            pctReajuste = 20;
        }
        else if(salario <= 700){
            pctReajuste = 15;
        }
        else if(salario <= 1500){
            pctReajuste = 10;
        }
        else{
            pctReajuste = 5;
        }
        vlrReajuste = salario * (pctReajuste / 100);
        novoSalario = salario + vlrReajuste;

        System.out.println("Salário Anterior: " + salario);
        System.out.println("Pct Reajuste    : " + pctReajuste);
        System.out.println("Vlr Reajuste    : " + vlrReajuste);
        System.out.println("Novo Salário    : " + novoSalario);

        scan.close();
    }
}