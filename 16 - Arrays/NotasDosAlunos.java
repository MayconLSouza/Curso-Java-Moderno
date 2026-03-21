/**
 * Declare um array de tipo double com tamanho fixo (por exemplo, 5 elementos). 
 * Preencha manualmente o array com notas de alunos (valores de 0 a 10).
 * Imprima todas as notas do array em uma única linha.
 * Desenvolvedor: Maycon L M Souza
 * Data: 21/03/2026
 */
import java.util.Arrays;

public class NotasDosAlunos 
{
    public static void main (String[] args)
    {
        double[] notas = new double[10];

        for(int i = 0; i < notas.length; i++)
            notas[i] = i + 1.0;

        System.out.println(Arrays.toString(notas));
    }
}
