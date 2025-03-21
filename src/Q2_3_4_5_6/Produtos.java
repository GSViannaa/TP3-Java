package Q2_3_4_5_6;

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


    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public double getPreco()
    {
        return preco;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque()
    {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque)
    {
        if (quantidadeEmEstoque > 0)
        {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }
        else
        {
            System.out.println("Quantidade invalida");
        }

    }





    public void exibirInformacoes(Produtos produto)
    {
        System.out.println("Nome: "+produto.getNome());
        System.out.println("Preco: "+produto.getPreco());
        System.out.println("Quantidade em estoque: "+produto.getQuantidadeEmEstoque());
    }
}
