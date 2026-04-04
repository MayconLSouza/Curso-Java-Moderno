/**
 * O objetivo deste exercício é criar uma calculadora funcional que execute operações matemáticas específicas.
 * Desenvolvedor: Maycon L M Souza
 * Data: 04/04/2026
 */
@FunctionalInterface
interface OperacaoMatematica
{
	public double executar(double x, double y);
}

public class Calculadora
{
	public static void main(String[] args)
	{
		OperacaoMatematica potencia = (x, y) -> Math.pow(x, y);
		System.out.println("Potência = " + potencia.executar(2, 10));

		OperacaoMatematica raiz = (x, y) -> Math.sqrt(x + y);
		System.out.println("Raiz = " + raiz.executar(25, 24));
	}
}