/**
 * O objetivo deste exercício é entender como tratar a exceção ArrayIndexOutOfBoundsException em Java.
 * Desenvolvedor: Maycon L M Souza
 * Data: 04/04/2026
 */
public class ExemploArrayIndexOutOfBoundsException
{
	public static void main(String[] args)
	{
		int[] array = {0, 1, 2};

		try
		{
			System.out.println(acessarElemento(array, 3));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Error: " + e.getMessage());
		}
	}

	public static int acessarElemento(int[] array, int indice) throws ArrayIndexOutOfBoundsException
	{
		return array[indice];
	}
}