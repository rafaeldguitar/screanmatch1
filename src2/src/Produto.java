import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }



    public static void main(String[] args) {

        Produto banana = new Produto("Banana", 02.00, 5);
        Produto melancia = new Produto("Melancia", 10.00, 3);
        Produto leite = new Produto("Leite", 04.00, 10);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(banana);
        listaDeProdutos.add(melancia);
        listaDeProdutos.add(leite);
        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Produto na posição 0: " + listaDeProdutos.get(0).getNome());
    }




}