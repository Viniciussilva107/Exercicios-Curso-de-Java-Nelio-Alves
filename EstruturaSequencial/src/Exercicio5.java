import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroPeca1, numeroPeca2, quantidadePecas1,  quantidadePecas2;
        double valorPeca1, valorPeca2, valorFinalPecas1, valorFinalPecas2;

        System.out.printf("Digite o numero da peça 1: ");
        numeroPeca1 = sc.nextInt();
        System.out.printf("Digite o numero da peça: 2 ");
        numeroPeca2 = sc.nextInt();
        System.out.printf("Quantidade de peça 1: ");
        quantidadePecas1 = sc.nextInt();
        System.out.printf("Quantidade de peça 1: ");
        quantidadePecas2 = sc.nextInt();
        System.out.printf("Valor da peça 1: ");
        valorPeca1 = sc.nextDouble();
        System.out.printf("Valor da peça 1: ");
        valorPeca2 = sc.nextDouble();

        valorFinalPecas1 = valorPeca1 * quantidadePecas1;
        valorFinalPecas2 = valorPeca2 * quantidadePecas2;
        double valorTotal = valorFinalPecas1 + valorFinalPecas2;

        System.out.printf("Peça 1 numero: %d, quantidade %d, valor de cada peça: %.2f e total R$%.2f \n", numeroPeca1, quantidadePecas1, valorPeca1, valorFinalPecas1);
        System.out.printf("Peça 2 numero: %d, quantidade %d, valor de cada peça: %.2f e total R$%.2f \n", numeroPeca2, quantidadePecas2, valorPeca2, valorFinalPecas2);
        System.out.printf("Valor total: %.2f", valorTotal);
        sc.close();
    }
}