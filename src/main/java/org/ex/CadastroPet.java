package org.ex;

import java.util.Scanner;

class Petlove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        String tipo;

        System.out.println("=== Cadastro de Pet ===");

        System.out.print("Digite o nome do pet: ");
        nome = scanner.nextLine();

        System.out.print("Digite o tipo (cachorro, gato...): ");
        tipo = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.println("\n=== Dados do Pet ===");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Idade: " + idade + " anos");

        System.out.print("Parabéns você é um CadastroPetlove cadastrado!");

        scanner.close();
    }
}