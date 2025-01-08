package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        Fila filaTest = new Fila(3);
        filaTest.insert("a");
        filaTest.insert("b");
        filaTest.insert("c");
        System.out.println(filaTest.poll());
        System.out.println(filaTest.poll());
    }
}