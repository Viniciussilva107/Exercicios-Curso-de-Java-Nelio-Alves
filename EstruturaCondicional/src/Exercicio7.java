import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float x, y;

        System.out.printf("Digite o ponto x: ");
        x = sc.nextFloat();
        System.out.printf("Digite o ponto y: ");
        y = sc.nextFloat();

        if (x == 0 || y == 0) {
            System.out.printf("Origem");
        } else if (x > 0 && y > 0) {
            System.out.printf("Q1");
        } else if (x < 0 && y > 0) {
            System.out.printf("Q2");
        } else if (x < 0 && y < 0) {
            System.out.printf("Q3");
        } else if (x > 0 && y < 0) {
            System.out.printf("Q4");
        }
    }
}
