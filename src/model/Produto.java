package model;

import interfaces.ItemLoja;

public class Produto implements ItemLoja {
    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    public void exibir(String prefixo) {
        System.out.printf("%s-Produto: %s | Preço: R$%.2f\n", prefixo, this.nome, this.preco);
    }
}
