/*
32.Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
o Média de Aproveitamento Conceito Entre 9.0 e 10.0 A
Entre 7.5 e 9.0 B
Entre 6.0 é 7.5 c
Entre 4.0 e 6.0 D
Entre 4.0 e zero E
O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
 */
package Desafios;

import java.util.Scanner;

public class Desafio033{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double  nota1, nota2, media;
        char    conceito;
        String  msg;

        System.out.println("Digite a primeira nota: ");
        nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = scan.nextDouble();

        media = (nota1 + nota2) / 2.0;

        if(media >= 9.0){
            conceito = 'A';
        }else if(media >= 7.5){
            conceito = 'B';
        }else if(media >= 6.0){
            conceito = 'C';
        }else if(media >= 4.0){
            conceito = 'D';
        }else{
            conceito = 'E';
        }

        switch (conceito) {
            case 'A':
            case 'B':
            case 'C':
                msg = "APROVADO";
                break;
            default:
                msg = "REPROVADO";   
                break;
        }

        System.out.println(String.format("A média é %.2f", media));
        System.out.println(String.format("O Conceito é %c", conceito));
        System.out.println(msg);

        scan.close();
    }
}
