package org.example.io;

import java.io.*;
import java.util.Scanner;

public class Leitor {

    public static void main(String[] args) {
        try (InputStream file = new FileInputStream("filme.csv");
             BufferedReader buffer = new BufferedReader(new InputStreamReader(file));
             Scanner sc = new Scanner(buffer)){

            sc.useDelimiter("[;\\n]");
            sc.nextLine();
            while(sc.hasNext()){
                String nomeFilme = sc.next();
                Integer valorFilme = sc.nextInt();
                Boolean isFilmeBom = sc.nextBoolean();
                System.out.println("Nome Filme: %s Valor Filme: %d Filme bom: %b".formatted(nomeFilme, valorFilme, isFilmeBom));
            }
        }catch (FileNotFoundException e){
            System.out.println("Não foi possivel ler o arquivo ");
        } catch (IOException e){
            System.out.println("Não foi possivel ler o arquivo ");
        }
    }
}
