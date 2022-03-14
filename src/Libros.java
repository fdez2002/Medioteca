
public class Libros extends Medios {
	/*
	 * Atribustos
	 * 
	 */
	protected String isbm;
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
	public Libros() {}
	/*
	 * Constructor con parametros
	 */
	public Libros(String isbm, int anoPublicacion, int numPaginas, String titulo, String tematica, String indice, String autor,
			int numRegistro, String fechaAdquisiscion, double precioCompra, int ejemplares) {
				super(numRegistro, fechaAdquisiscion, precioCompra, ejemplares);
		this.isbm = isbm;
		this.anoPublicacion = anoPublicacion;
		this.numPaginas = numPaginas;
		this.titulo = titulo;
		this.tematica = tematica;
		this.indice = indice;
		this.autor = autor;
	}
	/**
	 * @return the isbm
	 */
	public String getIsbm() {
		return isbm;
	}
	/**
	 * @param isbm the isbm to set
	 */
	public void setIsbm(String isbm) {
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
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * 
	 */
	
	@Override
	public String toString(){
		return  "Titulo: " + titulo + "\n" + "Tematica: " + tematica + "\n" + "Autor: " + autor + "\n" + "Año de publicacion: " + anoPublicacion + "\n" 
											+ "Indice: " + indice + "\n" + "Nuemro de paginas: " + numPaginas + "\n" + "ISBM: " + isbm +"\n"  + "Ejemplares:" + ejemplares;
		
	}
	/**
	 * 
	 * @return
	 */
	
	public String toStringAdmin() {
		return  "Titulo: " + titulo + "\n" + "Tematica: " + tematica + "\n" + "Autor: " + autor + "\n" + "Año de publicacion: " + anoPublicacion + "\n" 
				+ "Indice: " + indice + "\n" + "Nuemro de paginas: " + numPaginas + "\n" + "ISBM: " + isbm + "\n" + "Numero de registro: " +  numRegistro
				+ "\n" + "Fecha de adquisicion: " + fechaAdquisicion + "\n" + "Precio Compra" + precioCompra +"\n"  + "Ejemplares:" + ejemplares;
	}
	
	

}
