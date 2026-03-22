/**
 * Entender o uso da palavra-chave final para variáveis em Java.
 * Desenvolvedor: Maycon L M Souza
 * Data: 22/03/2026
 */
class FinalVariables
{
    final int NUMERO_MAXIMO = 100;
    final String MENSAGEM = "Hello World!";

    public void imprimirValoresFinais()
    {
        System.out.println(NUMERO_MAXIMO);
        System.out.println(MENSAGEM);
    }
}

public class TestFinalVariables 
{
    public static void main(String[] args) 
    {
        FinalVariables fv = new FinalVariables();    
        
        //fv.NUMERO_MAXIMO = 50;
        //fv.MENSAGEM = "Olá Mundo!";

        fv.imprimirValoresFinais();
    }
}
