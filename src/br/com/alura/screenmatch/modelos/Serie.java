package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {// classe serie que herda todas os atributos e metodos da classe titulo
    private int temporadas; //agora aqui sao os atributos e metodos PROPRIOS da classe serie
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) { //Construtor igual da classe filme, herdando da classe mae titulo
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override //é uma anotação que mostra que estamos sobrescrevendo um metodo de outra classe que herdamos. É uma boa prática manter isso no codigo.
    public int getDuracaoEmMinutos() {
        return temporadas*episodiosPorTemporada*minutosPorEpisodio;
    }

    @Override
    public int getClassificacao() { //Implementa a interface classificavel
        return 0;
    }

    @Override
    public String toString() { //Reescrevemos o método toString da classe java lang para que quando chamarmos apareca desse jeito
            return "Série: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
        }
    }

