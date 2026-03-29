/**
 * O objetivo deste exercício é criar uma calculadora polimórfica em Java que pode realizar operações de adição, subtração, multiplicação e divisão.
 * Desenvolvedor: Maycon L M Souza
 * Data: 29/03/2026
 */
import java.util.Scanner;
abstract class Operacao
{
	public abstract double calcular(int x, int y);
}

class Soma extends Operacao
{
	@Override
	public double calcular(int x, int y)
	{
		return x + y;
	}
}

class Subtracao extends Operacao
{
	@Override
	public double calcular(int x, int y)
	{
		return x - y;
	}
}

class Multiplicao extends Operacao
{
	@Override
	public double calcular(int x, int y)
	{
		return x * y;
	}
}

class Divisao extends Operacao
{
	@Override
	public double calcular(int x, int y)
	{
		return x / y;
	}
}

public class Calculadora
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("First integer: ");
		int x = sc.nextInt();

		System.out.print("Second integer: ");
		int y = sc.nextInt();

		sc.close();

		var add = new Soma();
		var sub = new Subtracao();
		var mul = new Multiplicao();
		var div = new Divisao();

		System.out.println("Soma = " + add.calcular(x, y));
		System.out.println("Subtracao = " + sub.calcular(x, y));
		System.out.println("Multiplicao = " + mul.calcular(x, y));
		System.out.println("Divisao = " + div.calcular(x, y));
	}
}