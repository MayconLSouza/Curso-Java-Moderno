/**
 * Este exercício tem como objetivo testar seu entendimento sobre encapsulamento em Java, utilizando os modificadores de acesso public e private. 
 * Você criará uma classe Produto com atributos que representam as características de um produto, utilizando apenas construtores para inicializar os atributos.
 * Desenvolvedor: Maycon L M Souza
 * Data: 14/03/2026
 */
public class Produto
{
	private String nome;
	private double preco;
	private int quantidadeEmEstoque;

	public Produto(String nome, double preco, int quantidadeEmEstoque)
	{
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public String toString()
	{
		return "Nome: " + nome + "\nPreço: $" + preco + "\nQuantidade em estoque: " + quantidadeEmEstoque;
	}
}

class Main
{
	public static void main (String[] args)
	{
		Produto produto = new Produto("celular", 2000.0, 10);
		System.out.println(produto.toString());
	}
}