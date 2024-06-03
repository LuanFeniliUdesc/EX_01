package ex01;

import java.util.Scanner;

class MediaConsumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância percorrida (em km):");
        int distancia = scanner.nextInt();

        System.out.println("Digite o total de combustível gasto (em litros):");
        float combustivel = scanner.nextFloat();

        float mediaConsumo = distancia / combustivel;

        System.out.println("A média de consumo do veículo é: " + mediaConsumo + " km/l");
    }
}