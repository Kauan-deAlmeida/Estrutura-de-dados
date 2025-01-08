package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu classMenu = new Menu();

        boolean isSair = false;
        while (!isSair) {
            System.out.println("""
                   1 - Cadastrar Aluno
                   2 - Deletar Aluno
                   3 - Exibir Alunos
                   4 - Desfazer Última Ação
                   5 - Encerrar Programa""");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Informe o nome: ");
                    String nome = sc.next();

                    System.out.print("Informe o id: ");
                    Integer id = sc.nextInt();

                    classMenu.cadastrar(nome, id);
                    break;
                case 2:
                    System.out.print("Informe o id do aluno que gostaria de deletar: ");
                    classMenu.deletar(sc.nextInt());
                    break;
                case 3:
                    classMenu.exibir();
                    break;
                case 4:
                    classMenu.desfazer();
                    break;
                case 5:
                    isSair = true;
                    break;
            }
        }
        System.out.println("Aplicação encerrada");
    }
}