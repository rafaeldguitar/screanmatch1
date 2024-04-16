package exx.listas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cachorro();

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            // Agora você pode usar o objeto 'cachorro' como um Cachorro.
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }


        Produto produto1 = new Produto("Ar condicionado", 3000.00);
        Produto produto2 = new Produto("Aquecedor", 2000.00);
        Produto produto3 = new Produto("Ventilador", 150.00);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double somaDeProdutos = 0;
        for (Produto produto : listaProdutos) {
            somaDeProdutos += produto.getPreco();
        }

        double precoMedia = somaDeProdutos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedia);

        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(circulo);
        listaDeFormas.add(quadrado);

        for (Forma forma : listaDeFormas) {
            System.out.println("Área " + forma.calcularArea());
        }

        ContaBancaria conta1 = new ContaBancaria(101, 1500.00);
        ContaBancaria conta2 = new ContaBancaria(102, 2500.00);
        ContaBancaria conta3 = new ContaBancaria(103, 1800.00);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);

        ContaBancaria contaMaiorSaldo = listaDeContas.get(0);
        for (ContaBancaria conta : listaDeContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }
        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroDaConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
}
