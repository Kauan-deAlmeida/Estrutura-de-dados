package org.example;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,3,2,1};
        System.out.println(ehPalintrome(vetor));
        converteParaBinario(9);
    }

    public static boolean ehPalintrome(int[] vetor){
        Pilha pilha = new Pilha(vetor.length);
        for (int i = 0; i < vetor.length; i++) pilha.push(vetor[i]);
        for (int i = 0; i < pilha.getTopo(); i++) if (pilha.pop() != vetor[i]) return false;
        return true;
    }

    public static void converteParaBinario(int numero){
        int voltas = 0;
        int divisao = numero;
        while (divisao != 0){
            divisao /= 2;
            voltas++;
        }
        Pilha pilha = new Pilha(voltas);
        for (int i = 0; i < voltas; i++) {
            pilha.push(numero%2);
            numero/=2;
        }
        pilha.exibir();
    }


}