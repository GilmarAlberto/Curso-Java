/*
A série de Fibonacci é formada pela seqüência
0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até
que o valor seja maior que 500.
*/

package Desafios;

public class Desafio060{
    public static void main(String[] args){

        int ant = 0, atu = 1;
        System.out.printf("%d %d ", 0, 1);

        while(true){
            int fib = ant + atu;
            if(fib > 500){
                break;
            }
            System.out.printf("%d ", fib);
            ant = atu;
            atu = fib;
        }
    }
}
