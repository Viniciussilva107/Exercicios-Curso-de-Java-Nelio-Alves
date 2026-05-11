import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial,  horaFinal;
        System.out.printf("Digite o valor da hora inicial: ");
        horaInicial = sc.nextInt();
        System.out.printf("Digite o valor da hora final: ");
        horaFinal = sc.nextInt();

        int duracao;

        if(horaInicial > 24 || horaInicial < 0 || horaFinal > 24 || horaFinal < 0){
            System.out.printf("Horario invalido");
        }
        else if(horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
            System.out.printf("O jogo durou: %d horas\n", duracao);
        }
        else{
            duracao = 24 - horaInicial + horaFinal;
            System.out.printf("O jogo durou: %d horas\n", duracao);
        }

        sc.close();
    }
}
