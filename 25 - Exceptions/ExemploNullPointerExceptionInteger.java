/**
 * O objetivo deste exercício é entender como lidar com a exceção NullPointerException ao trabalhar com objetos Integer em Java.
 * Desenvolvedor: Maycon L M Souza
 * Data: 04/04/2026
 */
public class ExemploNullPointerExceptionInteger
{
	public static void main(String[] args)
	{
		try
		{
			Integer numero = null;
			System.out.println(numero.toString());
		}
		catch (NullPointerException e)
		{
			System.err.println("Error: " + e.getMessage());
		}
		
	}
}