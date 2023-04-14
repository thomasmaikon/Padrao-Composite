package teste;

import Items.Banana;
import Items.Maca;
import Items.MacaVerde;
import Items.Produto;
import Pedido.CaixaProdutos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ValidacaoProdutos {


    @Test
    public void TesteCriandoProdutoSimples(){
        Produto maca = new Maca();
        double valorEsperado = 3.0;
        assertEquals(valorEsperado,maca.GetPreco());
    }

    @Test
    public void TesteCriandoProdutoQueHerda(){
        Produto macaVerde = new MacaVerde();
        double valorEsperado = 3.5;
        assertEquals(valorEsperado, macaVerde.GetPreco());
    }

    @Test
    public void TesteCriandoProdutoComposto(){
        Produto maca = new Maca();
        Produto macaVerde = new MacaVerde();

        Produto caixa = new CaixaProdutos("Caixa com 2 Produtos").
                adicionarProduto(maca).
                adicionarProduto(macaVerde);

        double valorEsperado = 6.5;
        assertEquals(valorEsperado, caixa.GetPreco());
    }

    @Test
    public void TesteCriandoProdutoCompostoSimples(){
        Produto maca = new Maca();
        Produto macaVerde = new MacaVerde();
        Produto banana = new Banana();

        Produto caixa = new CaixaProdutos("Caixa com 2 Produtos").
                adicionarProduto(maca).
                adicionarProduto(macaVerde);

        Produto caixaMaior = new CaixaProdutos("Caixa que cabe mais produtos").
                adicionarProduto(banana).adicionarProduto(caixa);

        double valorEsperado = 7.5;
        assertEquals(valorEsperado, caixaMaior.GetPreco());
    }

    @Test
    public void TesteCriandoProdutoCompostoComposto(){
        Produto maca = new Maca();
        Produto macaVerde = new MacaVerde();
        Produto banana = new Banana();
        Produto banana2 = new Banana();

        Produto caixa = new CaixaProdutos("Caixa com 2 Produtos").
                adicionarProduto(maca).
                adicionarProduto(macaVerde);

        Produto caixa2 = new CaixaProdutos("Caixa com 2 banans").
                adicionarProduto(banana).adicionarProduto(banana2);

        Produto caixaDecaixas = new CaixaProdutos("Caixa Grandona").
                adicionarProduto(caixa).adicionarProduto(caixa2);

        double valorEsperado = 8.5;
        assertEquals(valorEsperado, caixaDecaixas.GetPreco());
    }

    @Test
    public void TesteCriandoProdutoCompostoComDesconto(){
        Produto maca = new Maca();
        Produto macaVerde = new MacaVerde();

        Produto banana = new Banana();
        Produto banana2 = new Banana();

        Produto caixa = new CaixaProdutos("Caixa com 2 Produtos").
                adicionarProduto(maca).
                adicionarProduto(macaVerde);

        Produto caixa2 = new CaixaProdutos("Caixa com 2 banans").
                adicionarProduto(banana).adicionarProduto(banana2);

        Produto caixa3 = new CaixaProdutos("Caixa com 2 macas").
                adicionarProduto(maca).adicionarProduto(maca);

        Produto caixaDecaixas = new CaixaProdutos("Caixa Grandona").
                adicionarProduto(caixa).
                adicionarProduto(caixa2).
                adicionarProduto(caixa3);

        double valorEsperado = 13.05;
        assertEquals(valorEsperado, caixaDecaixas.GetPreco());
    }
}