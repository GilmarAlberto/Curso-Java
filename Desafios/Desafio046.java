/*
 Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.
*/

package Desafios;

import java.util.Scanner;

public class Desafio046{
    public static void main(String[] args){
        String nome, senha;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Digite o nome: ");
            nome = scan.nextLine();
            if(nome.trim().isEmpty()){
                System.out.println("Nome inválido!");
            }else{
                break;
            }
   
        } while(true);

        do {
            System.out.println("Digite a senha: ");
            senha = scan.next();

            if(senha.trim().isEmpty() || senha.equals(nome)){
                System.out.println("Senha inválida!");
            }else{
                break;
            }
        } while(true);

        scan.close();
    }
}
