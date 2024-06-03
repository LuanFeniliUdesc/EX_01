package ex01;

import java.util.Scanner;

class Sexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o sexo (M/F):");
        char sexo = scanner.next().charAt(0);

        if (sexo == 'M' || sexo == 'm') {
            System.out.println("Masculino");
        } else if (sexo == 'F' || sexo == 'f') {
            System.out.println("Feminino");
        } else {
            System.out.println("Entrada inválida.");
        }
    }
}
