package ex01;

import java.util.Scanner;

class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite a primeira nota:");
        float nota1 = scanner.nextFloat();

        System.out.println("Digite a segunda nota:");
        float nota2 = scanner.nextFloat();

        System.out.println("Digite a terceira nota:");
        float nota3 = scanner.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        if (media > 7) {
            System.out.println(nome + " está aprovado.");
        } else if (media >= 5) {
            System.out.println(nome + " está em exame.");
        } else {
            System.out.println(nome + " está reprovado.");
        }
    }
}

