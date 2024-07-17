package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String Diretor;

    public Filme (String nome, int ano){
        super(nome, ano);
    }

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String diretor) {
        Diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int )pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getDiretor() + " (" + this.getAnoDeLancamento() + ")" ;
    }
}
