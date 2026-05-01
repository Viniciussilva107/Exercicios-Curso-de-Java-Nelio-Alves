import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        double salario;
        double horas;
        double salarioFinal;

        System.out.printf("digite o numero do funcionario: ");
        numero = sc.nextInt();
        System.out.printf("digite o salario do funcionario: ");
        salario = sc.nextDouble();
        System.out.printf("digite o horas do funcionario: ");
        horas = sc.nextDouble();

        salarioFinal = salario * horas;

        System.out.printf("numero: %d \n",  numero);
        System.out.printf("Salario final do Funcionario: R$%.2f \n", salarioFinal);

        sc.close();
    }
}