package com.produtoapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.produtoapi.model.Produto;
import com.produtoapi.service.ProdutoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoService produtoService;

	@GetMapping
	public List<Produto> listarTodos() {
		return produtoService.listarTodos();
	}

	@PostMapping
	public Produto salvar(@RequestBody Produto produto) {
		return produtoService.salvar(produto);
	}

	@PostMapping("/salvarLista")
	public List<Produto> salvarLista(@RequestBody List<Produto> produtos) {
		return produtoService.salvarLista(produtos);
	}

	@PutMapping("/{id}")
	public Produto atualizar(@PathVariable Long id, @RequestBody Produto produto) {
		return produtoService.atualizar(id, produto);
	}

	@DeleteMapping("/{id}")
	public void deletar(@PathVariable Long id) {
		produtoService.deletar(id);
	}

	@GetMapping("/{id}")
	public Optional<Produto> findById(@PathVariable Long id) {
		return produtoService.findById(id);
	}

	@GetMapping("/buscarPorNome")
	public List<Produto> buscarPorNome(@RequestParam String valor) {
		return produtoService.findByNome(valor);
	}

	@GetMapping("/buscarPorNomeContendo")
	public List<Produto> buscarPorNomeContendo(@RequestParam String valor) {
		return produtoService.findByNomeContaining(valor);
	}

	@GetMapping("/buscarPorNomeEStatus")
	public List<Produto> buscarPorNomeEStatus(@RequestParam String nome, @RequestParam String status) {
		return produtoService.findByNomeAndStatus(nome, status);
	}

	@GetMapping("/buscarPorNomeComecandoCom")
	public List<Produto> buscarPorNomeComecandoCom(@RequestParam String valor) {
		return produtoService.findByNomeStartingWith(valor);
	}

	@GetMapping("/buscarPorNomeTerminandoCom")
	public List<Produto> buscarPorNomeTerminandoCom(@RequestParam String valor) {
		return produtoService.findByNomeEndingWith(valor);
	}

	@GetMapping("/buscarPorPreco")
	public List<Produto> buscarPorPreco(@RequestParam Double valor) {
		return produtoService.findByPreco(valor);
	}

	@GetMapping("/buscarPorPrecoMaiorQue")
	public List<Produto> buscarPorPrecoMaiorQue(@RequestParam Double valor) {
		return produtoService.findByPrecoGreaterThan(valor);
	}

	@GetMapping("/buscarPorPrecoMenorQue")
	public List<Produto> buscarPorPrecoMenorQue(@RequestParam Double valor) {
		return produtoService.findByPrecoLessThan(valor);
	}

	@GetMapping("/buscarTotalPreco")
	public Double buscarTotalPreco() {
		return produtoService.findTotalPreco();
	}

	@GetMapping("/buscarPorQuantidade")
	public List<Produto> buscarPorQuantidade(@RequestParam Integer valor) {
		return produtoService.findByQuantidade(valor);
	}

	@GetMapping("/buscarPorQuantidadeMenorQue")
	public List<Produto> buscarPorQuantidadeMenorQue(@RequestParam Integer valor) {
		return produtoService.findByQuantidadeLessThan(valor);
	}

	@GetMapping("/buscarPorQuantidadeMaiorQue")
	public List<Produto> buscarPorQuantidadeMaiorQue(@RequestParam Integer valor) {
		return produtoService.findByQuantidadeGreaterThan(valor);
	}

	@GetMapping("/buscarPorStatus")
	public List<Produto> buscarPorStatus(@RequestParam(required = false) String valor) {
		return produtoService.findByStatus(valor);
	}

	@GetMapping("/buscarPorStatusNulos")
	public List<Produto> buscarPorStatusNulos() {
		return produtoService.findByStatusIsNull();
	}

	@GetMapping("/buscarPorPrecoEStatus")
	public List<Produto> buscarPorPrecoEStatus(@RequestParam Double preco, @RequestParam String status) {
		return produtoService.findByPrecoAndStatus(preco, status);
	}

	@GetMapping("/contarTotalDeProdutos")
	public Long contarTotalDeProdutos() {
		return produtoService.count();
	}

	@GetMapping("/buscarPorStatusPadrao")
	public List<Produto> buscarPorStatusPadrao(@RequestParam(defaultValue = "Disponível") String valor) {
		return produtoService.findByStatus(valor);
	}
}
