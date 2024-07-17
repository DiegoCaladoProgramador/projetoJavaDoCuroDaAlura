package br.com.alura.compras.principal;

import br.com.alura.compras.modelos.CartaoDeCredito;
import br.com.alura.compras.modelos.Compra;
import java.util.Comparator;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double limiteCartao, valor;
        String descricao;
        int operador = 1;
        System.out.println("Digite o limite do cartão:");
        limiteCartao = entrada.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limiteCartao);
        while (operador != 0){
            System.out.println("Digite a descrição da compra:");
            descricao = entrada.next();
            System.out.println("Digite o valor da compra:");
            valor = entrada.nextDouble();
            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.realizaCompra(compra);
            if (!compraRealizada){
                System.out.println("Saldo insuficiente!");
                break;
            }
            System.out.println("Digite 0 para sair ou 1 para continuar");
            operador = entrada.nextInt();
            while (operador != 1 && operador != 0){
                System.out.println("Número inválido. Digite 0 para sair ou 1 para continuar");
                operador = entrada.nextInt();
            }
        }
        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:");
        System.out.println(" ");
        cartao.getCompras().sort(Comparator.comparing(Compra::getValor));
        for(Compra compra:cartao.getCompras()){
            System.out.println(compra);
        }
        System.out.println(" ");
        System.out.println("***********************");
        System.out.println("saldo do cartão: " + cartao.getSaldo());
    }
}
