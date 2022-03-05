
public class Peliculas extends Medios {
	/*
	 * Atributos
	 * 
	 */
	protected String isan;
	protected int anoPublicacion;
	protected String titulo;
	protected String director;
	protected String soporte;
	protected String protagonista;
	protected String estilo;
	protected String duracion;
	/*
	 * Constructor sin parametros
	 */
	public Peliculas() {
		
	}
	/*Constructor con parametros
	 * 
	 */
	public Peliculas(String isan, int anoPublicacion, String titulo, String director, String soporte, String protagonista, String estilo, String duracion,
			int numRegistro, String fechaAdquisiscion, double precioCompra) {
				super(numRegistro, fechaAdquisiscion, precioCompra);
				
		this.isan = isan;
		this.anoPublicacion = anoPublicacion;
		this.titulo = titulo;
		this.director = director;
		this.soporte = soporte;
		this.protagonista = protagonista;
		this.estilo = estilo;
		this.duracion = duracion;
	}
	/**
	 * @return the isan
	 */
	public String getIsan() {
		return isan;
	}
	/**
	 * @param isan the isan to set
	 */
	public void setIsan(String isan) {
		this.isan = isan;
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
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}
	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	/**
	 * @return the soporte
	 */
	public String getSoporte() {
		return soporte;
	}
	/**
	 * @param soporte the soporte to set
	 */
	public void setSoporte(String soporte) {
		this.soporte = soporte;
	}
	/**
	 * @return the protagonista
	 */
	public String getProtagonista() {
		return protagonista;
	}
	/**
	 * @param protagonista the protagonista to set
	 */
	public void setProtagonista(String protagonista) {
		this.protagonista = protagonista;
	}
	/**
	 * @return the estilo
	 */
	public String getEstilo() {
		return estilo;
	}
	/**
	 * @param estilo the estilo to set
	 */
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	/**
	 * @return the duracion
	 */
	public String getDuracion() {
		return duracion;
	}
	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	/*
	 * 
	 */
	@Override
	public String toString(){
		return  "Titulo: " + titulo + "\n" + "Director: " + director + "\n" + "Año de publicacion: " + anoPublicacion + "\n" 
											+ "Duracion: " + duracion + "\n" + "Estilo: " + estilo + "\n" + "Protagonista: " + protagonista + "\n" + "Soporte: " + soporte
												+ "ISAN :" + isan;
		
	}


}
