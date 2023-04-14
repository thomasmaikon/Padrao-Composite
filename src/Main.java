import Items.Maca;
import Items.Produto;

public class Main {

    public static void main(String args[]) {
        Produto maca = new Maca();

        System.out.println("Produto Criado: ");
        maca.ExibirNomeProduto();
        System.out.println("Preco: " + maca.GetPreco());


    }
}
