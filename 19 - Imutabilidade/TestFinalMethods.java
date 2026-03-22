/**
 * Demonstrar o uso da palavra-chave final em métodos de classes Java.
 * Desenvolvedor: Maycon L M Souza
 * Data: 22/03/2026
 */
class Calculadora
{
    final int somar(int a, int b)
    {
        return a + b;
    }
}

class CalculadoraCientifica extends Calculadora
{
    /*
    public int somar(int a, int b)
    {
        return b + a;
    }
    */
}

public class TestFinalMethods 
{
    public static void main(String[] args) 
    {
        var c = new CalculadoraCientifica();    
        System.err.println(c.somar(2, 3));
    }
}
