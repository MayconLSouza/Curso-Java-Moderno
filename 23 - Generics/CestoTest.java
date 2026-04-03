/**
 * O objetivo deste exercício é entender e aplicar conceitos de classes genéricas em Java. Você irá criar classes para representar diferentes tipos de objetos e um cesto genérico que pode armazenar qualquer tipo de objeto.
 * Desenvolvedor: Maycon L M Souza
 * Data: 03/04/2026
 */
class Peixe 
{
	private String nome;
	private int tamanho;

	public Peixe(String nome, int tamanho)
	{
		this.nome = nome;
		this.tamanho = tamanho;
	}

	public String getNome()
	{
		return nome;
	}

	public int getTamanho()
	{
		return tamanho;
	}
}

class Polvo 
{
	private String nome;
	private int tentaculos;

	public Polvo(String nome, int tentaculos)
	{
		this.nome = nome;
		this.tentaculos = tentaculos;
	}

	public String getNome()
	{
		return nome;
	}

	public int getTentaculos()
	{
		return tentaculos;
	}
}

class Cesto<T>
{
	private T conteudo;

	public void guardar(T conteudo)
	{
		this.conteudo = conteudo;
	}

	public T pegar()
	{
		return conteudo;
	}
}

public class CestoTest
{
	public static void main(String[] args)
	{
		Cesto<Peixe> cestoDePeixe = new Cesto<>();
		cestoDePeixe.guardar(new Peixe("Atum", 2));

		Cesto<Polvo> cestoDePolvo = new Cesto<>();
		cestoDePolvo.guardar(new Polvo("Polvo Paul", 8));

		if(cestoDePeixe.pegar() instanceof Peixe)
		{
			Peixe peixe = (Peixe) cestoDePeixe.pegar();
			System.out.println(peixe.getNome());
			System.out.println(peixe.getTamanho());
		}

		if(cestoDePolvo.pegar() instanceof Polvo)
		{
			Polvo polvo = (Polvo) cestoDePolvo.pegar();
			System.out.println("\n" + polvo.getNome());
			System.out.println(polvo.getTentaculos());
		}
	}
}