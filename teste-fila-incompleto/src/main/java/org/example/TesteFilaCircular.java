package org.example;

public class TesteFilaCircular {
    public static void main(String[] args) {
        FilaCircular fila = new FilaCircular(5);
        fila.insert("A");
        fila.insert("B");
        fila.insert("C");
        fila.insert("D");
        fila.insert("E");

        // Exibindo fila circular cheia
        fila.exibe();

        //Desenfileirando o primeiro elemento
        fila.poll();

        // Enfileirando outro elemento
        System.out.println();
        fila.insert("F");

        // Exibindo fila circular cheia
        fila.exibe();

        // Removendo o B que é o inicio da fila
        fila.poll();

        // Inserindo G no fim
        fila.insert("G");

        System.out.println("Outro teste");
        fila.exibe();

    }
}
