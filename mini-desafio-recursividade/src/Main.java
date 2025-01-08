import javax.naming.Binding;
import java.util.Arrays;

public class Main {

    public static int buscarQuantidadeVendas(double[] preco, int indice){
        if(preco.length == indice){
            return 0;
        } else{
            return 1 + buscarQuantidadeVendas(preco, indice + 1);
        }
    }

    public static double somarVendas(double[] preco, int indice, double soma){
        if(preco.length == indice){
            return 0;
        } else{
            soma = preco[indice];
            return soma + somarVendas(preco, indice + 1, soma);
        }
    }

    public static boolean buscarPreco(double[] preco, int indice, double busca){
        if(indice == preco.length){
            return false;
        } else if(busca == preco[indice]){
            return true;
        }
        else{
            return buscarPreco(preco, indice + 1, busca);
        }
    }

    public static double buscarMaiorPreco(double[] preco, int indice, double maior){
        if(indice == preco.length){
            return maior;
        }
        else {
            if(maior < preco[indice]){
               maior = preco[indice];
            }
            return buscarMaiorPreco(preco, indice + 1, maior);
        }
    }

    public static double buscarMenorPreco(double[] preco, int indice, double menor){
        if(indice == preco.length){
            return menor;
        }
        if(menor > preco[indice]){
            menor = preco[indice];
        }
        return buscarMenorPreco(preco, indice + 1, menor);
    }

    public static double[] buscarPorPrecoMinino(double[] preco, int indice, double busca, double[] vetor){
        if(indice == preco.length){
            return vetor;
        } else{
            if(busca <= preco[indice]){
                vetor[indice] = preco[indice];
            }
            return buscarPorPrecoMinino(preco, indice + 1, busca, vetor);
        }
    }

    public static int buscarTamanho(double[] preco, int indice, double busca, int  tamanho){
        if(indice == preco.length){
            return tamanho;
        }
        if (busca <= preco[indice]) {
            tamanho++;
        }
        return buscarTamanho(preco, indice + 1, busca, tamanho);
    }


    public static void main(String[] args) {
        double[] preco = {2.3, 5.6, 10.11, 1.0};
        double busca = 2.3;
        double[] vetor = new double[buscarTamanho(preco, 0, busca, 0)];
        double soma = 0.0;
        double maior = 0.0;
        double menor = preco[0];
        System.out.println(buscarQuantidadeVendas(preco, 0));;
        System.out.println(somarVendas(preco, 0, soma));
        System.out.println(buscarPreco(preco, 0, 5.6));
        System.out.println(buscarMaiorPreco(preco, 0, maior));
        System.out.println(buscarMenorPreco(preco, 0, menor));
        System.out.println(Arrays.toString(buscarPorPrecoMinino(preco, 0, busca, vetor)));


    }
}