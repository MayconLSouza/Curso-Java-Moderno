/**
 * O objetivo deste exercício é praticar a criação e utilização de métodos em Java, além de entender o uso da anotação @Deprecated.
 * Desenvolvedor: Maycon L M Souza
 * Data: 22/03/2026
 */
class MinhaClasse
{
    public int calcularSoma(int x, int y)
    {
        return x + y;
    }

    @Deprecated
    public int calcularProduto(int x, int y)
    {
        return x * y;
    }
}

public class TestDeprecated 
{
    public static void main(String[] args) 
    {
        MinhaClasse c = new MinhaClasse();
        
        System.out.println("Soma = " + c.calcularSoma(2, 3));
        System.out.println("Produto = " + c.calcularProduto(2, 3));
    }
}
