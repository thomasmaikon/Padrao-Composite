package Items;

public class MacaVerde extends Maca {
    private final String nome = "Maca Verde";
    private final double adicional = 0.5;

    public MacaVerde() {
        super ();
    }

    @Override
    public double GetPreco() {
        return super.GetPreco()+adicional;
    }

    @Override
    public void ExibirNomeProduto() {
        System.out.println(this.nome);
    }
}
