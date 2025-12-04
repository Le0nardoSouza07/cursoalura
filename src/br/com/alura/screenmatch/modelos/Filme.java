package br.com.alura.screenmatch.modelos;// A minha classe filme faz parte do pacote modelos

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    //Classe filme que herdou atributos e metodos da classe titulo
    private String diretor; //agora aqui sao os atributos e metodos PROPRIOS da classe filme

    public Filme(String nome,int anoDeLancamento) { //construtor pede que para criar um novo objeto da classe filme, precisa ser inserido um nome.
        super(nome, anoDeLancamento);
        //this.diretor = diretor;   podemos usar o construtor da classe mãe e adicionar mais parametros que vão precisar ser inseridos
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public int getClassificacao() {
        return (int) fazMediaDasAvaliacoes() / 2; // fiz o (int) pq o metodo fazMedia é double, porem eu quero so a parte inteira
        // entao eu forco a IDE para ela entender oq eu quero, o nome disso é cast
    }

    @Override
    public String toString() { //Reescrevemos o método toString da classe java lang para que quando chamarmos apareca desse jeito
        return "Filme: "+this.getNome() + " ("+this.getAnoDeLancamento()+")";
    }
}
