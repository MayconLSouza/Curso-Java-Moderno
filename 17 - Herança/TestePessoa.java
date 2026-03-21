/**
 * Demonstrar como a palavra-chave super é usada para acessar membros da classe pai (superclasse) em uma subclasse.
 * Desenvolvedor: Maycon L M Souza
 * Data: 21/03/2026
 */
class Pessoa
{
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

class Estudante extends Pessoa
{
    private String matricula;

    public Estudante(String nome, int idade, String matricula)
    {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade()
                + "\nMatricula: " + matricula;
    }

    
}

public class TestePessoa 
{
    public static void main(String[] args) 
    {
        Estudante e = new Estudante("Fulano", 15, "123456789");
        System.out.println(e.toString());
    }
}
