package primeiroCurso;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Diego Calado";
        String tipoConta= "Corrente";
        double saldo = 2500;
        String menuInicial = """
                ****************************************************
                Dados iniciais do cliente:
                
                Nome:           %s
                Tipo conta:     %s
                Saldo incial:   %.2f
                ****************************************************
                """.formatted(nome, tipoConta, saldo);

        String menu = """
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;

        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        System.out.println(menuInicial);
        while (opcao != 4) {
            System.out.println(menu);
            opcao = entrada.nextInt();
            if(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4){
                System.out.println("Opção inválida");
            }
            else if(opcao == 1){
                System.out.println("o saldo atual é R$ "+ saldo);
            }
            else if(opcao == 2){
                System.out.println("Informe o valor a receber:");
                double valorRecebido = entrada.nextDouble();
                saldo += valorRecebido;
                System.out.println("Saldo atualizado R$ "+ saldo);
            }
            else if(opcao == 3){
                System.out.println("Informe o valor a sacar:");
                double valorSacar = entrada.nextDouble();
                if(valorSacar > saldo){
                    System.out.println("Não há saldo suficiente para fazer esse saque");
                }
                else{
                    saldo -= valorSacar;
                    System.out.println("Saldo atualizado R$ "+ saldo);
                }
            }
        }
    }
}
