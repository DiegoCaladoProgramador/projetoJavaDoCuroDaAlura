package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {

    @SerializedName("Title")
    private String nome;

    @SerializedName("Year")
    private int anoDeLancamento;

    private int duracaoEmMinutos;

    private boolean incluiNoPlano;
    private double SomaAvaliacao;
    private int totalDeAvaliacoes;

    public Titulo(String nome, int ano){
        this.nome = nome;
        this.anoDeLancamento = ano;
    }

    public Titulo(TituloOmdb tituloOmdb) {
        this.nome = tituloOmdb.title();

        if (tituloOmdb.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Não Consegui converter o ano, por que tem mais de 4 caracteres");
        }
        this.anoDeLancamento = Integer.valueOf(tituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(tituloOmdb.runtime().substring(0, 2));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluiNoPlano() {
        return incluiNoPlano;
    }

    public void setIncluiNoPlano(boolean incluiNoPlano) {
        this.incluiNoPlano = incluiNoPlano;
    }

    public double getSomaAvaliacao() {
        return SomaAvaliacao;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Avaliacao: " + SomaAvaliacao);
        System.out.println("Total de Avaliacoes: " + totalDeAvaliacoes);
    }

    public void avalia(double nota){
        SomaAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return SomaAvaliacao / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "nome='" + nome + '\'' +
                ", anoDeLancamento=" + anoDeLancamento +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                '}';
    }
}
