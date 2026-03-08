/**
 * Defina um número inteiro fixo, verifique a paridade e exiba uma mensagem apropriada.
 * Desenvolvedor: Maycon L M Souza
 * Data: 08/03/2026
 */ 
public class VerificacaoNumeroPar
{
	public static void main (String[] args)
	{
		int numero = 10;

		System.out.println(((numero % 2) == 0) ? "O número é par." : "O número é ímpar.");  
	}
}