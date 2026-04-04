/**
 * Criar uma expressão lambda que filtre os números ímpares de um conjunto (Set) de inteiros.
 * Desenvolvedor: Maycon L M Souza
 * Data: 04/04/2026
 */
import java.util.Set;

public class LambdaSet
{
	public static void main(String[] args)
	{
		Set<Integer> numeros = Set.of(1, 2, 3, 4, 5);

		numeros.forEach( n -> {
			if(n % 2 != 0)
				System.out.println(n);
		});
	}
}