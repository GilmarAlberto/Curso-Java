import java.util.Scanner;

public class TiposPrimitivos{
    public static void main(String[] args){
        int idade = 30;
        String valor = Integer.toString(idade);
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.println ("A nota é " + nota);
        System.out.printf("A nota do %s é %.2f", nome, nota);
        
    }
}