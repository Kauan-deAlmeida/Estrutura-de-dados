package org.example;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {0, 1, 2, 3, 4, 3, 5, 6, 3, 7, 8, 9, 3, 22};
        System.out.println("Questão 1) " + somaAteNumeroInformado(vetor, 0, 5, 0));
        System.out.println("Questão 2) " + somaVetorInteiro(vetor, 0, 0));
        System.out.println("Questão 3) " + qtdImpares(vetor, 0, 0));
        System.out.println("Questão 4) " + ocorrencia(vetor, 0, 0, 3));
        System.out.println("Questão 5) " + euclides(90,54));
        System.out.println("Questão 6) " + maiorDoVetor(vetor, 0, vetor[0]));
        System.out.println("Questão 7) " + somaDosDigitos( 0, 3417, 0, 0));
        System.out.println("Questão 8) " + numeroBinario( "", 12));
    }
    public static int somaAteNumeroInformado(int[] vetor, int indice, int numero, int soma){
        if(numero == 0){
            return soma;
        }
        soma += vetor[indice];
        return somaAteNumeroInformado(vetor, indice + 1,numero - 1, soma);
    }

    public static int somaVetorInteiro(int[] vetor, int indice, int soma){
        if(indice == vetor.length){
            return soma;
        }
        soma += vetor[indice];
        return somaVetorInteiro(vetor, indice + 1, soma);
    }

    public static int somaPares(int[] vetor, int indice, int soma){
        if(indice == vetor.length){
            return soma;
        }

        if(vetor[indice]%2==0){
            soma += vetor[indice];
        }
        return somaPares(vetor, indice + 1, soma);
    }

    public static int qtdImpares(int[] vetor, int indice, int soma){
        if(indice == vetor.length){
            return soma;
        }

        if(vetor[indice]%2!=0){
            soma += 1;
        }
        return qtdImpares(vetor, indice + 1, soma);
    }

    public static int ocorrencia(int[] vetor, int indice, int soma, int numeroOcorrencia){
        if(indice == vetor.length){
            return soma;
        }
        if(numeroOcorrencia == vetor[indice]){
            soma += 1;
        }
        return ocorrencia(vetor, indice + 1, soma, numeroOcorrencia);
    }

    public static int euclides(int numeroDigitado, int divisor) {
        if (divisor == 0) {
            return numeroDigitado;
        }
        return euclides(divisor, numeroDigitado % divisor);
    }

    public static int maiorDoVetor(int[] vetor, int indice, int maior){
        if(indice == vetor.length){
            return maior;
        }
        if(maior <= vetor[indice]){
            maior = vetor[indice];
        }
        return maiorDoVetor(vetor, indice + 1, maior);
    }

    public static int somaDosDigitos( int soma, int numeroEscolhido, int resultado, int quardarValor){
        if(numeroEscolhido%10==0){
            return quardarValor;
        }
        resultado = numeroEscolhido%10;
        if(resultado!=0){
            quardarValor += resultado;
        }
        numeroEscolhido = numeroEscolhido / 10;
        return somaDosDigitos(soma, numeroEscolhido, resultado, quardarValor);
    }

    public static String numeroBinario(String binario, int numeroEscolhido) {
        if (numeroEscolhido == 0) {
            return binario;
        }
        int resultado = numeroEscolhido % 2;
        binario = resultado + binario;
        return numeroBinario(binario, numeroEscolhido / 2);
    }
}