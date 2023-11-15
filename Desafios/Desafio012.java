/*
14. João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
 */


package Desafios;

import java.util.Scanner;

public class Desafio012 {
    public static void main(String[] args) {
        double peso = 0.0;
        double excesso = 0.0;
        double multa = 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o peso total dos peixes: ");
        peso = scan.nextDouble();

        if(peso <= 50){
            System.out.println("O peso está dentro do limite autorizado.");
        }
        else{
            excesso = peso - 50;
            multa = excesso * 4;

            System.out.println(String.format("O peso total dos peixes foi %.2f kg.", peso));
            System.out.println(String.format("O peso excedente foi %.2f e a multa foi de R$ %.2f.", excesso, multa));

        }

        scan.close();
        
    }
    
}
