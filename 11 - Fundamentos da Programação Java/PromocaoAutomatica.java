/**
 * Criar um programa Java que demonstre a promoção automática de tipos em expressões.
 * Desenvolvedor: Maycon L M Souza
 * Data: 07/03/2026
 */ 
public class PromocaoAutomatica
{
	public static void main (String[] args)
	{
		byte a = 8;
		short b = 16;
		char c = 'c';
		int d = 32;
		long e = 64L;
		float f = 32f;
		double g = 64;

		double soma = a + b + d + e + f + g;

		System.out.printf("Soma = %.1f \nChar = %c", soma, c);
	}
}
