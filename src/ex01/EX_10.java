package ex01;

import java.util.Scanner;

class CustoFumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Há quantos anos você fuma?");
        int anos = scanner.nextInt();

        System.out.println("Quantos cigarros você fuma por dia?");
        int cigarrosPorDia = scanner.nextInt();

        System.out.println("Qual o preço de uma carteira de cigarros?");
        float precoCarteira = scanner.nextFloat();

        int totalCigarros = anos * 365 * cigarrosPorDia;
        float totalGasto = (totalCigarros / 20) * precoCarteira;

        System.out.println("Você já gastou R$ " + totalGasto + " em cigarros.");
    }
}
