public class Main {

    public static void contagemRegressiva(int numero){
        for (int i = numero; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void contagemRegressivaRecursiva(int numero){
        if(numero == 0){
            System.out.println("Encerrou");
        } else{
            System.out.println(numero);
            contagemRegressivaRecursiva(numero -1);
        }
    }

    public static int calcularFatoria(int numero){
        int resultadoFatorial = 1;
        for (int i = numero; i > 0; i++) {
            resultadoFatorial *= i;
        }
        return resultadoFatorial;
    }

    public static int calcularFatoriaRecursiva(int numero){
        if(numero == 0){
            return 1;
        }
        return numero * calcularFatoriaRecursiva(numero - 1);
    }

    public static void exibeNomesRecursivo(String[] nomes, int indice){
        if(indice == nomes.length){
            return;
        }
        exibeNomesRecursivo(nomes, indice + 1);
        System.out.println(nomes[indice]);
    }

    public static void main(String[] args) {
        System.out.println(calcularFatoriaRecursiva(5));
        String[] nomes = {"Bob", "Tom", "Ana", "Ian"};
        exibeNomesRecursivo(nomes, 0);
    }
}