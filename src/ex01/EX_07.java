package ex01;

import java.util.Scanner;

class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        float salarioPorHora = scanner.nextFloat();

        System.out.println("Quantas horas você trabalha por mês?");
        int horasTrabalhadas = scanner.nextInt();

        float salarioMensal = salarioPorHora + horasTrabalhadas;

        System.out.println("O seu salário no mês é: " + salarioMensal);
    }
}
