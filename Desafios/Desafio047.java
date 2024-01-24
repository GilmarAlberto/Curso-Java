/*
 Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';
*/

package Desafios;

import java.util.Scanner;

public class Desafio047{
    public static void main(String[] args){
        String nome, sexo, estadoCivil;
        int idade;
        float salario;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Nome: ");
            nome = scan.nextLine();

            if(nome.trim().length()<=3){

                System.out.println("Nome tem que ter mais de três caracteres!");
            }else{
                break;
            }
        } while (true);
        
        do {
            System.out.println("Idade: ");
            idade = scan.nextInt();

            if(idade < 0 || idade > 150){
                System.out.println("Idade tem que ser entre 0 e 150 anos!");
            }else{
                break;
            }
        } while (true);

        do {
            System.out.println("Salário: ");
            salario = scan.nextFloat();
            
            if(salario <= 0){
                System.out.println("Salário tem que ser maior que zero!");
            }else{
                break;
            }
        } while (true);

        do {
            System.out.println("Sexo [M/F]:");
            sexo = scan.next().toUpperCase();

            if(!sexo.equals("M") && !sexo.equals("F")){;
                System.out.println("Sexo incorreto!");
            }else{
                break;
            }            
        } while (true);

        do {
            System.out.println("Estado Civil [s/c/v/d]");
            estadoCivil = scan.next().toUpperCase();

            if(!estadoCivil.equals("S") && !estadoCivil.equals("C") && !estadoCivil.equals("V") && !estadoCivil.equals("D")){
                System.out.println("Estado Civil deve ser S, C, V ou D!");
            }else{
                break;
            }
        } while (true);

        scan.close();
    }
}
