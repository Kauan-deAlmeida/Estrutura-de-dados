package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static Integer contadorDeOperacoes = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilhaObj<Operacoes> pilha = new PilhaObj<>(10);
        FilaObj<Operacoes> fila = new FilaObj<>(10);
        List<ContaBancaria> contas = new ArrayList<>();
        ContaBancaria conta1 = new ContaBancaria(1, 500.0);
        ContaBancaria conta2 = new ContaBancaria(2, 1000.0);
        contas.add(conta1);
        contas.add(conta2);

        boolean isMenuAtivo = true;

        while (isMenuAtivo){
            System.out.println("""
                    1- Debitar valor
                    2- Creditar (Depositar) valor
                    3- Desfazer operação
                    4- Agendar operação
                    5- Executar operações agendadas
                    6- Sair
                    """);
            int menu = sc.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Digite o número da conta da qual vai debitar");
                    Integer numeroConta = sc.nextInt();
                    System.out.println("Digite o valor a ser debitado");
                    Double valorDebitado = sc.nextDouble();
                    contas.stream().forEach(conta -> {
                        if (conta.getNumero().equals(numeroConta) && conta.debitar(valorDebitado)){
                            Operacoes operacoes = new Operacoes(conta, "Debito", valorDebitado);
                            try{
                                pilha.push(operacoes);
                                contadorDeOperacoes++;
                            } catch (IllegalStateException e) {
                                System.out.println("Erro " + e.getMessage());
                            }
                        }
                    });
                    break;
                case 2:
                    System.out.println("Digite o número da conta onde vai depositar");
                    numeroConta = sc.nextInt();
                    System.out.println("Digite o valor a ser depositado");
                    Double valorDepositado = sc.nextDouble();
                    contas.stream().forEach(conta -> {
                        if (conta.getNumero().equals(numeroConta)){
                            conta.creditar(valorDepositado);
                            Operacoes operacoes = new Operacoes(conta, "Credito", valorDepositado);
                            try{
                                pilha.push(operacoes);
                                contadorDeOperacoes++;
                            } catch (IllegalStateException e) {
                                System.out.println("Erro " + e.getMessage());
                            }
                        }
                    });
                    break;
                case 3:
                    System.out.println("Informe a quantidade  de operações a serem desfeitas");
                    Integer qtdOperacoesDesfeitas = sc.nextInt();
                    if(qtdOperacoesDesfeitas > contadorDeOperacoes){
                        System.out.println("Quantidade de operações invalida");
                    } else{
                        pilha.pop();
                        contadorDeOperacoes--;
                    }
                    break;
                case 4:
                    System.out.println("Qual operação desejada? (Debito, Credito)");
                    String operacaoDesejada = sc.nextLine();
                    System.out.println("Informe o número da conta: ");
                    numeroConta = sc.nextInt();
                    System.out.println("Informe o valor: ");
                    Double valor = sc.nextDouble();
                    try{
                        fila.insert(new Operacoes(new ContaBancaria(numeroConta, valor), operacaoDesejada, valor));
                        contadorDeOperacoes++;
                    } catch (IllegalStateException e) {
                        System.out.println("Erro " + e.getMessage());
                    }
                    break;
                case 5:
                    if(fila.isEmpty()) System.out.println("Não tem operações agendadas");
                    else {
                            fila.poll();
                    }
                    break;
                case 6:
                    isMenuAtivo = false;
                    System.out.println("Programa finalizado!!");
                    break;
            }
        }

    }
}
