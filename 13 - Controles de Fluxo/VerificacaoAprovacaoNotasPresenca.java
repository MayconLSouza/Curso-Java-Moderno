/**
 * Você está desenvolvendo um sistema de notas para uma escola. 
 * O sistema deve verificar se um aluno foi aprovado em uma disciplina com base em suas notas e presença. 
 * Implemente um programa que utilize operadores lógicos para determinar se um aluno foi aprovado ou não.
 * Desenvolvedor: Maycon L M Souza
 * Data: 08/03/2026
 */
public class VerificacaoAprovacaoNotasPresenca
{
	public static void main(String[] args)
	{
		float nota1 = 7.0f;
		float nota2 = 7.0f;
		float frequencia = 0.75f;
		float media = (nota1 + nota2) / 2;

		System.out.println((media < 7 || frequencia < 0.75) ? "Reprovado" : "Aprovado");		
	}
}