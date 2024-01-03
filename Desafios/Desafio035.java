/*
 35.Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.
1. Se o ano for divisível por 4, vá para a etapa 2. Caso contrário, vá para a etapa 5.
2. Se o ano for divisível por 100, vá para a etapa 3. Caso contrário, vá para a etapa 4.
3. Se o ano for divisível por 400, vá para a etapa 4. Caso contrário, vá para a etapa 5.
4. O ano é bissexto (tem 366 dias).
5. ano não é bissexto (tem 365 dias).

 */

package Desafios;

import java.util.Scanner;

public class Desafio035{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int ano;

        System.out.println("Digite o ano: ");
        ano = scan.nextInt();

        if(ano%4 == 0 && ano%100 != 0 || ano%400 == 0){
            System.out.println(String.format("O ano %d é bissexto!", ano));
        }else{
            System.out.println(String.format("O ano %d não é bissexto!", ano));
        }
        
        scan.close();
    }
}
