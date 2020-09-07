package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import profissoes.Ator;
import profissoes.Profissao;
import sistema.Filme;
import sistema.Funcionario;
import sistema.Sistema;

public class SistemaTeste {

	private Sistema sys;
	
	@Before
	public void startUp() {
		sys = new Sistema();
	}

	@Test
	public void criarFuncionarioTest() {
		sys.criarFuncionario("Jose");
		sys.criarFuncionario("Joao");
		assertEquals(new Funcionario("Jose"), sys.getFuncionario("Jose"));
		assertEquals(sys.getFuncionarios().size(), 2);
	}
	
	@Test
	public void semFuncionarios() {
		assertEquals(sys.getFuncionarios().size(), 0);
		assertNull(sys.getFuncionario("Qualquer"));
	}
	
	@Test //Falha
	public void criarFilmeTest() {
		sys.criarFilme("Nome: Revanche", "07/2031");
		assertEquals(new Filme("Nome: Revanche", "07/2031"), sys.getFilme("Nome: Revanche"));
	}
	
	@Test
	public void semFilmes() {
		assertEquals(sys.getFilmes().size(), 0);
		assertNull(sys.getFilme("Qualquer"));
	}
	
	@Test
	public void detalhesTest() {
		sys.criarFuncionario("Jose");
		sys.criarFilme("Qualquer titulo serve", "01/1991");
		sys.cadastrarEnvolvido(sys.getFilme("Qualquer titulo serve"), new Ator(sys.getFuncionario("Jose")));
		
		String esperado = "Titulo: Qualquer titulo serve\nData de Lançamento: 01/1991\n";
		esperado += "Ator: Jose\n";
		esperado += "\n";
		assertEquals(esperado, sys.detalhes(sys.getFilme("Qualquer titulo serve")));
	}

}
