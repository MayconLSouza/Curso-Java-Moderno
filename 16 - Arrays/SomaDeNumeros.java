/**
 * Faça um programa que calcule a soma dos números de 1 até 1000 e exiba o resultado.
 * Desenvolvedor: Maycon L M Souza
 * Data: 21/03/2026
 */
public class SomaDeNumeros 
{
    public static void main(String[] args)
    {
        int[] numeros = new int[1000];
        int soma = 0;

        for(int i = 0; i < numeros.length; i++)
        {
            numeros[i] = i + 1;
            soma += numeros[i]; 
        }

        System.out.println("Soma = " + soma);
    }
}
