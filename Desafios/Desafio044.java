/*
 44. Uma fruteira está vendendo frutas com a seguinte tabela de preços:
          Até 5 Kg             Acima de 5 Kg 
Morango  R$ 2,50 por Kg       R$ 2,20 por Kg 
Maçã     R$ 1,80 por Kg       R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

*/

package Desafios;

import java.util.Scanner;

public class Desafio044{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double kgMaca, kgMorango, kgTotal, totalMaca, totalMorango, vlrTotal;

        System.out.println("Quantos Kg de maçã: ");
        kgMaca = scan.nextDouble();

        System.out.println("Quantos kg de morango: ");
        kgMorango = scan.nextDouble();

        kgTotal      = kgMaca + kgMorango;
        totalMaca    = kgMaca * (kgMaca < 5 ? 2.50 : 2.20);
        totalMorango = kgMorango * (kgMorango < 5 ? 1.80 : 1.50);
        vlrTotal     = totalMaca + totalMorango;

        if(kgTotal > 8 || vlrTotal > 25){
            System.out.println("Aplicado mais 10% de desconto!");
            vlrTotal *= 0.90;
        }

        System.out.printf("Valor total: R$ %.2f ", vlrTotal);

        scan.close();
    }
}
