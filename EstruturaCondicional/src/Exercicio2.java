import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Numero par");
        }
        else {
            System.out.println("Numero impar");
        }

        sc.close();
    }
}
