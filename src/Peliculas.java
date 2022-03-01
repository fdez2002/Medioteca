
public class Peliculas extends Medios {
	/*
	 * Atributos
	 * 
	 */
	protected int isan;
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
	public Peliculas(int isan, int anoPublicacion, String titulo, String director, String soporte, String protagonista, String estilo, String duracion,
			int numRegistro, int fechaAdquisiscion, float precioCompra) {
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


}
