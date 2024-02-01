/*
 Altere o programa anterior permitindo ao usuário informar as 
populações  e  as  taxas  de  crescimento  iniciais.  Valide  a  entrada  e 
permita repetir a operação.
*/

package Desafios;

import java.util.Scanner;

public class Desafio049{
    public static void main(String[] args){
        int    populacaoA   = 0;
        int    populacaoB   = 0;
        double crescimentoA = 0;
        double crescimentoB = 0;
        
        

        Scanner scan = new Scanner(System.in);

        while(true){

            int anos = 0;

            System.out.println("População da Cidade A (0 para encerrar)");
            populacaoA = scan.nextInt();

            if(populacaoA <= 0){
                break;
            }

            System.out.println("Taxa de Crescimento da Cidade A (0 para encerrar)");
            crescimentoA = scan.nextDouble();

            if(crescimentoA <= 0){
                break;
            }

            System.out.println("População da Cidade B (0 para encerrar)");
            populacaoB = scan.nextInt();

            if(populacaoB <= 0){
                break;
            }

            if(populacaoA >= populacaoB){
                System.out.println("População da Cidade A tem que ser maior que a população da cidade B");
                continue;
            }

            System.out.println("Taxa de Crescimento da Cidade B (0 para encerrar)");
            crescimentoB = scan.nextDouble();

            if(crescimentoB <= 0){
                break;
            }

            if(crescimentoB >= crescimentoA){
                System.out.println("Taxa de Crescimento da Cidade A deve ser maior que a Taxa de Crescimento da cidade B ");

                continue;

            }


            while(populacaoA <= populacaoB){
                populacaoA *= crescimentoA;
                populacaoB *= crescimentoB;
                anos++;
            }
    
            System.out.printf("Levará %d anos para que a população do país A ultrapasse a população do país B.\n", anos);
    
        }

        System.out.println("Programa encerrado!\n");

        scan.close();
    }
}
