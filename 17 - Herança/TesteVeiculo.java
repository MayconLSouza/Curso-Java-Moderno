/**
 * Entender como a palavra-chave super é usada para chamar métodos da superclasse em Java.
 * Desenvolvedor: Maycon L M Souza
 * Data: 21/03/2026
 */
class Veiculo
{
    public void acelerar()
    {
        System.out.println("Veículo acelerando!");
    }
}

class Carro extends Veiculo
{
    public void acelerar()
    {
        System.out.println("Carro acelerando!");
        super.acelerar();
    }
}

public class TesteVeiculo
{
    public static void main (String[] args)
    {
        Carro c = new Carro();
        c.acelerar();
    }
}