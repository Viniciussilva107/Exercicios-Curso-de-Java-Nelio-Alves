import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio;
        double pi = 3.14159;
        double area;

        System.out.printf("Digite o raio do circulo: ");
        raio = sc.nextDouble();

        area = (pi*Math.pow(raio,2));
        System.out.printf("O circulo de raio %.2f tem area igual a: %.4f", raio, area);
        sc.close();
    }
}
