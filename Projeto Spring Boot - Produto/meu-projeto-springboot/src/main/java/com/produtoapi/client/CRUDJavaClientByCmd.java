package com.produtoapi.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.produtoapi.model.Produto;

public class CRUDJavaClientByCmd {
	
	private static final String BASE_URL = "http://localhost:8080/produtos";
	private RestTemplate restTemplate;
	
	public CRUDJavaClientByCmd() {
		this.restTemplate = new RestTemplate();
	}
	
	public void listarTodos() {
		ResponseEntity<Produto[]> response = restTemplate.getForEntity(BASE_URL, Produto[].class);
		List<Produto> produtos = Arrays.asList(response.getBody());
		produtos.forEach(produto -> {
			System.out.println("ID: " + produto.getId());
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Preço: " + produto.getPreco());
			System.out.println("Quantidade: " + produto.getQuantidade());
			System.out.println("Status: " + produto.getStatus());
			System.out.println("----------------------");
		});
	}
	
	public Produto salvar(Produto produto) {
		HttpEntity<Produto> request = new HttpEntity<>(produto);
		return restTemplate.postForObject(BASE_URL, request, Produto.class);
	}
	
	public void deletar(long id) {
		restTemplate.delete(BASE_URL + "/" + id);
	}
	
	public Produto atualizar(long id, Produto produto) {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Produto> request = new HttpEntity<>(produto, headers);
		ResponseEntity<Produto> response = restTemplate.exchange(BASE_URL + "/" + id, HttpMethod.PUT, request, Produto.class);
		return response.getBody();
	}
	
	public Produto findById(long id) {
		ResponseEntity<Produto> response = restTemplate.getForEntity(BASE_URL + "/" + id, Produto.class);
		return response.getBody();
	}
	
	public static void main(String[] args) {
		var client = new CRUDJavaClientByCmd();
		

		// Criar um novo produto
		var novoProduto = new Produto();
		novoProduto.setNome("Skate Profissional");
		novoProduto.setPreco(300.0);
		novoProduto.setQuantidade(200);
		novoProduto.setStatus("Disponível");
		
		System.out.println("Criar um novo produto");
		client.salvar(novoProduto);
		client.listarTodos();

		// Atualizar um produto
		var atualizarProduto = client.findById(1L);
		atualizarProduto.setNome("Skate");
		atualizarProduto.setPreco(99.99);
		
		System.out.println("Atualizar o produto");
		client.atualizar(atualizarProduto.getId(), atualizarProduto);
		client.listarTodos();
		
		// Deletar um produto
		System.out.println("Deletar o produto");
		client.deletar(1L);
		client.listarTodos();
	}
}
