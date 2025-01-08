public class Exercicio01 {
    public static void main(String[] args) {
        int[] vetor = {10,20,30,40,50,60,70};
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("----------------------------------");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
