import java.sql.Connection;
import java.util.List;

public class Main 
{
    public static void main(String[] args) 
    {
        try (Connection conexao = ConexaoDB.conectar())
        {
            var produtoDAO = new ProdutoDAO(conexao);

            mostrarProdutos(produtoDAO);

            var p1 = new Produto("Notebook", 10, 1999.99, "Em estoque");
            var p2 = new Produto("Smartphone", 20, 1499.99, "Estoque baixo");
            var p3 = new Produto("Tablet", 15, 799.99, "Estoque baixo");

            produtoDAO.inserir(p1);
            produtoDAO.inserir(p2);
            produtoDAO.inserir(p3);

            mostrarProdutos(produtoDAO);

            var pConsultado = produtoDAO.consultarPorId(1);
            if (pConsultado != null)
            {
                pConsultado.setNome("Laptop");
                System.out.println("Novo nome do produto: " + pConsultado.getNome());
                produtoDAO.atualizar(pConsultado);
                
                System.out.println("Base de dados atualizada:");
                mostrarProdutos(produtoDAO);
            }
            else
            {
                System.out.println("Produto não encontrado.");
            }

            produtoDAO.excluirPorId(3);
            mostrarProdutos(produtoDAO);

            produtoDAO.excluirTodos();
            mostrarProdutos(produtoDAO);
        }
        catch(Exception e)
        {
            System.err.println("Erro main: " + e.getMessage());
        }
    }

    private static void mostrarProdutos(ProdutoDAO pDAO)
    {
        List<Produto> todosProdutos = pDAO.listarTodos();

        if(todosProdutos.isEmpty())
            System.out.println("Nenhum produto encontrado.");
        else
        {
            System.out.println("Lista de produtos:");
            for (Produto p : todosProdutos)
                System.out.println(p.getId() + ": " + p.getNome() + " - " + p.getPreco());
        }
    }
}
