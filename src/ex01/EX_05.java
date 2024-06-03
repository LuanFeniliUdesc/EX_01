package ex01;

import java.util.Scanner;

class Voto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println(nome + " Não pode votar!");
        } else {
            System.out.println(nome + " Apto a votar!");
        }
    }
}
