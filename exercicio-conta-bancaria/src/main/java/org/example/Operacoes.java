package org.example;

public class Operacoes {

    private ContaBancaria contaBancaria;
    private String tipoOperacao;
    private Double valor;

    public Operacoes(ContaBancaria contaBancaria, String tipoOperacao, Double valor) {
        this.contaBancaria = contaBancaria;
        this.tipoOperacao = tipoOperacao;
        this.valor = valor;
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\nOperacoes contaBancaria= " + contaBancaria + ", tipoOperacao= " + tipoOperacao + ", valor= " + valor;
    }
}
