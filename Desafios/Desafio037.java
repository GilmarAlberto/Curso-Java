/*
37.Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
— Observando os termos no plural a colocação do "e", da vírgula
entre outros. Exemplo:
- 326=3 centenas, 2 dezenas e 6 unidades
- 12=1 dezena e 2 unidades Testar com: 326, 300, 100, 320,
310,305, 301, 101, 311,111,25,20,10,21,11,1,7e16
 */

package Desafios;

public class Desafio037{
    public static void main(String[] args){
        int[] vetor = new int[] { 326, 12, 300, 100, 320, 310, 305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7, 16, 875, 765, 654, 543, 432, 321, 210, 101, 99, 87, 75, 67, 54, 43, 32, 21, 13};
        int  centena, dezena, unidade, i;

        for(i = 0; i < vetor.length; i++){

            centena =  vetor[i] / 100;
            dezena  = (vetor[i] % 100) / 10;
            unidade = (vetor[i] % 100) % 10;

            if(centena != 0){

                System.out.printf("%d centena",centena);

                if(centena>1){
                    System.out.printf("s");
                }

                if(dezena !=0 && unidade!= 0){
                    System.out.printf(", ");
                }else if(dezena !=0 || unidade != 0){
                    System.out.printf(" e ");
                }
    
            }

            if(dezena != 0){

                System.out.printf("%d dezena", dezena);

                if(dezena > 1){
                    System.out.printf("s");
                }
            }

            if(unidade != 0){
                if(dezena != 0){
                    System.out.printf(" e ");
                }

                System.out.printf("%d unidade", unidade);

                if(unidade > 1){
                    System.out.printf("s");
                }

            }

            System.out.printf("\n");
        }
    }
}
