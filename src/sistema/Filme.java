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

	public List<Ator> getElenco() {
		return elenco;
	}

	public void setElenco(List<Ator> elenco) {
		this.elenco = elenco;
	}

	public List<Musica> getTrilhaSonora() {
		return trilhaSonora;
	}

	public void setTrilhaSonora(List<Musica> trilhaSonora) {
		this.trilhaSonora = trilhaSonora;
	}

	public Funcionario getDiretor() {
		return diretor;
	}

	public void setDiretor(Funcionario diretor) {
		this.diretor = diretor;
	}

	public Funcionario getRoteirista() {
		return roteirista;
	}

	public void setRoteirista(Funcionario roteirista) {
		this.roteirista = roteirista;
	}

	public Funcionario getCinegrafista() {
		return cinegrafista;
	}

	public void setCinegrafista(Funcionario cinegrafista) {
		this.cinegrafista = cinegrafista;
	}

	
}
