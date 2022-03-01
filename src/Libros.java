
public class Libros extends Medios {
	/*
	 * Atribustos
	 * 
	 */
	protected int isbm;
	protected int anoPublicacion;
	protected int numPaginas;
	protected String titulo;
	protected String tematica;
	protected String indice;
	protected String autor;
	
	/*
	 * Contructor sin parametros
	 * 
	 */
	public Libros() {
		
	}
	/*
	 * Constructor con parametros
	 */
	public Libros(int isbm, int anoPublicacion, int numPaginas, String titulo, String tematica, String indice, String autor,
			int numRegistro, int fechaAdquisiscion, float precioCompra) {
				super(numRegistro, fechaAdquisiscion, precioCompra);
		this.isbm = isbm;
		this.anoPublicacion = anoPublicacion;
		this.numPaginas = numPaginas;
		this.titulo = titulo;
		this.tematica = tematica;
		this.indice = indice;
		this.autor = autor;
	}
	

}
