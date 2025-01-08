import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ListaEstatica l = new ListaEstatica();
        l.adicionar(2);
        l.adicionar(3);
        l.adicionar(6);
        l.adicionar(6);
        l.adicionar(6);
        l.adicionar(6);

        l.exibe();
        System.out.println("Busca, devolve o indice do vetor: " + l.buscar(2));
        System.out.println("Remove pelo indice: " + l.removePeloIndice(4));
        System.out.println("Remove elemento: " + l.removeElemento(6));
    }
}