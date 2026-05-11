import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo, quantidade;

        System.out.printf("Digite o codigo: ");
        codigo = sc.nextInt();
        System.out.printf("Digite a quantidade: ");
        quantidade = sc.nextInt();

        if(quantidade < 0){
            System.out.printf("Quantidade invalida");
            return;
        }

        float preco = 0;

        switch (codigo) {
            case 1:
                System.out.printf("Cachorro quente");
                preco = quantidade * 4.0F;
                break;
            case 2:
                System.out.printf("X-Salada");
                preco = quantidade * 4.50F;
                break;
            case 3:
                System.out.printf("X-Bacon");
                preco = quantidade * 5.0F;
                break;
            case 4:
                System.out.printf("Torrada simples");
                preco = quantidade * 4.0F;
                break;
            case 5:
                System.out.printf("Refrigerante");
                preco = quantidade * 4.0F;
                break;
            default:
                System.out.printf("Codigo invalido");
                return;
        }

        System.out.printf("Total: R$ %.2f", preco);

        sc.close();
    }
}
