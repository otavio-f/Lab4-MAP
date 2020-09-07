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
		sys.getFilme("Qualquer titulo serve").addMusica("Chão de Giz", "Zé Ramalho");
		
		sys.cadastrarEnvolvido(sys.getFilme("Qualquer titulo serve"), new Ator(sys.getFuncionario("Jose")));
		
		String esperado = "\nTitulo: Qualquer titulo serve\nData de Lançamento: 01/1991\n";
		esperado += "\nMúsicas:\n";
		esperado += "titulo: Chão de Giz - cantor: Zé Ramalho\n";
		esperado += "\nAtor: Jose\n";
		assertEquals(esperado, sys.detalhes(sys.getFilme("Qualquer titulo serve")));
	}
	
	@Test
	public void acaoTest() {
		sys.criarFuncionario("Jose");
		sys.criarFilme("Qualquer titulo serve", "01/1991");
		sys.cadastrarEnvolvido(sys.getFilme("Qualquer titulo serve"), new Ator(sys.getFuncionario("Jose")));
		
		String esperado = "Atua";
		
		assertEquals(
				esperado,
				sys.getFilme("Qualquer titulo serve").acaoFuncionario(sys.getFuncionario("Jose")));
		
	}

}
