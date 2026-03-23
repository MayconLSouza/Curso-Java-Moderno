/**
 * O objetivo deste exercício é praticar a implementação de interfaces em Java e o uso de métodos padrão (default) em interfaces.
 * Desenvolvedor: Maycon L M Souza
 * Data: 23/03/2026
 */
interface IVeiculo
{
	void iniciar();
	void parar();

	default void buzinar()
	{
		System.out.println("Buzinando");
	}
}

class Carro implements IVeiculo
{
	public void iniciar()
	{
		System.out.println("Ligando Carro...");
	}

	public void parar()
	{
		System.out.println("Desligando Carro...");
	}
}

class Caminhao implements IVeiculo
{
	public void iniciar()
	{
		System.out.println("Ligando Caminhão...");
	}

	public void parar()
	{
		System.out.println("Desligando Caminhão...");
	}
}

public class Veiculo
{
	public static void main(String[] args)
	{
		Carro carro = new Carro();
		Caminhao caminhao = new Caminhao();

		carro.iniciar();
		carro.buzinar();

		caminhao.iniciar();
		caminhao.buzinar();
	}
}