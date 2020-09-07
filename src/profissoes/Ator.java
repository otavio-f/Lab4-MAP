package profissoes;

import sistema.Funcionario;

public class Ator extends Profissao{

	public Ator(Funcionario func) {
		super(func);
	}

	@Override
	public String acao() {
		return "Atua";
	}
	
	@Override
	public String toString() {
		return String.format("Ator: %s\n", this.getFuncionario());
	}

}
