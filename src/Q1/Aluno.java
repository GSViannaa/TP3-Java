package Q1;

public class Aluno
{
    private String nome;
    private int idade;

    public Aluno(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    public String PrintNomeEIdade()
    {
        return "Aluno: "+this.nome+ " Idade: "+this.idade;
    }
}
