package Classes;

import java.util.ArrayList;
import java.util.Scanner;

import static com.sun.tools.javac.util.StringUtils.toUpperCase;

public class Principal
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantia de pessoas: ");
        int quantia = scanner.nextInt();

        PessoaIMC[] pessoas = new PessoaIMC[quantia];

        for (int i = 0; i < quantia; i++)
        {
            System.out.println("Digite os dados da " + (i + 1) + "° pessoa!");

            System.out.print("Nome: ");
            String nome = scanner.next();

            System.out.print("Data de Nascimento: ");
            String dataNascimento = scanner.next();

            System.out.print("Peso: ");
            double peso = scanner.nextDouble();

            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();

            System.out.print("Digite o tipo de pessoa (H para Homem, M para Mulher): ");
            String tipoPessoa = scanner.next();

            if (tipoPessoa.equalsIgnoreCase("H"))
            {
                pessoas[i] = new Homem(nome, dataNascimento, peso, altura);
            }
            else if (tipoPessoa.equalsIgnoreCase("M"))
            {
                pessoas[i] = new Mulher(nome, dataNascimento, peso, altura);
            }
        }
        for (PessoaIMC pessoa : pessoas)
        {
            System.out.println("\n" + pessoa.toString());
            System.out.println("IMC: " + pessoa.calculaIMC(pessoa.getAltura(), pessoa.getPeso()));
            System.out.println("Resultado IMC: " + pessoa.resultIMC());
        }
    }
}