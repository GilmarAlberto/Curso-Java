/*
 18. Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

 */

package Desafios;

import java.util.Scanner;

public class Desafio019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo para download (em MB): ");
        double tamanho = scan.nextDouble();

        System.out.println("Digite a velocidade da Internet em Mbps: ");
        double velocidade = scan.nextDouble();

        double tempo = tamanho/velocidade;

        System.out.println("O tempo estimado para download é de: " + tempo);

        scan.close();
        
    }
    
}
