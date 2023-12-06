/*
 23. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
- A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
- A mensagem "Reprovado", se amédia for menor do que sete;
- A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */

package Desafios;

import java.util.Scanner;

public class Desafio024 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String msg;

        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2.0;

        if(media == 10)
            msg = "Aprovado com distinção";
        else if (media >= 7)
            msg = "Aprovado";
        else
            msg = "Reprovado";

        System.out.println(String.format("Com a média de %.2f você está %s", media, msg ));

        scan.close();
        
    }
    
}
