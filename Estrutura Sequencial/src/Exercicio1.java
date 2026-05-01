import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.print("Digite o primeiro numero: " );
        a = sc.nextInt();
        System.out.print("Digite o primeiro numero: " );
        b = sc.nextInt();
        int soma = a + b;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}