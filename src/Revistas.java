
public class Revistas extends Medios {
	/*
	 * Atributos
	 * 
	 */
	int isbm;
	int anoPublicacion;
	int numPaginas;
	String titulo;
	String tematica;
	String indice;
	/*
	 * Constructor sin parametros
	 */
	public Revistas() {}
	/*
	 * Constructor con parametros
	 */
	public Revistas(int isbm, int anoPublicacion, int numPaginas, String titulo, String tematica, String indice, 
			int numRegistro, int fechaAdquisiscion, float precioCompra) {
				super(numRegistro, fechaAdquisiscion, precioCompra);
			
		this.isbm = isbm;
		this.anoPublicacion = anoPublicacion;
		this.numPaginas = numPaginas;
		this.titulo = titulo;
		this.tematica = tematica;
		this.indice = indice;
	}
	
}
