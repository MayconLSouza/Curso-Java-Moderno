/**
 * O objetivo deste exercício é criar um programa em Java que, com base em um número fornecido pelo usuário (representando o nível de satisfação), determine e exiba o feedback correspondente.
 * Desenvolvedor: Maycon L M Souza
 * Data: 08/03/2026
 */
public class NivelSatisfacao
{
	public static void main (String[] args)
	{
		int nivel = 5;

		switch(nivel)
		{
			case 1 -> System.out.println("Muito insatisfeito");

			case 2 -> System.out.println("Insatisfeito");

			case 3 -> System.out.println("Neutro");

			case 4 -> System.out.println("Satisfeito");

			case 5 -> System.out.println("Muito Satisfeito");

			default -> System.out.println("Opção Inválida");
		}
	}
}