import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        int diferenca;

        System.out.println("Digite o primeiro numero: " );
        a = sc.nextInt();
        System.out.println("Digite o segundo numero: " );
        b = sc.nextInt();
        System.out.println("Digite o terceiro numero: " );
        c = sc.nextInt();
        System.out.println("Digite o quarto numero: " );
        d = sc.nextInt();

        diferenca = (a * b) - (c * d);

        System.out.println(diferenca);
        sc.close();
    }
}