package com.ia.ml.weka;

import weka.classifiers.Classifier;
import weka.classifiers.trees.J48;

import weka.core.Attribute;
import weka.core.Instance;
import weka.core.DenseInstance;
import weka.core.Instances;

import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.ArrayList;

public class DeteccaoDeFraudeBancaria {

	private Classifier classificador;
	private Instances dadosTreinamento;

	private Attribute atributoValor;
	private Attribute atributoOrigem;
	private Attribute atributoFraude;

	public void definirAtributos() {
		atributoValor = new Attribute("valor");

		ArrayList<String> valoresOrigem = new ArrayList<>();
		valoresOrigem.add("internacional");
		valoresOrigem.add("nacional");
		atributoOrigem = new Attribute("origem", valoresOrigem);

		ArrayList<String> valoresFraude = new ArrayList<>();
		valoresFraude.add("nao");
		valoresFraude.add("sim");
		atributoFraude = new Attribute("fraude", valoresFraude);

		ArrayList<Attribute> atributos = new ArrayList<>();
		atributos.add(atributoValor);
		atributos.add(atributoOrigem);
		atributos.add(atributoFraude);

		dadosTreinamento = new Instances("transacoes", atributos, 0);
		dadosTreinamento.setClassIndex(dadosTreinamento.numAttributes() - 1);
	}
	
	private void adicionarTransacao(double valor, String origem, String fraude) {
		Instance instancia = new DenseInstance(dadosTreinamento.numAttributes());

		instancia.setDataset(dadosTreinamento);
		
		instancia.setValue(atributoValor, valor);
		instancia.setValue(atributoOrigem, origem);
		instancia.setValue(atributoFraude, fraude);
		
		dadosTreinamento.add(instancia);
	}
	
	public void adicionarExemplos() {
		adicionarTransacao(5000, "internacional", "sim");
		adicionarTransacao(10000, "internacional", "sim");
		adicionarTransacao(7500, "internacional", "sim");
		adicionarTransacao(8000, "internacional", "sim");

		adicionarTransacao(200, "nacional", "nao");
		adicionarTransacao(150, "nacional", "nao");
		adicionarTransacao(300, "nacional", "nao");
		adicionarTransacao(400, "nacional", "nao");
		
		adicionarTransacao(1000, "nacional", "sim");
		adicionarTransacao(1500, "nacional", "sim");
		adicionarTransacao(20000, "nacional", "sim");
	}
	
	public void treinarModelo() throws Exception {
		classificador = new J48();
		classificador.buildClassifier(dadosTreinamento);
	}
	
	public String classificarTransacao(double valor, String origem) throws Exception {
		Instance novaInstancia = new DenseInstance(dadosTreinamento.numAttributes());
		novaInstancia.setDataset(dadosTreinamento);
		novaInstancia.setValue(atributoValor, valor);
		novaInstancia.setValue(atributoOrigem, origem);
		
		double previsao = classificador.classifyInstance(novaInstancia);
		
		return "Fraude: " + dadosTreinamento.classAttribute().value((int) previsao);
	}
	
	public static void main(String[] args) {
		Logger.getLogger("com.github.fommil.netlib").setLevel(Level.SEVERE);
		
		DeteccaoDeFraudeBancaria detector = new DeteccaoDeFraudeBancaria();
		
		try {
			detector.definirAtributos();
			detector.adicionarExemplos();
			detector.treinarModelo();
			
			String resultado1 = detector.classificarTransacao(5000, "internacional");
			String resultado2 = detector.classificarTransacao(200, "nacional");
			String resultado3 = detector.classificarTransacao(10000, "internacional");
			String resultado4 = detector.classificarTransacao(150, "nacional");
			String resultado5 = detector.classificarTransacao(7500, "internacional");
			String resultado6 = detector.classificarTransacao(300, "nacional");
			String resultado7 = detector.classificarTransacao(8000, "internacional");
			String resultado8 = detector.classificarTransacao(400, "nacional");

			String resultado9 = detector.classificarTransacao(400, "internacional");
			
			System.out.println("Teste 1: " + resultado1);
			System.out.println("Teste 2: " + resultado2);
			System.out.println("Teste 3: " + resultado3);
			System.out.println("Teste 4: " + resultado4);
			System.out.println("Teste 5: " + resultado5);
			System.out.println("Teste 6: " + resultado6);
			System.out.println("Teste 7: " + resultado7);
			System.out.println("Teste 8: " + resultado8);

			System.out.println("Teste 9: " + resultado9);
		} catch (Exception e) {
			System.err.println("Erro ao classificar a transacao: " + e.getMessage());
		}
	}
}
