package org.example;

import java.util.Arrays;

public class Menu {

    private ListaObj<Aluno> alunos;
    private Pilha pilha;
    private String espacoFormatado = "----------------------------";

    public Menu(){
        alunos = new ListaObj(10);
        pilha = new Pilha(10);
    }

    public void cadastrar(String nome, Integer id){
        Aluno aluno = new Aluno(id, nome);
        alunos.adiciona(aluno);
        pilha.push(id);
        System.out.println(espacoFormatado);
        System.out.println("Aluno cadastrado!!");
        System.out.println(espacoFormatado);
    }

    public void deletar(Integer id){
        if (pilha.isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }
        for (int i = 0; i < alunos.getTamanho(); i++) {
            if (id.equals(alunos.getElemento(i).getId())){
                alunos.removeElemento(alunos.getElemento(i));

                System.out.println("Aluno com id " + id + " foi deletado com sucesso!");
                return;
            }
        }
        System.out.println("Aluno com id " + id + " não foi encontrado");
    }

    public void exibir(){
        if (alunos.getTamanho() == 0) {
            System.out.println("Nenhum aluno cadastrado");
            return;
        }
        System.out.print(espacoFormatado);
        alunos.exibe();
        System.out.println("\n" + espacoFormatado);
    }

    public void desfazer(){
        if (pilha.isEmpty()) {
            System.out.println(espacoFormatado);
            System.out.println("Não há nada a fazer");
            System.out.println(espacoFormatado);
            return;
        }
        deletar(pilha.pop());
        System.out.println(espacoFormatado);
        System.out.println("Último cadastro desfeito, último id desempilhado da pilha");
        System.out.println(espacoFormatado);
    }
}
