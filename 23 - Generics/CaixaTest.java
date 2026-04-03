/**
 * O objetivo deste exercício é praticar a criação e uso de uma classe genérica chamada Caixa.
 * Desenvolvedor: Maycon L M Souza
 * Data: 03/04/2026
 */
class Caixa<T>
{
	private T[] array;

	@SuppressWarnings("unchecked")
	public Caixa(int capacidade)
	{
		this.array = (T[]) new Object[capacidade];
	}

	public void adicionar(T elemento, int indice)
	{
		array[indice] = elemento;
	}

	public T obter(int indice)
	{
		return array[indice];
	}
}

public class CaixaTest
{
	public static void main(String[] args)
	{
		Caixa<Double> precos = new Caixa<>(2);
		Caixa<Character> letras = new Caixa<>(3);

		precos.adicionar(7.50, 0);
		precos.adicionar(18.0, 1);

		letras.adicionar('a', 0);
		letras.adicionar('b', 1);
		letras.adicionar('c', 2);

		System.out.println("[0] = " + precos.obter(0));
		System.out.println("[1] = " + precos.obter(1));

		System.out.println("\n[0] = " + letras.obter(0));
		System.out.println("[1] = " + letras.obter(1));
		System.out.println("[2] = " + letras.obter(2));
	}
}