package profissoes;

import sistema.Funcionario;

public class Roteirista extends Profissao {
	
	public Roteirista(Funcionario func) {
		super(func);
	}

	@Override
	public String acao() {
		return "Cria roteiros";
	}

}
