import Q1.Aluno;
import Q2.Produtos;

public class Main
{
    public static void main(String[] args)
    {
        Produtos produto = new Produtos("Bola", 20,10);

        produto.alterarPreco(25);
        produto.altrarQuantidadeEmEstoque(30);
        produto.exibirInformacoes();
    }
}