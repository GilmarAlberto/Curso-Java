/*
 Altere o programa anterior para mostrar no final a soma dos números
*/

package Desafios;

import java.util.Scanner;

public class Desafio055{
    public static void main(String[] args){
        int num1, num2, soma = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo número ");
        num2 = scan.nextInt();

        if(num2 > num1){
            for(int i = num1; i <= num2; i++){
                System.out.printf("%5d", i);
                soma += i;
            }
        }
        else{
            for(int i = num2; i <= num1; i++){
                System.out.printf("%5d", i);
                soma += i;
            }
        }

        System.out.printf("\nSoma: %d", soma);
        scan.close();
    }
}
