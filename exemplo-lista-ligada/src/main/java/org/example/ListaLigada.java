package org.example;

public class ListaLigada {

    private Node head;

    public ListaLigada(){
        head = new Node(0);
    }

    public void insereNode(int valor){
        Node novo = new Node(valor);
        novo.setNext(head.getNext());
        head.setNext(novo);
    }

    public void exibe(){
        Node atual = head.getNext();
        while(atual != null){
            System.out.println(atual.getInfo());
            atual = atual.getNext();
        }
    }

    public Node buscarPorNode(int valor) {
        Node atual = head.getNext();
        while (atual != null) {
            if (atual.getInfo() == valor) {
                return atual;
            }
            atual = atual.getNext();
        }

        return null;
    }

    public boolean removeNode(int valor){
        Node ant = head;
        Node atual = head.getNext();
        while(atual != null){
            if(atual.getInfo() == valor){
                ant.setNext(atual.getNext());
                return true;
            }
            ant = atual;
            atual = atual.getNext();
        }

        return false;
    }

    public int getTamanho(){
        Node atual = head.getNext();
        int tam = 0;
        while(atual != null){
            tam++;
            atual = atual.getNext();
        }

        return tam;
    }
}
