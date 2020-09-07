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

	public void addMusica(String titulo, String cantor) {
		this.trilhaSonora.add(new Musica (titulo, cantor));
	}
	
	public String detalhes() {
		String output = String.format(
				"\nTitulo: %s\nData de Lançamento: %s\n",
				this.titulo,
				this.ano.format(DateTimeFormatter.ofPattern("MM/yyyy"))
				);
		output += "\nMúsicas:\n";
		for(Musica m: this.trilhaSonora)
			output += String.format("%s", m);
		output += "\n";
		for(Profissao p: this.funcionarios)
			output += String.format("%s", p);
		
		return output;
	}
	
	public String acaoFuncionario(Funcionario func) {
		String acoes = "";
		for(Profissao p: funcionarios)
			if(p.getFuncionario().equals(func))
				acoes += p.acao();
		return acoes;
	}
	
	public Funcionario isDiretor(Funcionario func) {
		for(Profissao p: funcionarios)
			if(p.acao().equals("Dirigir o filme"))
				return p.getFuncionario();
		
		return null;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filme other = (Filme) obj;
		if (ano == null) {
			if (other.ano != null)
				return false;
		} else if (!ano.equals(other.ano))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	public String toString() {
		return String.format("Filme: %s", titulo);
	}
	
}
