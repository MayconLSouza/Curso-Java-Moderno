/**
 * O objetivo deste exercício é entender e aplicar conceitos de coleções em Java, especificamente o uso de Map para gerenciar um estoque de produtos.
 * Desenvolvedor: Maycon L M Souza
 * Data: 04/04/2026
 */
import java.util.HashMap;
import java.util.Map;

public class MapExercise
{
	public static void main(String[] args)
	{
		Map<String, Integer> estoque = new HashMap<>();

		estoque.put("Banana", 10);
		estoque.put("Uva", 20);
		estoque.put("Abacate", 30);

		System.out.println("Uva: " + estoque.get("Uva"));

		System.out.println(estoque);
		estoque.put("Abacate", 15);
		System.out.println(estoque);
	}
}