package primeiroCurso;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu filme favorito");
        String filme = leitor.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitor.nextInt();
        System.out.println("Digite sua avaliação para o filme");
        double avaliacao = leitor.nextDouble();
        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

    }
}
