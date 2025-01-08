import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] t1 = new String[8];
        String[] t2 = new String[8];
        int indiceT1 = 0;
        int indiceT2 = 0;
        for(int i = 0; i < t1.length; i++){
            System.out.print("Nome do aluno: ");
            String aluno = sc.nextLine();

            System.out.print("Nome da turma: ");
            String turma = sc.nextLine();

            if(turma.equals("t1")) t1[indiceT1++] = aluno;
            else t2[indiceT2++] = aluno;
        }
        System.out.println(Arrays.toString(t1));
        System.out.println(Arrays.toString(t2));
    }
}