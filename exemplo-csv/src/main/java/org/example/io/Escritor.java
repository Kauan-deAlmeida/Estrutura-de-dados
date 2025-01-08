package org.example.io;

import java.io.*;
import java.nio.Buffer;

public class Escritor {
    public static void main(String[] args) {
//            OutputStream file2 = new ByteArrayOutputStream("filme.csv");
//            OutputStream file3 = new BufferedOutputStream("filme.csv");
        try(OutputStream file = new FileOutputStream("filme.csv");
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(file))){

            writer.write("Nome;Valor;Bom\n");
            String pattern = "%s;%d;%b\n";
            writer.write(pattern
                    .formatted("Harry Potter e a pedra filosofal", 300, true));
            writer.write(pattern
                    .formatted("Interestelar", 9000, true));

//            writer.close();
        } catch(FileNotFoundException e){
            System.out.println("Deu erro para encontrar o arquivo");
        } catch (IOException e){
            System.out.println("Deu erro para ler o arquivo");
        }
    }
}
