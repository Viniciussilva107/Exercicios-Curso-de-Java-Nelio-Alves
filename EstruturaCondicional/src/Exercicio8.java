import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float salario;
        float imposto = 0;
        float valorExcede = 0;

        System.out.print("Digite seu salario: ");
        salario = sc.nextFloat();

        if (salario < 0) {
            System.out.println("Salario invalido");
            return;
        }
        if (salario >= 0 && salario <= 2000) {
            System.out.print("Isento");
        } else if (salario > 2.000 && salario <= 3000) {
            imposto = (salario - 2000F) * 0.08F;
            System.out.printf("Imposto: R$ %.2f", imposto);
        } else if (salario > 3000 && salario <= 4500) {
            imposto = 1000 * 0.08F + (salario - 3000F) * 0.18F;
            System.out.printf("Imposto: R$ %.2f", imposto);
        } else if (salario > 4500) {
            imposto = 1000 * 0.08F + 1500 * 0.18F + (salario - 4500) * 0.28F;
            System.out.printf("Imposto: R$ %.2f", imposto);
        }
    }
}
