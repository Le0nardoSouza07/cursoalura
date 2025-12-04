package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;//Import foi usado pois a classe principal e classe filme NÃO ESTÃO NO MESMO PACOTE!
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão",1970);//Instanciar o objeto
//        meuFilme.setNome("O Poderoso Chefão");
//        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibirFichaTecnica();
        meuFilme.avaliacao(8);
        meuFilme.avaliacao(5);
        meuFilme.avaliacao(10);

        System.out.println("Total de Avaliações: "+meuFilme.getTotalDeAvaliacoes());
        System.out.println("Avaliação: "+meuFilme.fazMediaDasAvaliacoes());

        Serie lost = new Serie("Lost",2000);
//        lost.setNome("Lost");
//        lost.setAnoDeLancamento(2000);
        lost.exibirFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: "+lost.getDuracaoEmMinutos());

        Filme meuFilme2 = new Filme("Avatar",2023);//criei esse construtor que obriga a já colocar o nome do filme na hora da criação desse objeto
        //meuFilme2.setNome("Avatar 2");
//        meuFilme2.setAnoDeLancamento(2023);
        meuFilme2.setDuracaoEmMinutos(200);
        meuFilme2.setIncluidoNoPlano(true);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluiNaLista(meuFilme);
        calculadora.incluiNaLista(meuFilme2);
        calculadora.incluiNaLista(lost);
        System.out.println(calculadora.getTempoTotal());

        Episodio ep1 = new Episodio();
        ep1.setNumero(1);
        ep1.setSerie(lost);
        ep1.setTotalVisualizacoes(200);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(ep1);
        filtro.filtra(meuFilme);
        filtro.filtra(lost);

        var meuFilme3 = new Filme("Velozes e Furiosos 5",2012);//Var é um outro jeito de instanciar, sem ter que repetir o nome da classe nos dois lados
        //meuFilme3.setNome("Velozes e Furiosos 5");
        meuFilme3.setDuracaoEmMinutos(200);
//        meuFilme3.setAnoDeLancamento(2012);
        meuFilme3.avaliacao(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme); //método add adiciona coisas na lista
        listaDeFilmes.add(meuFilme2);
        listaDeFilmes.add(meuFilme3);
        System.out.println("Tamanho da lista: "+listaDeFilmes.size()); //size é para ver o tamanho da lista
        System.out.println("Primeiro filme: "+listaDeFilmes.get(0).getNome());//get é para pegar o filme que esta naquela posicao na lista, getNome é para pegar o nome do filme
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: "+listaDeFilmes.get(0).toString()); //toString que nós reescrevemos
    }
}