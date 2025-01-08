package org.example.exception;

public class UncheckedException {
    public static void main(String[] args) {

//        try{
//            Integer total = 2/0;
//        } catch (ArithmeticException){
//            System.out.println("Erro");
//        }
//        String none = null;
//        none.toLowerCase();
        verificarNome();
    }

    public static void verificarNome() throws  ExceptionPersonalizada{
        throw new ExceptionPersonalizada();
    }
}
