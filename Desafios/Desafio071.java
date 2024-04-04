/*
 Numa eleição existem três candidatos. Faça um programa que peça o
número total de eleitores. Peça para cada eleitor votar e ao final
mostrar o número de votos de cada candidato
*/

package Desafios;

import java.util.Random;

public class Desafio071{
    public static void main(String[] args){
        Random rand  = new Random();
        int num = 0, qtdEleitores = 0, candidato1 = 0, candidato2 = 0, candidato3 = 0;

        qtdEleitores = rand.nextInt(1001) + 1;

        System.out.printf("Total de Eleitores: %d\n", qtdEleitores);

        for(int i = 1; i <= qtdEleitores; i++){
            num = rand.nextInt(3) + 1;

            if(num == 1){
                candidato1++;
            }
            else if(num == 2){
                candidato2++;
            }
            else{
                candidato3++;
            }

        }

        System.out.printf("Candidato 1: %d\n", candidato1);
        System.out.printf("Candidato 2: %d\n", candidato2);
        System.out.printf("Candidato 3: %d\n", candidato3);

    }
}
