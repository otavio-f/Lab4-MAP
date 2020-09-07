package profissoes;

import sistema.Funcionario;

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
