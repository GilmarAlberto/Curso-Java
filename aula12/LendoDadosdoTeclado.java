package aula12;

import java.util.Scanner;

public class LendoDadosdoTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é " + nomeCompleto);

        System.out.println("Digite o seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é " + primeiroNome);

        System.out.println("Digite e a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é " + idade);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("A sua altura é " + altura);*/

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem pets");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean pets = scan.nextBoolean();

        System.out.println("Você digitou os seguintes valores:");
        System.out.println("Nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Pets: " + pets);

        scan.close();

    }
    

    
}
