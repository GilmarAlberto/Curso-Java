/*
Supondo  que  a  população  de  um  país  A  seja  da  ordem  de  80000 
habitantes  com  uma  taxa  anual  de  crescimento  de  3%  e  que  a 
população de B seja 200000 habitantes com uma taxa de crescimento 
de 1.5%. Faça um programa que calcule e escreva o número de anos 
necessários  para  que  a  população  do  país  A  ultrapasse  ou  iguale  a 
população do país B, mantidas as taxas de crescimento. 
*/

package Desafios;

public class Desafio048{
    public static void main(String[] args){
        int    populacaoA   = 80000;
        int    populacaoB   = 200000;
        double crescimentoA = 1.03;
        double crescimentoB = 1.015;
        int    anos         = 0;

        while(populacaoA <= populacaoB){
            populacaoA *= crescimentoA;
            populacaoB *= crescimentoB;
            anos++;
        }

        System.out.printf("Levará %d anos para que a população do país A ultrapasse a população do país B.", anos);

    }
}
