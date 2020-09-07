package main;

import profissoes.Ator;
import profissoes.Cinegrafista;
import profissoes.Diretor;
import profissoes.Roteirista;
import sistema.Filme;
import sistema.Funcionario;
import sistema.Sistema;

public class Main {
	public static void main(String[] args) {
		Sistema controle = new Sistema();
		
		controle.criarFuncionario("Rafael");
		controle.criarFuncionario("Otávio");
		controle.criarFuncionario("Maria");
		controle.criarFuncionario("José");
		
		Funcionario rafael = controle.getFuncionario("Rafael");
		Funcionario otavio = controle.getFuncionario("Otavio");
		Funcionario maria = controle.getFuncionario("Maria");
		Funcionario jose = controle.getFuncionario("José");
		
		controle.criarFilme("Titanico", "04/2000");
		controle.criarFilme("Jura Park", "03/2020");
		controle.criarFilme("Quando", "03/2020");
		
		Filme titanico = controle.getFilme("Titanico");
		Filme juraPark = controle.getFilme("Jura Park");
		Filme quando = controle.getFilme("Jura Park");
		
		System.out.println("a) Cadastrar todos os envolvidos em um filme informando sua(s) funcão(ões):");
		controle.cadastrarEnvolvido(titanico, new Diretor(rafael));
		controle.cadastrarEnvolvido(titanico, new Ator(maria));
		controle.cadastrarEnvolvido(titanico, new Ator(rafael));
		controle.cadastrarEnvolvido(titanico, new Ator(jose));
		controle.cadastrarEnvolvido(titanico, new Cinegrafista(otavio));
		controle.cadastrarEnvolvido(titanico, new Roteirista(otavio));
		
		controle.cadastrarEnvolvido(juraPark, new Diretor(otavio));
		controle.cadastrarEnvolvido(juraPark, new Ator(otavio));
		controle.cadastrarEnvolvido(juraPark, new Ator(rafael));
		controle.cadastrarEnvolvido(juraPark, new Ator(jose));
		controle.cadastrarEnvolvido(juraPark, new Cinegrafista(otavio));

		controle.cadastrarEnvolvido(quando, new Diretor(maria));
		controle.cadastrarEnvolvido(quando, new Ator(jose));
		controle.cadastrarEnvolvido(quando, new Ator(rafael));
		controle.cadastrarEnvolvido(quando, new Ator(jose));
		controle.cadastrarEnvolvido(quando, new Ator(maria));

		System.out.println("b) Informar a filmografia indicando sua função específica:");
		
		System.out.println("c) Informar todas as características de um dado filme (nome, diretor, roteirista, elenco, trilha sonora, ano, etc.)");
	}

}
