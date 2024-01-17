/*
40.Faça um Programa que peça um número e informe se o número é inteiro ou decimal. Dica: utilize uma função de arredondamento. 
*/

package Desafios;

import java.util.Scanner;

public class Desafio040{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float num;

        System.out.println("Digite um número: ");
        num = scan.nextFloat();

        if(num == (int)num){
            System.out.println("O número é inteiro!");
        }else{
            System.out.println("O número é decimal!");
        }


        scan.close();
    }
}
