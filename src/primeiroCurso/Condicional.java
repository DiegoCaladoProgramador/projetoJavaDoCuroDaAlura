package primeiroCurso;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento > 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.printf("br.com.alura.screenmatch.modelos.Filme retrô que vale a pena assistir");
        }

        if(incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("br.com.alura.screenmatch.modelos.Filme liberado");
        }else{
            System.out.println("Deve pagar a locação");
        }
    }
}
