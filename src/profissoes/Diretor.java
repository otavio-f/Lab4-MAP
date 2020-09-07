package profissoes;

import sistema.Funcionario;

public class Diretor extends Profissao {

	public Diretor(Funcionario func) {
		super(func);
	}
	
	@Override
	public String acao() {
		return "Dirige o filme";
	}

}
