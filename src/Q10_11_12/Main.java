package Q10_11_12;

public class Main
{
    public  static void main(String[] args)
    {

        Circulo circulo = new Circulo(3);
        Esfera esfera = new Esfera(5);

        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Esfera: " + esfera.calculaVolume());

    }
}
