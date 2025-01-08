package org.example;

public class Pilha {

    private int top;
    private int[] vetor;

    public Pilha(int capacidade) {
        this.top = -1;
        this.vetor = new int[capacidade];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == vetor.length - 1;
    }

    public void push(int info){
        top++;
        vetor[top] = info;
    }

    public int pop(){
        if (isEmpty()) return -1;
        int valor = vetor[top];
        top--;
        int[] vetorNovo = vetor;
        vetor = new int[vetorNovo.length];
        System.arraycopy(vetorNovo, 0, vetor, 0, vetor.length);
        return valor;
    }

    public int peek(){
        if (isEmpty()) return -1;
        return vetor[top];
    }

    public void exibir(){
        if (isEmpty()) System.out.println("Pilha vazia");
        else{
            for (int i = vetor.length - 1; i > -1; i--) {
                System.out.print(vetor[i]);
            }
        }
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }
}

