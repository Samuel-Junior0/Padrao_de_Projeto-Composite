package model;

import interfaces.ItemLoja;

import java.util.ArrayList;
import java.util.List;

public class Kit implements ItemLoja {
    private final String nome;
    private final List<ItemLoja> lista = new ArrayList<>();

    public Kit(String nome) {
        this.nome = nome;
    }

    public void adiconar(ItemLoja item) {
        System.out.printf("Adicionando %s...\n", item.getNome());
        lista.add(item);
    }

    public void remover(ItemLoja item) {
        System.out.printf("Removendo %s...\n", item.getNome());
        lista.remove(item);
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (ItemLoja item : lista) {
            total += item.getPreco();
        }
        return total;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.printf("%s+ Kit: %s | Preço: %.2f\n", prefixo, this.nome, getPreco());
        for(ItemLoja item : lista) {
            item.exibir(prefixo + "     ");
        }
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
