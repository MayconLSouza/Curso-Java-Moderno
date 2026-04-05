/**
 * O objetivo deste exercício é praticar a escrita e leitura de arquivos em Java usando a classe do pacote Java NIO (como feito em aula), e aplicar conceitos de POO.
 * Desenvolvedor: Maycon L M Souza
 * Data: 04/04/2026
 */
import jave.nio.*;

public class NIO 
{
	public static final String filePath = "D:\\Curso\\meuArquivo.txt";

	public static void main(String[] args)
	{
		try
		{
			escreverNoArquivo();
			lerDoArquivo();
		}
		catch (IOException e)
		{
			System.err.println("Error: " + e.getMessage());
		}
	}

	public static void escreverNoArquivo() throws IOException
	{
		Files.write(filePath, "Olá, mundo!".getBytes());
	}

	public static void lerDoArquivo() throws IOException
	{
		byte[] bytes = Files.readAllBytes(filePath);
		String content = new String(bytes);
		System.out.println(content);
	}
}