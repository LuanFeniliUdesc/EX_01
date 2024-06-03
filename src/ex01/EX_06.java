package ex01;

import java.util.Scanner;

class DoacaoSangue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        if (idade >= 18 && idade <= 67) {
            System.out.println("Pode doar sangue.");
        } else {
            System.out.println("Não pode doar sangue.");
        }
    }
}

