/**
 * O objetivo deste exercício é demonstrar o uso de polimorfismo em uma hierarquia de classes relacionadas a veículos.
 * Desenvolvedor: Maycon L M Souza
 * Data: 29/03/2026
 */
abstract class Veiculo
{
	private String placa;
	private int ano;

	public Veiculo(String placa, int ano)
	{
		this.placa = placa;
		this.ano = ano;
	}

	public void exibirInformacoes()
	{
		System.out.printf("Placa %s, Ano %d%n", placa, ano);
	}
}

class Onibus extends Veiculo
{
	private int assentos;

	public Onibus(String placa, int ano, int assentos)
	{
		super(placa, ano);
		this.assentos = assentos;
	}

	@Override
	public void exibirInformacoes()
	{
		super.exibirInformacoes();
		System.out.printf("Assentos %d%n", assentos);
	}
}

class Caminhao extends Veiculo
{
	private int eixos;

	public Caminhao(String placa, int ano, int eixos)
	{
		super(placa, ano);
		this.eixos = eixos;
	}

	@Override
	public void exibirInformacoes()
	{
		super.exibirInformacoes();
		System.out.printf("Eixos %d%n", eixos);		
	}
}

public class GerenciadorVeiculos
{
	public static void main(String[] args)
	{
		var onibus = new Onibus("ABC1234", 2020, 50);
		var caminhao = new Caminhao("EFG5678", 2019, 8);

		onibus.exibirInformacoes();
		caminhao.exibirInformacoes();
	}
}
