package ex01;

import java.util.Scanner;

class MaiorOuIgual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num1 < num2) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}
