package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");

        for (int i = 1; i <= 1000; i++){
            minhaMusica.reproduzir();
            if(i % 20 == 0){
                minhaMusica.curte();
            }
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("BolhaDev");
        podcast.setHost("Marcus Mendes");

        for (int i = 1; i <= 5000; i++){
            podcast.reproduzir();
            if(i % 5 == 0){
                podcast.curte();
            }
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(minhaMusica);
    }
}
