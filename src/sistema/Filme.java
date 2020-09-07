package sistema;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import profissoes.*;

public class Filme {
	private String titulo;
	private YearMonth ano;
	private List<Profissao> funcionarios;
	private List<Musica> trilhaSonora;
	
	public Filme(String titulo, YearMonth ano) {
		this.titulo = titulo;
		this.ano = ano;
		this.funcionarios = new ArrayList<Profissao>();
		this.trilhaSonora = new ArrayList<Musica>();
	}

	public Filme(String titulo, String data) {
		this.titulo = titulo;
		this.ano = YearMonth.parse(data, DateTimeFormatter.ofPattern("MM/yyyy"));
		this.funcionarios = new ArrayList<Profissao>();
		this.trilhaSonora = new ArrayList<Musica>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void adicionarFuncionario(Profissao funcionario) {
		funcionarios.add(funcionario);
	}
	
	public String detalhes() {
		return null;
	}
	
	public String acaoFuncionario(Funcionario func) {
		for(Profissao p: funcionarios)
			if(p.getFuncionario().equals(func))
				return p.acao();
		return null;
	}
	
	public Funcionario isDiretor(Funcionario func) {
		for(Profissao p: funcionarios)
			if(p.acao().equals("Dirigir o filme"))
				return p.getFuncionario();
		
		return null;
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
