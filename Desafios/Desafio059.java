/*
A série de Fibonacci é formada pela seqüência
1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série
até o n−ésimo termo
*/

package Desafios;

import java.util.Scanner;

public class Desafio059{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de termos: ");
        int num = scan.nextInt();

        if(num <= 0){
            System.out.println("Nenhum termo para mostrar.");
        }else if(num == 1){
            System.out.println("0");
        }else if(num == 2){;
            System.out.println("0 1");
        }else{
            int ant = 0, atu = 1;
            System.out.printf("%d %d ", 0, 1);
            for(int i = 3; i <= num; i++ ){
                int fib = ant + atu;
                System.out.printf("%d ", fib);
                ant = atu;
                atu = fib;
            }
        }

        scan.close();
    }
}
