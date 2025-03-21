package Q10_11_12;

public class Circulo
{
    private double raio;

    public Circulo(double raio)
    {
        this.raio = raio;
    }

    public String calcularArea()
    {
        return String.format("%.2f", Math.PI * Math.pow(raio, 2));
    }
}
