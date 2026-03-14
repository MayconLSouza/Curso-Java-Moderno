/**
 * Crie uma classe Pessoa com os seguintes atributos: nome, idade, endereco e telefone.
 * Utilize diferentes modificadores de acesso para cada atributo e implemente métodos para acessar e modificar esses atributos.
 * Desenvolvedor: Maycon L M Souza
 * Data: 14/03/2026
 */
public class Pessoa
{
	public String nome;
	private int idade;
	protected String endereco;
	String telefone;

	public Pessoa(String nome, int idade, String endereco, String telefone)
	{
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public int getIdade()
	{
		return idade;
	}

	public void setIdade(int idade)
	{
		this.idade = idade;
	}

	public String getEndereco()
	{
		return endereco;
	}

	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}

	public String getTelefone()
	{
		return telefone;
	}	

	public void setTelefone(String telefone)
	{
		this.telefone = telefone;
	}
}

class Aplicacao
{
	public static void main(String[] args)
	{
		Pessoa pessoa = new Pessoa("Fulano", 20, "Rua A", "9121345678");

		System.out.println("Nome: " + pessoa.nome); 
		
		System.out.println("Idade: " + pessoa.getIdade()); 
		pessoa.setIdade(28);
		System.out.println("Nova Idade: " + pessoa.getIdade());
		
		System.out.println("Endereço: " + pessoa.getEndereco()); 
		pessoa.setEndereco("Rua B");
		System.out.println("Novo Endereço: " + pessoa.getEndereco());
		
		System.out.println("Telefone: " + pessoa.getTelefone()); 
		pessoa.setTelefone("987654321");
		System.out.println("Novo Telefone: " + pessoa.getTelefone());		
	}
}