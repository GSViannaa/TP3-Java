package Q10_11_12;

public class Esfera
{
    private double raio;

    public Esfera(double raio)
    {
        this.raio = raio;
    }

    public String calculaVolume()
    {
        return String.format("%.2f",(4/3) * Math.PI * Math.pow(raio, 3));
    }
}
