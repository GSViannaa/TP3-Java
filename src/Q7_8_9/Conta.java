package Q7_8_9;

public class Conta
{
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;


    public Conta(String titular, int numero, String agencia, double saldo, String dataAbertura)
    {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public void sacar(double valor)
    {
        if (valor <= saldo)
        {

            System.out.println("Saldo antes do Saque: " + saldo);

            saldo -= valor;
            System.out.println("Saldo atual: " + saldo);
        }
        else
        {
            System.out.println("Saldo insuficiente");
        }

    }

    public  void depositar(double valor)
    {
        System.out.println("Saldo antes do deposito: " + saldo);

        saldo += valor;
        System.out.println("Saldo atual: " + saldo);
    }

    public double calcularRendimento()
    {
        return saldo * 0.1;
    }

    public String informacaoDaConta()
    {
        return String.format("\nTitular: %s\nNúmero: %d\nAgência: %s\nSaldo atual: %.2f\nData de Abertura: %s",
                titular, numero, agencia, saldo, dataAbertura);
    }
}
