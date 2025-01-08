import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
            soma +=vetor[i];
        }
        System.out.println(soma);

        for (int i = 0; i < vetor.length; i++) {
            double media = soma / vetor.length;
            if(vetor[i] > media){
                System.out.println(vetor[i]);
            }
        }
    }
}
