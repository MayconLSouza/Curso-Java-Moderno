/**
 * Demonstrar o uso da anotação @SuppressWarnings para suprimir avisos do compilador relacionados a tipos de dados não verificados.
 * Desenvolvedor: Maycon L M Souza
 * Data: 22/03/2026
 */
class ExemploDepreciado 
{
    @Deprecated
    public void metodoObsoleto()
    {
        System.out.println("Obsoleto!");
    }    
}

public class TestSuppressWarnings
{
    @SuppressWarnings("deprecation")
    public static void main(String[] args) 
    {
        var ex = new ExemploDepreciado();
        ex.metodoObsoleto();
    }
}