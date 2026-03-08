/**
 * Este exercício envolve a criação de um programa em Java que calcula a soma dos números de 1 a 10 usando um loop for.
 * Desenvolvedor: Maycon L M Souza
 * Data: 08/03/2026
 */
public class SomaValoresAcumulados
{
	public static void main(String[] args)
	{
		int soma = 0;

		for(int i = 1; i < 11; i++)
		{
			soma += i;
		}

		System.out.println("Soma = " + soma);
	}
}