package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.*;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
//        meuFilme.setNome("O poderoso chefão");
//        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
//        lost.setNome("Lost");
//        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
//        outroFilme.setNome("Avatar");
//        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
//        filmeDoPaulo.setNome("Dogville");
//        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        List<Titulo> lista = new LinkedList<>(); //LikedList pega menos memoria que ArrayLsit.
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof  Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Primeiro filme: " + lista.get(0).getNome());
        System.out.println(lista);

        Pessoas rafael = new Pessoas("Rafael Dias", 20);
//        rafael.setIdade(20);
//        rafael.setNomeDaPessoa("Rafael Dias");

        Pessoas joao = new Pessoas("João Pedro", 27);
//        joao.setNomeDaPessoa("João Pedro");
//        joao.setIdade(27);

        Pessoas cintia = new Pessoas("Cíntia", 54);
//        cintia.setNomeDaPessoa("Cíntia");
//        joao.setIdade(54);

        ArrayList<Pessoas> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(rafael);
        listaDePessoas.add(joao);
        listaDePessoas.add(cintia);
        System.out.println("Lista de pessoas: " + listaDePessoas.size());
        System.out.println("Primeiro nome da lista: " + listaDePessoas.get(0).getNomeDaPessoa());
        System.out.println(listaDePessoas);
        
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista); //ordena por ordem alfabetica
        System.out.println("Depois da ordenação: ");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de titulos" + lista);
        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados: " + lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento)); //vai comparar a lista por paremetro expecificado (getAnoDeLancamento)
        System.out.println("Ordenando por ano:");
        System.out.println(lista);
     }
}