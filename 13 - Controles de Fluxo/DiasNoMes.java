/**
 * Criar um programa em Java que verifica o valor de uma variável representando um mês do ano e exibe o número de dias desse mês.
 * Desenvolvedor: Maycon L M Souza
 * Data: 08/03/2026
 */
public class DiasNoMes
{
	public static void main (String[] args)
	{
		String mes = "Abril";

		String numeroDeDias = switch(mes) 
		{
			case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> "31";
			case "Abril", "Junho", "Setembro", "Novembro" -> "30";
			case "Fevereiro" -> "28";
			default -> "Mês Desconhecido";
		};

		System.out.println(numeroDeDias);
	}
}