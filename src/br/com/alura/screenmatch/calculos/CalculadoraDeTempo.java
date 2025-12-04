package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void incluiNaLista(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }                                            O nome disso é SOBRECARGA DE MÉTODOS, pois o mesmo metodo
//    public void incluiNaLista(Serie s){          foi escrito duas vezes, porem recebendo parametros diferentes.
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void incluiNaLista(Titulo titulo){
        tempoTotal+=titulo.getDuracaoEmMinutos();
    }

}
