package br.com.alura.screenmatch.modelos;

public class Pessoas {
    private String nomeDaPessoa;
    private int idade;

    public Pessoas(String nomeDaPessoa, int idade) {
        this.nomeDaPessoa = nomeDaPessoa;
        this.idade = idade;
    }

    public String getNomeDaPessoa() {
        return nomeDaPessoa;
    }

    public void setNomeDaPessoa(String nomeDaPessoa) {
        this.nomeDaPessoa = nomeDaPessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return this.getNomeDaPessoa() + " (" + this.getIdade() + " anos)";
    }


}