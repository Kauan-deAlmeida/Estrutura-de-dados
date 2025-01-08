package org.example;

public class Aluno {

    private Integer id;
    private String nome;

    public Aluno(){}

    public Aluno(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nAluno com id: " + id + " e nome: " + nome;
    }
}
