/**
 * Declare um array de inteiros com um tamanho fixo (por exemplo, 6 elementos).
 * Preencha o array manualmente com números pares (por exemplo, 2, 4, 6, ...).
 * Imprima todos os elementos do array em uma única linha.
 * Desenvolvedor: Maycon L M Souza
 * Data: 21/03/2026
 */
import java.util.Arrays;

public class NumerosPares 
{
    public static void main(String[] args)
    {
        int[] pares = new int[10];

        for(int i = 0; i < pares.length; i++)
        {
            pares[i] = i * 2;
        }

        System.out.println(Arrays.toString(pares));
    }
}
