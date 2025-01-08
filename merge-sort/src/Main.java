import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] v = {10,30,50,20,90,70};
        particiona(v, 0, v.length-1)< ;
        System.out.println(Arrays.toString(v));
    }

    public static void particiona(int[] v, int indInicio, int indFim){
        int i, j, pivo;
        i = indInicio;
        j = indFim;
        pivo = v[(indInicio+indFim)/2];
        while(i <= j){
            while(i < indFim && v[i] < pivo) i = i + 1;
            while(j > indInicio && v[j] > pivo) j = j - 1;
            if(i <= j){
                int aux = v[i];
                v[i] = v[j];
                v[j] = aux;
                i = i + 1;
                j = j - 1;
            }
        }
        if(indInicio < j){
            particiona(v, indInicio, j);
            if(i < indFim){
                particiona (v, i, indFim);
            }
        }
    }

    public static void mergeSort(int p, int r, int[] v){
        if (p < r-1){
            int q = (p + r) / 2;
            mergeSort(p, q, v);
            mergeSort(q, r, v);
            intercala(p, q, r, v);
        }
    }

    public static void intercala(int p, int q, int r, int[] v){
        int[] w = new int[r-p];
        int i, j, k;
        i = p;
        j = q;
        k = 0;
        while( (i < q) && (j < r)){
            if(v[i] <= v[j]){
                w[k++] = v[i++];
            } else{
                w[k++] = v[j++];
            }
        }
        while(i < q) w[k++] = v[i++];
        while(j < r) w[k++] = v[j++];
        for(i = p;i < r; i++){
            v[i] = w[i - p];
        }
    }
}