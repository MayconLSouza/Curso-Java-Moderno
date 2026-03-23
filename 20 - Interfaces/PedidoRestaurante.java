/**
 * Criar uma interface chamada PedidoRestaurante que define métodos para adicionar itens ao pedido e calcular o valor total.
 * Desenvolvedor: Maycon L M Souza
 * Data: 23/03/2026
 */
interface IPedidoRestaurante
{
	void adicionarItem(String item, double preco);
	int calcularTotal();
}

class Pedido implements IPedidoRestaurante
{
	private int precoTotal = 0;

	public void adicionarItem(String item, double preco)
	{
		precoTotal += preco;
		System.out.printf("%s $%.2f%n", item, preco);
	}

	public int calcularTotal()
	{
		return precoTotal;
	} 
}

public class PedidoRestaurante
{
	public static void main(String[] args)
	{
		Pedido p = new Pedido();

		p.adicionarItem("Hambúrguer", 22.50);
		p.adicionarItem("Batata frita", 5);
		p.adicionarItem("Refrigerante", 7.5);

		System.out.println("\nTotal $" + p.calcularTotal());
	}
}