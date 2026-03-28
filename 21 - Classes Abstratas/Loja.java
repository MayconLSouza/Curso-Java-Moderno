/**
 * O objetivo deste exercício é praticar a criação e utilização de classes abstratas e a implementação de métodos concretos em Java.
 * Desenvolvedor: Maycon L M Souza
 * Data: 28/03/2026
 */
abstract class ALoja
{
	private String cnpj;
	private String razaoSocial;
	private boolean aberta;

	ALoja(String cnpj, String razaoSocial)
	{
		this.cnpj = cnpj;
		this.razaoSocial =  razaoSocial;
		this.aberta = false;
	}

	void abrir()
	{
		aberta = true;
		System.out.println("Porta aberta? " + aberta);
	}

	void fechar()
	{
		aberta = false;
		System.out.println("Porta aberta? " + aberta);
	}
}

class LojaComercial extends ALoja
{
	LojaComercial(String cnpj, String razaoSocial)
	{
		super(cnpj, razaoSocial);
	}
}

public class Loja 
{
	public static void main(String[] args)
	{
		var loja = new LojaComercial("12.345.678/9100-11", "Java Enterprise");

		loja.abrir();
		loja.fechar();
	}
}