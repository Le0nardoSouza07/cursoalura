package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão",1970);//método construtor que nos obrigou a instanciar um objeto já com nome e ano de lançamento
        Serie lost = new Serie("Lost",2000);
        Filme meuFilme2 = new Filme("Avatar",2023);
        var meuFilme3 = new Filme("Velozes e Furiosos 5",2012);

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(meuFilme); //método add adiciona coisas na lista
        listaDeAssistidos.add(meuFilme2);
        listaDeAssistidos.add(meuFilme3);
        listaDeAssistidos.add(lost);
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avaliacao(10);

        Filme outro = new Filme("John Wick", 2014);
        outro.avaliacao(9);

        Serie serie = new Serie("La Casa de Papel", 2017);

        List<Titulo> lista = new LinkedList<>(); //a interface List é bom para ser usada na criação de listas, porque te deixa a vontade para escolhar qualquer tipo de listas
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);

        for(Titulo item : lista) { //FOREACH é um for um pouco diferente e mais eficiente, porque voce nao precisa saber o tamanho que tem que ser seu laço
            System.out.println("Nome: " +item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) { //INSTANCEOF é uma palavra chave que verifica se item é uma instancia da Classe filme
                System.out.println("Classificação: " +filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>(); //lista de objetos da classe String
        buscaPorArtista.add("Tom Cruise");
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Leonardo Dicaprio");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista); //Classe collections tem o metodo sort que ordena por ordem alfabética.
        System.out.println("Depois da ordenação : "+buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);//agora a lista que é um ArrayList de objetos da classe titulo, pode ser comparavel, pois implementamos a interface Comparable na nossa classe
        System.out.println(lista);
        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento)); //O bom de usar o Comparator.comparing() é que voce nao precisa implementar a interface Comparable em nenhuma classe
        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por Ano: "+ lista);
        System.out.println("Ordenando por Ano: "+ listaDeAssistidos);

        Scanner input = new Scanner(System.in);
        System.out.println();



//        for (Titulo item: listaDeAssistidos){ //FOREACH é um for um pouco diferente
//            System.out.println(item.getNome());
//            if (item instanceof Filme filme){ //INSTANCEOF é uma palavra chave que verifica se item é uma instancia da Classe filme
//                System.out.println("Classificação "+filme.getClassificacao());
//            }
//            Filme filme = (Filme) item; //aqui a gente forçou para a IDE entender que o item é um filme, usando o cast()
//            System.out.println("Classificação "+filme.getClassificacao());//agora esta dando certo, pq eu disse que item é um filme
        }
    }

