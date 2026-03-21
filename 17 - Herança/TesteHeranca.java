/**
 * O objetivo deste exercício é praticar conceitos de herança em Java. 
 * Vamos criar uma classe Assistente que herda da classe Funcionario e implementar um método para calcular o salário anual com um bônus fixo.
 * Desenvolvedor: Maycon L M Souza
 * Data: 21/03/2026
 */
class Funcionario
{
    private String nome;
    private double salario;

    public void addAumento(double valor)
    {
        salario += valor;
    }

    public double ganhoAnual()
    {
        return salario * 12;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }
}

class Assistente extends Funcionario
{
    public double ganhoAnual()
    {
        return super.ganhoAnual() + 1000.0;
    }
}

public class TesteHeranca
{
    public static void main (String[] args)
    {
        Assistente a = new Assistente();
        a.setNome("João");
        a.setSalario(3000);
        a.addAumento(500.0);

        System.out.println(a.ganhoAnual());
    }
}
