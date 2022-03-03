
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
	/**
	 * @return the isbm
	 */
	public int getIsbm() {
		return isbm;
	}
	/**
	 * @param isbm the isbm to set
	 */
	public void setIsbm(int isbm) {
		this.isbm = isbm;
	}
	/**
	 * @return the anoPublicacion
	 */
	public int getAnoPublicacion() {
		return anoPublicacion;
	}
	/**
	 * @param anoPublicacion the anoPublicacion to set
	 */
	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}
	/**
	 * @return the numPaginas
	 */
	public int getNumPaginas() {
		return numPaginas;
	}
	/**
	 * @param numPaginas the numPaginas to set
	 */
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the tematica
	 */
	public String getTematica() {
		return tematica;
	}
	/**
	 * @param tematica the tematica to set
	 */
	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	/**
	 * @return the indice
	 */
	public String getIndice() {
		return indice;
	}
	/**
	 * @param indice the indice to set
	 */
	public void setIndice(String indice) {
		this.indice = indice;
	}
	
}
