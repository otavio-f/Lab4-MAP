package main;

import sistema.Sistema;

public class Main {
	public static void main(String[] args) {
		Sistema controle = new Sistema();
		
		System.out.println("a) Cadastrar todos os envolvidos em um filme informando sua(s) func�o(�es):");
		//controle.cadastrarEnvolvido(filme, new Diretor(otavio));
		
		System.out.println("b) Informar a filmografia indicando sua fun��o espec�fica:");
		
		System.out.println("c) Informar todas as caracter�sticas de um dado filme (nome, diretor, roteirista, elenco, trilha sonora, ano, etc.)");
	}

}
