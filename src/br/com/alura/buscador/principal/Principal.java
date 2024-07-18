package br.com.alura.buscador.principal;

import br.com.alura.buscador.modelos.ConsultaCep;
import br.com.alura.buscador.modelos.Endereco;
import br.com.alura.buscador.modelos.GeradorDeArquivo;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite o CEP: ");
        String cep = leitor.nextLine();

        try{
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.gerarArquivoJson(novoEndereco);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}
