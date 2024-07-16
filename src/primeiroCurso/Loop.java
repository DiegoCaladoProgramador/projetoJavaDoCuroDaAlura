package primeiroCurso;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação para o filme");
            nota = leitor.nextDouble();
            mediaAvaliacao += nota;
        }

        mediaAvaliacao /= 3;
        System.out.println("Média de avaliações " + mediaAvaliacao);
    }
}
