package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import profissoes.Ator;
import profissoes.Profissao;
import sistema.Filme;
import sistema.Funcionario;
import sistema.Sistema;

public class Teste {
	
	private Funcionario f1;
	private Funcionario f2;
	private Filme prod;
	private Sistema sys;
	
	@Before
	public void startUp() {
		sys = new Sistema();
	}

	@Test
	public void criarFuncionarioTest() {
		sys.criarFuncionario("Jose");
		assertEquals(new Funcionario("Jose"), sys.getFuncionario("Jose"));
	}
	
	@Test //Falha
	public void criarFilmeTest() {
		sys.criarFilme("Nome: Revanche", "07/2031");
		assertEquals(new Filme("Nome: Revanche", "07/2031"), sys.getFilme("Nome: Revanche"));
	}
	
	@Test
	public void detalhesTest() {
		sys.criarFilme("Qualquer titulo serve", "01/1991");
	}

}
