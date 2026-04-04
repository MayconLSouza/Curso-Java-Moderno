/**
 * O objetivo deste exercício é praticar o uso de expressões lambda em Java para manipular listas.
 * Desenvolvedor: Maycon L M Souza
 * Data: 04/04/2026
 */
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class LambdaList
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "C#", "C++"));
		list.removeIf(s -> s.length() > 3);

		list.add(0, "Go");
		list.forEach(System.out::println);
	}
}