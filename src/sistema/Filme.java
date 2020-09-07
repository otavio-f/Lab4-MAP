package sistema;

import java.time.YearMonth;
import java.util.List;

import profissoes.*;

public class Filme {
	private String titulo;
	private YearMonth ano;
	private List<Ator> elenco;
	private List<Musica> trilhaSonora;
	private Funcionario diretor;
	private Funcionario roteirista;
	private Funcionario cinegrafista;
	
	public Filme(String titulo, YearMonth ano) {
		this.titulo = titulo;
		this.ano = ano;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
}
