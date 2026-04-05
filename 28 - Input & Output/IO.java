/**
 * Desenvolva um programa em Java que pratique a manipulação de arquivos e utilize conceitos de Programação Orientada a Objetos (POO). 
 * O programa deve ser capaz de escrever e ler conteúdo em um arquivo de texto.
 * Desenvolvedor: Maycon L M Souza
 * Data: 04/04/2026
 */
import java.io.*;

public class IO
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
		var writer = new FileWriter(filePath);
		writer.write("Olá, mundo!");
		writer.close();
	}

	public static void lerDoArquivo() throws IOException
	{
		var reader = new FileReader(filePath);
		int data = reader.read();

		while(data != -1)
		{
			System.out.print((char) data);
			data = reader.read();
		}

		reader.close();
	}
}

