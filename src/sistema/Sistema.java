package sistema;

import java.util.ArrayList;
import java.util.List;

import profissoes.Profissao;

/***
 * Classe do controle do sistema
 * @author Otavio
 * @author Rafael
 *
 */
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
	
	/***
	 * Retorna a lista de filmes
	 * @return
	 */
	public List<Filme> getFilmes() {
		return filmes;
	}

	/***
	 * Cria um filme e armazena
	 * @param titulo
	 * @param data
	 */
	public void criarFilme(String titulo, String data) {
		this.filmes.add(new Filme(titulo, data));
	}
	
	/***
	 * Cria um funcionario e armazena
	 * @param nome
	 */
	public void criarFuncionario(String nome) {
		this.funcionarios.add(new Funcionario(nome));
	}
	
	/***
	 * Busca por um funcionario
	 * @param nome
	 * @return
	 */
	public Funcionario getFuncionario(String nome) {
		for(Funcionario f:this.funcionarios)
			if(f.getNome().equals(nome))
				return f;
		return null;
	}
	
	/***
	 * Retorna a lista de funcionarios
	 * @return
	 */
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	/***
	 * Cadastra um funcionario e sua funcao em um filme
	 * @param filme
	 * @param funcao
	 */
	public void cadastrarEnvolvido(Filme filme, Profissao funcao) {
		filme.adicionarFuncionario(funcao);
	}
	
	/***
	 * Informa toda a filmografia de um funcionario
	 * @param funcionario
	 * @return todas as participacoes e papeis do funcionario nos filmes
	 */
	public String informarFilmografia(Funcionario funcionario) {
		String filmografia = funcionario.getNome()+"\n";
		for(Filme f:this.filmes) {
			String acaoFuncionario = f.acaoFuncionario(funcionario);
			if(acaoFuncionario != null) {
				filmografia += String.format("\n%s em %s.\n", acaoFuncionario, f.getTitulo());
			}else {
				filmografia += String.format("Não houve participação de %s\n", funcionario);
			}
			filmografia += String.format("\n");
		}		
		return filmografia;
	}

	/***
	 * Infoma todas as características e papeis de um filme
	 * @param filme
	 * @return
	 */
	public String detalhes(Filme filme) {
		return filme.detalhes();
	}
}
