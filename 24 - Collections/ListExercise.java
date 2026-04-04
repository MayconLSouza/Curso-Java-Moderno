/**
 * O objetivo deste exercício é entender e aplicar conceitos de listas em Java, utilizando a classe ArrayList para gerenciar uma lista de filmes.
 * Desenvolvedor: Maycon L M Souza
 * Data: 04/04/2026
 */
import java.util.ArrayList;
import java.util.List;

public class ListExercise
{
	public static void main(String[] args)
	{
		List<String> filmes = new ArrayList<>();

		filmes.add("O agente secreto");
		filmes.add("Uma batalha após a outra");
		filmes.add("Pecadores");

		System.out.println(filmes);

		System.out.println("Contains Pecadores? " + filmes.contains("Pecadores"));
	}
}