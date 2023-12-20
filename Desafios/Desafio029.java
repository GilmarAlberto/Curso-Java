/*
 28.Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!””. conforme o caso.
 */

package Desafios;

import java.util.Scanner;
import java.lang.String;

public class Desafio029 {
    public static void main(String[] args) {
        String msg;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o turno (M - Matutino / V - Vespertino / N - Noturno ): ");
        char letra = scan.next().toUpperCase().charAt(0);

        switch (letra) {
            case 'M':{
                msg = "Bom dia!";
                break;
            }
            case 'V':{
                msg = "Boa tarde!";
                break;
            }
            case 'N':{
                msg = "Boa noite!";
                break;
            }
            default:{
                msg = "Opção Incorreta!";
                break;
            }
        }
        
        System.out.println(msg);
        scan.close();
        
    }
    
}
