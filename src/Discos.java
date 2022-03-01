
public class Discos extends Medios {
	/*
	 * Atributos
	 * 
	 */
	protected int ismn;
	protected int anoPublicacion;
	protected String titulo;
	protected String interprete;
	protected String estilo;
	protected String canciones;
	protected String soporte;
	
	/*
	 * Constructor sin parametros
	 * 
	 */
	public Discos(){
		
	}
	/*
	 * Constructor con parametros
	 * 
	 */
	public Discos(int ismn, int anoPublicacion, String titulo, String interprete, String estilo, String canciones, String soporte,
			int numRegistro, int fechaAdquisiscion, float precioCompra) {
				super(numRegistro, fechaAdquisiscion, precioCompra);

		this.ismn = ismn;
		this.anoPublicacion = anoPublicacion;
		this.titulo = titulo;
		this.interprete = interprete;
		this.estilo = estilo;
		this.canciones = canciones;
		this.soporte = soporte;
		
	}
	

}
