/*
 Faça um programa que imprima na tela os números de 1 a 20, um
abaixo do outro. Depois modifique o programa para que ele mostre os
números um ao lado do outro.
*/

package Desafios;

public class Desafio050{
    public static void main(String[] args){

        System.out.println("***Um abaixo do outro***");
        for(int i = 1; i <= 20; i++){
            System.out.printf("%2d\n", i);
        }

        System.out.println("***Um ao lado do outro***");
        for(int i = 1; i <= 20; i++){
            System.out.printf("%3d", i);
        }
    }
}
