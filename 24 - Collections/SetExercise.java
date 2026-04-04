/**
 * O objetivo deste exercício é praticar o uso da interface Set para armazenar elementos únicos em Java.
 * Desenvolvedor: Maycon L M Souza
 * Data: 04/04/2026
 */
import java.util.Set;
import java.util.HashSet;

public class SetExercise
{
	public static void main(String[] args)
	{
		Set<Integer> set = new HashSet<>();

		set.add(0);
		set.add(1);
		set.add(2);

		System.out.println("Contains 2? " + set.contains(2));

		System.out.println(set);
		set.remove(0);
		System.out.println(set);
	}
}