/**
 * O objetivo deste exercício é criar um programa em Java que conte quantos doces o filho pode comer enquanto a condição estabelecida pela mãe for verdadeira (ou seja, no máximo 3 doces).
 * Desenvolvedor: Maycon L M Souza
 * Data: 08/03/2026
 */
public class ContagemDoces
{
	public static void main(String[] args)
	{
		int contadorDoces = 1;

		while(contadorDoces < 4)
		{
			System.out.println("Doces comidos: " + contadorDoces);
			contadorDoces++;
		}
	}
}