/**
 * Este exercício tem como objetivo demonstrar a diferença entre passagem por valor e passagem por referência em Java. 
 * Você irá criar dois métodos: um que tenta modificar um valor primitivo e outro que modifica um objeto.
 * Desenvolvedor: Maycon L M Souza
 * Data: 14/03/2026
 */
public class Personagem
{
	String nome;
	int nivelDePoder;

	public Personagem(String nome, int nivelDePoder)
	{
		this.nome = nome;
		this.nivelDePoder = nivelDePoder;
	}

	public void tentarAumentarNivelDePoder(int nivelDePoder) 
	{
		nivelDePoder += 10;
	}

	public void aumentarNivelDePoder(int nivelDePoder)
	{
		this.nivelDePoder += 10;
	}

	public void mudarNome(Personagem personagem) {
		this.nome = "Coringa";
	}
}

class Aplicacao
{
	public static void main(String[] args)
	{
		Personagem p = new Personagem("Batman", 80);

		System.out.println("Antes de tentarAumentarNivelDePoder: " + p.nivelDePoder);
		p.tentarAumentarNivelDePoder(p.nivelDePoder);
		System.out.println("Depois de tentarAumentarNivelDePoder: " + p.nivelDePoder);

		System.out.println("Antes de mudarNome: " + p.nome);
		p.mudarNome(p);
		System.out.println("Depois de mudarNome: " + p.nome);

		System.out.println("Antes de aumentarNivelDePoder: " + p.nivelDePoder);
		p.aumentarNivelDePoder(p.nivelDePoder);
		System.out.println("Depois de aumentarNivelDePoder: " + p.nivelDePoder);
	}
}