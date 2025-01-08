import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno(234, "Bob da Silva", 8.4, 3);
        Aluno aluno02 = new Aluno(235, "Xampson Sousa", 6.7, 1);
        Aluno aluno03 = new Aluno(236, "Lucas Oristanio Faes", 6.0, 0);


        System.out.printf("%-6S %-20S %6S %6S" , "ra", "nome", "nota", "faltas");
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno01);
        alunos.add(aluno02);
        alunos.add(aluno03);
        alunos.forEach(aluno ->
                System.out.printf("\n%06d %-20s %6.2f %6d",
                        aluno.getRa(),
                        aluno.getNome(),
                        aluno.getNotaFinal(),
                        aluno.getQtdFalta())
                );
    }
}