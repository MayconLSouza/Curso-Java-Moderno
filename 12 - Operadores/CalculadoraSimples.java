/**
 * Criar um programa Java que realiza operações aritméticas básicas usando os operadores mencionados.
 * Desenvolvedor: Maycon L M Souza
 * Data: 07/03/2026
 */ 
public class CalculadoraSimples
{
	public static void main (String[] args)
	{
		int a = 10;
		int b = 2;

		int soma = a + b;
		int subtracao = a - b;
		int multiplicacao = a * b;
		float divisao = a / b;
		int resto = a % b;

		System.out.printf("""
						  Soma = %d 
						  Subtração = %d 
						  Multiplicação = %d 
						  Divisão = %.1f 
						  Resto = %d
						  """, soma, subtracao, multiplicacao, divisao, resto);
	}
}