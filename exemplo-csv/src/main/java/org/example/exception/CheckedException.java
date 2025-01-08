package org.example.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {

        try{
            FileReader file = new FileReader("pessoa.csv");
            lerArquivo();
        } catch (FileNotFoundException erro){
            System.out.println("Deu ruim!");
            erro.printStackTrace();
        }

    }

    public static void lerArquivo() throws FileNotFoundException {
        FileReader file = new FileReader("pessoa.csv");
    }
}
