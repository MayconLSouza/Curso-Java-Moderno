/**
 * Demonstrar o uso correto da anotação @Override para sobrescrever métodos em classes Java e entender os problemas que podem surgir sem ela.
 * Desenvolvedor: Maycon L M Souza
 * Data: 22/03/2026
 */
class SuperClasse
{
    public void imprime()
    {
        System.out.println("Imprime");
    }
}

class MinhaClasse extends SuperClasse
{
    @Override
    public void imprime()
    {
        System.out.println("Imprime diferente");
    } 
}

public class TestOverride 
{
    public static void main(String[] args) 
    {
        MinhaClasse c = new MinhaClasse();
        c.imprime();
    }
}
