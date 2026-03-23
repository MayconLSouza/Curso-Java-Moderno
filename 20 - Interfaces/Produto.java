/**
 * Praticar o uso de interfaces em Java para definir comportamentos e implementar uma classe capaz de controlar o estoque de um produto, permitindo consultar informações e atualizar quantidades disponíveis.
 * Desenvolvedor: Maycon L M Souza
 * Data: 23/03/2026
 */
interface IProduto
{
	void adicionarQuantidade(int quantidade);
	void removerQuantidade(int quantidade);
	String getNome();
	int getQuantidade();
}

class ProdutoImpl implements IProduto
{
	private String nome; 
	private int quantidade;
	
	ProdutoImpl(String nome, int quantidade)
	{
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public void adicionarQuantidade(int quantidade)
	{
		this.quantidade += quantidade; 
	}

	public void removerQuantidade(int quantidade)
	{
		this.quantidade -= quantidade; 
	}

	public String getNome()
	{
		return nome;
	}

	public int getQuantidade()
	{
		return quantidade;
	}
}

public class Produto
{
	public static void main(String[] args)
	{
		ProdutoImpl p = new ProdutoImpl("Perfume", 50);

		p.adicionarQuantidade(30);
		p.removerQuantidade(20);

		System.out.println("Produto = " + p.getNome() + ", Quantidade = " + p.getQuantidade());
	}
}