package sistema;

public class Musica {
	private String cantor;
	private String titulo;
	
	public String toString () {
		return String.format("titulo: %s - cantor: %s\n", this.titulo, this.cantor);
	}
}
