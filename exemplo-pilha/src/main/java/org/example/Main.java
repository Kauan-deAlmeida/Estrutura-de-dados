package org.example;

import java.awt.desktop.PrintFilesHandler;

public class Main {
    public static void main(String[] args) {
        Pilha p = new Pilha(5);
        p.exibir();
        System.out.println(p.isEmpty());
        System.out.println(p.isFull());
        p.push(2);
        p.push(3);
        System.out.println(p.peek());
        p.push(6);
        p.push(4);
        System.out.println(p.isFull());
        System.out.println(p.isEmpty());
        p.push(5);
        System.out.println(p.pop());
        p.push(9);
        System.out.println(p.isFull());
        p.exibir();
    }
}