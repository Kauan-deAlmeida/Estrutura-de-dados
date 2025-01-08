package org.example;

public class Teste <T>{

    private PilhaObj pilha;

    public void separaPositivoNegativoEmOrdem(Integer[] vetor){
        FilaObj<Integer> fila = new FilaObj(vetor.length);
        FilaObj<Integer> fila2 = new FilaObj(vetor.length);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+"  ");
        }
        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > 0){
                fila.insert(vetor[i]);
            } else {
                fila2.insert(vetor[i]);
            }
        }
        fila.exibe();
        fila2.exibe();
//        for (int i = 0; i < fila.getTamanho(); i++) {
//            vetor[i] = fila.poll();
//        }
//        for (int i = fila.getTamanho() + 1; i < fila2.getTamanho(); i++) {
//            vetor[i] = fila2.poll();
//        }
    }
}
