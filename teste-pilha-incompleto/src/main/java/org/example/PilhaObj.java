package org.example;

public class PilhaObj <T>{

    // 01) Atributos
    private int topo;
    private T[] vetor;

    public PilhaObj(int capacidade) {
        this.topo = -1;
        this.vetor = (T[]) new Object[capacidade];
    }

    // 03) MÃ©todo isEmpty
    public boolean isEmpty(){
        return topo == -1;
    }

    // 04) MÃ©todo isFull
    public boolean isFull(){
        return topo == vetor.length - 1;
    }

    // 05) MÃ©todo push
    public void push(T info){
        if (isFull()) throw new IllegalStateException();
        vetor[++topo] = info;
    }

    // 06) MÃ©todo pop
    public T pop(){
        if (isEmpty()) return null;
        return vetor[topo--];
    }

    // 07) MÃ©todo peek
    public T peek(){
        if (isEmpty()) return null;
        return vetor[topo];
    }

    // 08) MÃ©todo exibe
    public void exibir(){
        if (isEmpty()) System.out.println("Pilha vazia");
        for (int i = vetor.length - 1; i > -1; i--) System.out.print(vetor[i]);
    }

    //Getters & Setters (manter)
    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    public T[] getVetor() {
        return vetor;
    }

    public void setVetor(T[] vetor) {
        this.vetor = vetor;
    }
}