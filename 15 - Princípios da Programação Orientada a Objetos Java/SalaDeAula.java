/**
 * Este exercício tem como objetivo ensinar o uso de variáveis e métodos static em Java, utilizando duas classes no mesmo arquivo. 
 * Você irá criar uma classe que utiliza variáveis e métodos estáticos para contar o número de alunos em uma sala de aula e outra classe para testar essa funcionalidade.
 * Desenvolvedor: Maycon L M Souza
 * Data: 14/03/2026
 */
public class SalaDeAula 
{	
	static int totalAlunos = 0;

	public static void adicionarAluno() 
	{
		totalAlunos++;
	}

	public static void exibirTotalAlunos() 
	{
		System.out.println("Total de alunos na sala: " + totalAlunos);
	}
}

class TesteSalaDeAula 
{
    public static void main(String[] args) 
    {
		SalaDeAula sala1 = new SalaDeAula();
		SalaDeAula sala2 = new SalaDeAula();
		SalaDeAula sala3 = new SalaDeAula();

		SalaDeAula.adicionarAluno();
		SalaDeAula.adicionarAluno();
		SalaDeAula.adicionarAluno();

		SalaDeAula.exibirTotalAlunos();
    }
}