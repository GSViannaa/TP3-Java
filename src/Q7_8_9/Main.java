package Q7_8_9;


import java.time.LocalDate;
import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {

        Conta conta = new Conta("Gabriel", 999, "BankBank", 1000, LocalDate.now().toString());

        conta.sacar(500);
        conta.depositar(1900);
        conta.calcularRendimento();

      System.out.println(conta.informacaoDaConta()) ;
    }
}
