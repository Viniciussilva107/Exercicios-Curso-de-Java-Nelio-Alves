import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite o numero: ");
        num = sc.nextInt();

        if(num >= 0){
            System.out.println("Numero positivo");
        }
        else{
            System.out.println("Numero negativo");
        }

        sc.close();
    }
}