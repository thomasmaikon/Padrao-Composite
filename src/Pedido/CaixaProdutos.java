package Pedido;

import Items.Produto;

import java.util.ArrayList;
import java.util.List;

public class CaixaProdutos implements Produto {
    private String nomeCaixa;
    private List<Produto> caixaProdutos;
    private final double desconto = 10; // representa 10%
    public CaixaProdutos(String nomeCaixa) {
        this.nomeCaixa = nomeCaixa;
        this.caixaProdutos = new ArrayList<>();
    }

    @Override
    public void ExibirNomeProduto() {
        System.out.println("Caixa [" + this.nomeCaixa + "] comtem:");
        for( Produto produto : caixaProdutos){
            produto.ExibirNomeProduto();
        }
    }

    @Override
    public double GetPreco() {
        double total = 0;

        for( Produto produto : caixaProdutos){
            total += produto.GetPreco();
        }
        if (caixaProdutos.size() > 2){
            return total - total * 10 / 100;
        }
        return total;
    }

    public String getNomeCaixa() {
        return nomeCaixa;
    }

    public CaixaProdutos setNomeCaixa(String nomeCaixa) {
        this.nomeCaixa = nomeCaixa;
        return this;
    }

    public List<Produto> getCaixaProdutos() {
        return caixaProdutos;
    }

    public CaixaProdutos adicionarProduto(Produto produto) {
        this.caixaProdutos.add(produto);
        return this;
    }
}
