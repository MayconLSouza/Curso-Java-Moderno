/**
 * Demonstrar a aplicação prática dos comandos 'continue' e 'break' em uma estrutura de repetição em Java, 
 * usando uma lista de códigos de carteirinha de convênio médico. 
 * O objetivo é entender como essas palavras-chave podem controlar o fluxo de execução de um laço for e como elas podem ser usadas para pular iterações ou interromper o loop com base em condições específicas.
 * Desenvolvedor: Maycon L M Souza
 * Data: 08/03/2026
 */
public class CarterinhaConvenio
{
	public static void main(String[] args)
	{
		int codigoDeSaida = 9;

		for(int codigoCarteirinha = 1; codigoCarteirinha < 11; codigoCarteirinha++)
		{
			if(codigoCarteirinha == codigoDeSaida)
			{
				System.out.println("Código de saída encontrado.");
				break;
			}

			if (codigoCarteirinha == 3 || codigoCarteirinha == 7 || codigoCarteirinha == 10) 
			{
				System.out.println("Carteinha aceita: " + codigoCarteirinha);
				continue;
			}

			System.out.println("Carteinha recusada: " + codigoCarteirinha);
		}
	}
}