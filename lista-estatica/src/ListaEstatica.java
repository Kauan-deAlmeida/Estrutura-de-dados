import java.util.Arrays;

public class ListaEstatica {

    int[] vetor;
    int nroElem;

    public ListaEstatica() {
        this.vetor = new int[5];
        this.nroElem = 0;
    }

    public void adicionar(int nroElem){
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] == 0) {
                vetor[i] = nroElem;
                return;
            }
        }
        System.out.println("Lista cheia");
    }

    public void exibe(){
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf(vetor[i] + " ");
        }
    }

    public int buscar(int nroElem){
        for (int i = 0; i < vetor.length; i++) {
            if(nroElem == vetor[i]) return i;
        }
        return -1;
    }

    public boolean removePeloIndice(int indiceRemovido){
        if(indiceRemovido > vetor.length) return false;
        for (int i = 0; i < vetor.length;i++) {
            int aux = vetor[i];
            if(i != indiceRemovido) vetor[i] = aux;
        }
        return true;
    }

    public boolean removeElemento(int nroElem){
        for (int i = 0; i < vetor.length;i++) {
            int aux = vetor[i];
            if(vetor[i] != nroElem){
                vetor[i] = aux;
            }
        }
        return true;
    }


    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    public int getNroElem() {
        return nroElem;
    }

    public void setNroElem(int nroElem) {
        this.nroElem = nroElem;
    }
}
