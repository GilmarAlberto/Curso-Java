/*
 43. Um está vendendo combustíveis com a seguinte tabela de descontos:

. Álcool:
a. até 20 litros, desconto de 3% por litro
b. acima de 20 litros, desconto de 5% por litro 

Gasolina:
c. até 20 litros, desconto de 4% por litro
d. acima de 20 litros, desconto de 6% por.

Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G- gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.

*/

package Desafios;

import java.util.Scanner;

public class Desafio043{
    public static void main(String[] args){
        char tipo;
        double litros = 0, valorPago = 0, desconto = 0, precoLitro = 0;

        Scanner scan = new Scanner(System.in);

        do{

            System.out.println("Tipo do Combustível (A-Álcool, G-Gasolina):");
            tipo = scan.next().toUpperCase().charAt(0);

            if(tipo == 'A' || tipo == 'G'){
                break;
            }

        }while(true);

        System.out.println("Quantidade de litros vendidos: ");
        litros = scan.nextFloat();

        if(tipo == 'A'){
            desconto   = (litros < 20 ? 0.97 : 0.95);
            precoLitro = 1.90;
            

        }else{
            desconto   = (litros < 20 ? 0.96 : 0.94);
            precoLitro = 2.50;
        }

        valorPago = (litros * precoLitro) * desconto;
        
        System.out.println("Valor a ser pago: R$ " + valorPago);
        
        scan.close();
    }
}
