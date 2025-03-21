package Q2;

public class Produtos
{
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;


    public Produtos(String nome, double preco, int quantidadeEmEstoque)
    {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void alterarPreco(double precoNovo)
    {
        this.preco = precoNovo;
    }

    public void altrarQuantidadeEmEstoque(int quantidadeAdicionada)
    {
        if (quantidadeAdicionada >  0)
        {
            this.quantidadeEmEstoque = quantidadeAdicionada;
        }
        else
        {
            System.out.println("Quantidade invalida");
        }
    }

    public void exibirInformacoes()
    {
        System.out.println("Nome: "+this.nome);
        System.out.println("Preco: "+this.preco);
        System.out.println("Quantidade em estoque: "+this.quantidadeEmEstoque);
    }
}
