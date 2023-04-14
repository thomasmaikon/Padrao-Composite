package Items;

public class Banana implements Produto{
    private final String nome = "banana";
    private final double preco = 1.0;

    public Banana(){}

    @Override
    public void ExibirNomeProduto() {
        System.out.println(this.nome);
    }

    @Override
    public double GetPreco() {
        return this.preco;
    }
}
