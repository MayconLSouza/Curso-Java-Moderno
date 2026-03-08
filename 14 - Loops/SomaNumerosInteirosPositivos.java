/**
 * Escrever um programa Java que calcule a soma de todos os números inteiros positivos menores ou iguais a esse número.
 * Desenvolvedor: Maycon L M Souza
 * Data: 08/03/2026
 */
public class SomaNumerosInteirosPositivos
{
	public static void main(String[] args)
	{
		int limite = 10;
		int soma = 0;
		int i = 1;

		do
		{
			soma += i;
			i++;
		} while (i <= limite);

		System.out.println("Soma = " + soma);
	}
}