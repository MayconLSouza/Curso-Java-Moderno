/**
 * Você está desenvolvendo um sistema de notas para uma escola. 
 * O sistema deve verificar se um aluno foi aprovado em uma disciplina com base em suas notas. 
 * Implemente um programa que utilize operadores lógicos para determinar se um aluno foi aprovado ou não.
 * Desenvolvedor: Maycon L M Souza
 * Data: 08/03/2026
 */
public class VerificacaoAprovacaoSimplificada
{
	public static void main(String[] args)
	{
		float nota1 = 10.0f;
		float nota2 = 2.0f;
		float media = (nota1 + nota2) / 2;

		System.out.println(media < 6 ? "Reprovado" : "Aprovado");
	}
}