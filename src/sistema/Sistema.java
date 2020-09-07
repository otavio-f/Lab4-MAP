package sistema;

import java.util.ArrayList;
import java.util.List;

import profissoes.Profissao;

public class Sistema {
	
	private List<Filme> filmes;
	
	private List<Funcionario> funcionarios;

	public Sistema() {
		this.filmes = new ArrayList<Filme>();
		this.funcionarios = new ArrayList<Funcionario>();
	}

	public Filme getFilme(String titulo) {
		for(Filme f:this.filmes)
			if(f.getTitulo().equals(titulo))
				return f;
		return null;
	}
	
	public List<Filme> getFilmes() {
		return filmes;
	}

	public void addFilme(Filme filme) {
		this.filmes.add(filme);
	}
	
	public void removeFilme(Filme filme) {
		this.filmes.remove(filme);
	}

	public Funcionario getFuncionario(String nome) {
		for(Funcionario f:this.funcionarios)
			if(f.getNome().equals(nome))
				return f;
		return null;
	}
	
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	public void addFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	
	public void removeFuncionario(Funcionario funcionario) {
		this.funcionarios.remove(funcionario);
	}
	
	/***
	 * Cadastra um funcionario e sua funcao em um filme
	 * @param filme
	 * @param funcao
	 */
	public void cadastrarEnvolvido(Filme filme, Profissao funcao) {
		
	}
	
	/***
	 * Informa toda a filmografia de um funcionario
	 * @param funcionario
	 * @return todas as participacoes e papeis do funcionario nos filmes
	 */
	public String informarFilmografia(Funcionario funcionario) {
		return null;
	}

	/***
	 * Infoma todas as características e papeis de um filme
	 * @param filme
	 * @return
	 */
	public String detalhes(Filme filme) {
		return null;
	}
}
