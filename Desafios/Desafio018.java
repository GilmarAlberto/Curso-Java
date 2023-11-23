/*
17. Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
comprar apenas latas de 18 litros;
comprar apenas galões de 3,6 litros;
misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

 */

package Desafios;

import java.util.Scanner;

public class Desafio018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho da área em metros quadrados: ");
        double area = scan.nextDouble();

        //Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados

        double qtdTinta = area/6.0;

        //comprar apenas latas de 18 litros;

        int qtdLatas18 = (int)Math.ceil(qtdTinta/18.00);

        //total pago com o valor da lata de 18 litros = R$ 80,00
        double totalPago = qtdLatas18 * 80.00;

        System.out.println("Quantidade de latas de 18 litros: " + qtdLatas18);
        System.out.println("Valor a ser pago R$ " + totalPago);

        //comprar apenas latas de 3,6 litros
        int qtdGalao = (int)Math.ceil(qtdTinta/3.60);

        //total pago com o valor do galão de 3,6 litros = R$ 25,00
        totalPago = qtdGalao * 25.00;

        System.out.println("Quantidade de Galões: " + qtdGalao);
        System.out.println("Valor a ser pago R$ " + totalPago);

        //misturar latas com galões
    
        //1) adicionar 10%
        qtdTinta *= 1.10;

        //2) calcula latas de 18 litros
        qtdLatas18 = (int)Math.floor(qtdTinta/18.00);

        //total pago em lata de 18L
        double totalPagoL = qtdLatas18 * 80.00;

        //3) calcula galões de 3,6 litros
        qtdGalao = (int)Math.ceil((qtdTinta - (qtdLatas18*18.00))/3.6);

        //total pago em galões de 3,6 litros
        double totalPagoG = qtdGalao * 3.6;

        //total Geral
        totalPago = totalPagoL + totalPagoG;
        

        System.out.println("Quantidade de Latas: " + qtdLatas18);
        System.out.println("Total pago nas Latas: " + totalPagoL);
        System.out.println("Quantidade de Galões: " + qtdGalao);
        System.out.println("Total pago nos Galões: " + totalPagoG);
        System.out.println("Total Pago no Geral: " + totalPago);

        scan.close();
    }

    
}
