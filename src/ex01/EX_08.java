package ex01;

import java.util.Scanner;

class MaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[4];
        int maior, menor;

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite o valor " + (i + 1) + ":");
            valores[i] = scanner.nextInt();
        }

        maior = menor = valores[0];

        for (int i = 1; i < 4; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
    }
}

