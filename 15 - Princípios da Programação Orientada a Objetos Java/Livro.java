/**
 * Crie uma classe Livro com os seguintes atributos: titulo, autor, anoPublicacao e preco. 
 * Utilize diferentes modificadores de acesso para cada atributo e implemente três construtores diferentes para a classe:
 * 1. Um construtor "padrão" que não recebe parâmetros.
 * 2. Um construtor que recebe titulo e autor. 
 * 3. Um construtor que recebe titulo, autor, anoPublicacao e preco.
 * Desenvolvedor: Maycon L M Souza
 * Data: 14/03/2026
 */
public class Livro
{
	public String titulo;
	private String autor;
	protected int anoPublicacao;
	double preco;

	public Livro()
	{
		this.titulo = "Desconhecido";
		this.autor = "Desconhecido";
		this.anoPublicacao = 0;
		this.preco = 0.0;
	}

	public Livro(String titulo, String autor)
	{
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = 0;
		this.preco = 0.0;
	}

	public Livro(String titulo, String autor, int anoPublicacao, double preco)
	{
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.preco = preco;
	}
}

class Aplicacao
{
	public static void main(String[] args)
	{
		Livro l1 = new Livro();
		Livro l2 = new Livro("1984", "George Orwell");
		Livro l3 = new Livro("Fundação", "Isaac Asimov", 1951, 50.0);

		System.out.println("Título: " + l1.titulo);
		// System.out.println("Autor: " + l1.autor);
		System.out.println("Ano de Publicação: " + l1.anoPublicacao);
		System.out.println("Preço: " + l1.preco);

		System.out.println("Título: " + l2.titulo);
		// System.out.println("Autor: " + l2.autor);
		System.out.println("Ano de Publicação: " + l2.anoPublicacao);
		System.out.println("Preço: " + l2.preco);

		System.out.println("Título: " + l3.titulo);
		// System.out.println("Autor: " + l3.autor);
		System.out.println("Ano de Publicação: " + l3.anoPublicacao);
		System.out.println("Preço: " + l3.preco);
	}
}