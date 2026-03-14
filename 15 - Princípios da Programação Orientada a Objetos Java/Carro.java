/**
 * Crie uma classe Carro que possua três atributos: marcaDoCarro, modeloDoCarro e anoDoCarro. 
 * Implemente três construtores diferentes para a classe:
 * 1. Um construtor padrão que não recebe parâmetros.
 * 2. Um construtor que recebe marca e modelo.
 * 3. Um construtor que recebe marca, modelo e ano.
 * Desenvolvedor: Maycon L M Souza
 * Data: 14/03/2026
 */
public class Carro
{
	private String marcaDoCarro;
	private String modeloDoCarro;
	private int anoDoCarro;

	public Carro() 
	{
		this.marcaDoCarro = "Desconhecida";
		this.modeloDoCarro = "Desconhecido";
		this.anoDoCarro = 0;
	}

	public Carro(String marca, String modelo)
	{
		this.marcaDoCarro = marca;
		this.modeloDoCarro = modelo;
		this.anoDoCarro = 0;
	}

	public Carro(String marca, String modelo, int ano)
	{
		this.marcaDoCarro = marca;
		this.modeloDoCarro = modelo;
		this.anoDoCarro = ano;
	}

	public void exibirDetalhes()
	{
		System.out.println("Marca: " + marcaDoCarro + "\nModelo: " + modeloDoCarro + "\nAno: " + anoDoCarro + "\n");
	} 
}

class Aplicacao
{
	public static void main(String[] args)
	{
		Carro c1 = new Carro();
		Carro c2 = new Carro("Fiat", "Siena");
		Carro c3 = new Carro("Nissan", "Kicks", 2026);

		c1.exibirDetalhes();
		c2.exibirDetalhes();
		c3.exibirDetalhes();
	}
}