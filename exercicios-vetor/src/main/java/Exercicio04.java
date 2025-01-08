import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
        System.out.println("Informe um número:");
        int numero = sc.nextInt();

        int repete = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] == numero){
                repete++;
            }
        }
        System.out.println("O número " + numero + " ocorre " + repete + " vezes");
    }
}
