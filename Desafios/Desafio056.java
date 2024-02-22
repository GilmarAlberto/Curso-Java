/*
 Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
numero ele deseja ver a tabuada. A saída deve ser conforme o
exemplo abaixo:
Tabuada de 5:
o 5 X 1 = 5
o 5 X 2 = 10
o ...
o 5 X 10 = 50
*/

package Desafios;

import java.util.Scanner;

public class Desafio056{
    public static void main(String[] args){
        int num;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Digite o número entre 1 e 10 que deseja a tabuada: ");
            num = scan.nextInt();

            if(num >= 1 && num <= 10){
                break;
            }
            
        } while (true);

        System.out.printf("Tabuada de %d:\n", num);
        for(int i = 1; i <= 10; i++){
            System.out.printf("%2d X %2d = %3d\n", num, i, num * i);
        }
        scan.close();
    }
}
