package profissoes;

import sistema.Funcionario;

public class Cinegrafista extends Profissao {

	public Cinegrafista(Funcionario func) {
		super(func);
	}
	
	@Override
	public String acao() {
		return "Manuseia a câmera";
	}

}
