/*
 41.Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
a. positivo ou negativo;
b. inteiro ou decimal.
c. par ou impar.
*/

package Desafios;

import java.util.Scanner;
import java.lang.String;

public class Desafio041{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float num1 = 0, num2 = 0, res = 0;
        char oper;

        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextFloat();

        System.out.println("Digite o segundo número: ");
        num2 = scan.nextFloat();

        do {
            System.out.println("Escolha a Operação: (+, -, *, /)");
            oper = scan.next().charAt(0);
            
            if(oper == '+' || oper == '-' || oper == '*' || oper == '/' ){
                break;
            }

            System.out.println("Digite a operação correta!");

        } while (true);

        switch (oper) {
            case '+':

                res = num1 + num2;
                break;

            case '-':

                res = num1 - num2;
                break;

            case '*':

                res = num1 * num2;
                break;

            case '/':
                if(num2 != 0){
                    res = num1 / num2;
                }
                break;
        
            default:

                System.out.println("Operador Incorreto!");
                break;
        }

        if(res == 0){
            System.out.println("É zero!");
        }else{

            if(res == (int)res){
                System.out.printf("O número %.2f é inteiro!\n", res);

                if(res % 2 == 0){
                    System.out.printf("O número %.2f é par!\n", res);
                }else{
                    System.out.printf("O número %.2f é impar!\n", res);
                }
            }else{
                System.out.printf("O número %.2f é decimal!\n", res);
            }

            if(res > 0){
                System.out.printf("O número %.2f é positivo\n", res);
            }else{
                System.out.printf("O número %.2f é negativo!\n", res);
            }
        }

        scan.close();
    }
}
