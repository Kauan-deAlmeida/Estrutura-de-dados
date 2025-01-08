package org.example;

public class Teste {

    public static void main(String[] args)
    {
        ListaLigada listaLigadaNumeros = new ListaLigada();
        listaLigadaNumeros.insereNode(10);
        listaLigadaNumeros.insereNode(20);
        listaLigadaNumeros.insereNode(30);
        listaLigadaNumeros.exibe();
        System.out.println();
        System.out.println(listaLigadaNumeros.buscarPorNode(20));
        System.out.println(listaLigadaNumeros.removeNode(10));
        System.out.println(listaLigadaNumeros.getTamanho());
    }
}
