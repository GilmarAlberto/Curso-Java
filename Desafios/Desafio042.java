/*
 42.Faça um programa que faça 5 perguntas para uma pessoa sobre um
crime. As perguntas são:
Telefonou para a vítima?
Esteve no local do crime?”
Mora perto da vítima?
Devia para a vítima?
Já trabalhou com a vítima?
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente
a 2 questões ela deve ser classificada como "Suspeita",
entre 3 e 4 como "Cúmplice" 
e 5 como "Assassino". 
Caso contrário, ele será classificado como "Inocente",

*/

package Desafios;

import java.util.Scanner;

public class Desafio042{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char resposta;
        int contador = 0;

        System.out.println("Telefonou para a vítima?");
        resposta = scan.next().toUpperCase().charAt(0);
        contador += (resposta == 'S' ? 1 : 0);

        System.out.println("Esteve no local do crime?");
        resposta = scan.next().toUpperCase().charAt(0);
        contador += (resposta == 'S' ? 1 : 0);

        System.out.println("Mora perto da vítima?");
        resposta = scan.next().toUpperCase().charAt(0);
        contador += (resposta == 'S' ? 1 : 0);

        System.out.println("Devia para a vítima?");
        resposta = scan.next().toUpperCase().charAt(0);
        contador += (resposta == 'S' ? 1 : 0);

        System.out.println("Já trabalhou com a vítima?");
        resposta = scan.next().toUpperCase().charAt(0);
        contador += (resposta == 'S' ? 1 : 0);

        switch (contador) {
            case 2:
                System.out.println("Suspeito!");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice!");
                break;
            case 5:
                System.out.println("Assassino!");
                break;
            default:
                System.out.println("Inocente!");
                break;
        }

        scan.close();
    }
}
