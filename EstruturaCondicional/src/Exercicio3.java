import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro numero: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = sc.nextInt();

        if(a>=b){
            if(a%b==0){
                System.out.println("Sao multiplos");
            }
            else{
                System.out.println("Nao sao multiplos");
            }
        }
        else if(a<b){
            if(b%a==0){
                System.out.println("Sao multiplos");
            }
            else{
                System.out.println("Nao sao multiplos");
            }
        }
        sc.close();
    }
}
