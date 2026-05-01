import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;

        System.out.print("Digite o valor do primeiro numero: ");
        a = input.nextDouble();
        System.out.print("Digite o valor do segundo numero: ");
        b = input.nextDouble();
        System.out.print("Digite o valor do terceiro numero: ");
        c = input.nextDouble();

        double pi = 3.14159;
        double triangulo = (a * c) / 2;
        double circulo = Math.pow(c, 2) * pi;
        double trapezio = ((a + b) * c) / 2;
        double quadrado = Math.pow(b, 2);
        double retangulo = a * b;

        System.out.printf("Triangulo: %.3f\n", triangulo);
        System.out.printf("Circulo: %.3f\n", circulo);
        System.out.printf("Quadrado: %.3f\n", quadrado);
        System.out.printf("Retangulo: %.3f\n", retangulo);
        System.out.printf("Trapezio: %.3f\n", trapezio);

        input.close();

    }
}
