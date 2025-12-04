package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Titulo implements Comparable<Titulo>{ //Precisamos implementar essa interface para podermos ordenar listas de objetos da classe titulo
    private String nome; //Aqui sao os atributos que todo filme tem.
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes; //private é usado para que nenhuma outra classe possa acessar esse atributo
    private int totalDeAvaliacoes;//private é usado para que nenhuma outra classe possa acessar esse atributo
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) { //Construtor usado para a classe Titulo, obriga que para criarmos um objeto dessa classe, ja temos que colocar o nome e o ano de lançamento
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome; //THIS é usado para nao confundir o atributo da classe com a variavel quando elas tem o mesmo nome
    }

    public void setAnoDeLancamento(int anoDeLancamento) {

        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {

        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {

        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){ //MÉTODO ACESSOR (GET), uma forma de que o usuario consiga ver o total de avaliações, mas sem mexer diretamente no atributo

        return totalDeAvaliacoes;
    }

    public void exibirFichaTecnica(){ //void é usado no metodo, quando a sua função é executar uma ação, sem ter que fornecer um resultado
        System.out.println("Nome do Filme: "+nome);
        System.out.println("Ano de Lançamento: "+anoDeLancamento);
        System.out.println("Duração em Minutos: "+duracaoEmMinutos);
        System.out.println("Incluido no Plano: "+incluidoNoPlano);

    }
    public void avaliacao(double nota){ //public é usado para que outra classe que não esta no mesmo pacote possa usar.
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }
    public double fazMediaDasAvaliacoes(){ //nao se usa void, quando a função do metodo é fornecer uma informação, responder uma pergunta ou calcular um valor.
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) { // o COMPARE TO é um método que define o critério de comparação entre os objetos, nesse caso o critério foi a ordem alfabética
        return this.getNome().compareTo(outroTitulo.getNome()); //Implementamos a interface comparable e escrevemos como vai funcionar com objeto da classe Titulo
    }
}
