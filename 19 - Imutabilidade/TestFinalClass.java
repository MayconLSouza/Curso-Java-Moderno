/**
 * Demonstrar o uso da palavra-chave final em uma classe Java.
 * Desenvolvedor: Maycon L M Souza
 * Data: 22/03/2026
 */
/*final*/ class Veiculo
{
    public void ligarMotor()
    {
        System.out.println("Motor do veículo ligado.");
    }
}

class Carro extends Veiculo
{
    public void ligarMotor()
    {
        System.out.println("Motor do carro ligado.");
    }
}

public class TestFinalClass 
{
    public static void main(String[] args) {
        var c = new Carro();
        c.ligarMotor();
    }
}
