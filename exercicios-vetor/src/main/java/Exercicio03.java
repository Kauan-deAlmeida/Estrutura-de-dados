import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vetor = new String[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextLine();
        }
        System.out.println("Informe um nome: ");
        String nome = sc.nextLine();
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i].equals(nome.toLowerCase())){
                System.out.println("Nome encontrado no índice " + i);
                break;
            } else if(i == vetor.length - 1){
                System.out.println("Nome não encontrado");
            }
        }
    }
}
