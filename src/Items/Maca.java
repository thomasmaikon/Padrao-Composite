package Items;

public class Maca implements Produto{
    private final String nome = "Maca";
    private final double preco = 3.0;

    public Maca(){}

    @Override
    public double GetPreco() {
        return this.preco;
    }

    @Override
    public void ExibirNomeProduto() {
        System.out.println(this.nome);
    }
}
