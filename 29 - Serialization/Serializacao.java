import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Serializacao
{
	public static void main(String[] args)
	{
		var contato1 = new Contato("Bill Blue", "(11) 1234-5678");
		var contato2 = new Contato("Gary Green", "(22) 9876-5432");
		var contato3 = new Contato("Wilson White", "(33) 2468-9753");

		var listaContatos = new ArrayList<Contato>(Arrays.asList(contato1, contato2, contato3));

		try
		{
			serializarContatos(listaContatos);
			deserializarContatos();
		}
		catch(IOException | ClassNotFoundException e)
		{
			System.err.println("Error: " + e.getMessage());
		}
	}

	private static void serializarContatos(List<Contato> listaContatos) throws IOException
	{
		try (var outputStream = new ObjectOutputStream(new FileOutputStream("agenda.ser")))
		{
			outputStream.writeObject(listaContatos);
			System.out.println("Contatos serializados e salvos com sucesso!");
		}
	}

	@SuppressWarnings("unchecked")
	private static void deserializarContatos() throws IOException, ClassNotFoundException
	{
		try(var inputStream = new ObjectInputStream(new FileInputStream("agenda.ser")))
		{
			var contatosLidos = (List<Contato>) inputStream.readObject();
			contatosLidos.forEach( c -> System.out.println("Nome: " + c.nome + ", Telefone " + c.telefone));
		}
	}
}
