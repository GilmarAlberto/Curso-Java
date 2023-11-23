/*16. Faça um programa para uma loja de tintas. O programa deverá pedir o    tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
*/
package Desafios;

import java.util.Scanner;

public class Desafio017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho da área em metros quadrados: ");
        double area = scan.nextDouble();

        //a cobertura da tinta é de 1 litro para cada 3 metros quadrados
        double qtdTinta = area / 3.0;

        //a tinta é vendida em latas de 18 litros
        int qtdLatas = (int)Math.ceil(qtdTinta/18.00);

        //total pago
        double totalPago = qtdLatas * 80.00;

        System.out.println(String.format("Quantidade de latas: %d", qtdLatas));
        System.out.println("Valor a ser pago R$ " + totalPago);

        scan.close();
        
    }
   
}
