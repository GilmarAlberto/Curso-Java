/*
 * 7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
 */

package Desafios;

import java.util.Scanner;

public class Desafio008 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o lado de um quadrado: ");
        int lado = scan.nextInt();

        int area = lado * lado;

        System.out.println(String.format("A área do quadrado é %d e o dobro da área é %d", area, area*2));
        
        scan.close();
    }
    
}
