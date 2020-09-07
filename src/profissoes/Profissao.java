package profissoes;

import sistema.Funcionario;

/***
 * Classe abstrata que representa uma função
 * @author Otavio
 * @author Rafael
 *
 */
public abstract class Profissao {
	
	private Funcionario funcionario;

	public Profissao(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public abstract String acao();

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
