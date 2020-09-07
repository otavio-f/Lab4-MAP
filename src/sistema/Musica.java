package sistema;

public class Musica {
	private String cantor;
	private String titulo;
	
	public Musica (String cantor, String titulo) {
		this.cantor = cantor;
		this.titulo = titulo;
	}//lkj
	public String toString () {
		return String.format("titulo: %s - cantor: %s\n", this.titulo, this.cantor);
	}
}
