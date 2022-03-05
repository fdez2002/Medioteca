
public class Discos extends Medios {
	/*
	 * Atributos
	 * 
	 */
	protected String ismn;
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
	public Discos(String ismn, int anoPublicacion, String titulo, String interprete, String estilo, String canciones, String soporte,
			int numRegistro, String fechaAdquisiscion, double precioCompra) {
				super(numRegistro, fechaAdquisiscion, precioCompra);

		this.ismn = ismn;
		this.anoPublicacion = anoPublicacion;
		this.titulo = titulo;
		this.interprete = interprete;
		this.estilo = estilo;
		this.canciones = canciones;
		this.soporte = soporte;
		
	}
	/**
	 * @return the ismn
	 */
	public String getIsmn() {
		return ismn;
	}
	/**
	 * @param ismn the ismn to set
	 */
	public void setIsmn(String ismn) {
		this.ismn = ismn;
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
	 * @return the interprete
	 */
	public String getInterprete() {
		return interprete;
	}
	/**
	 * @param interprete the interprete to set
	 */
	public void setInterprete(String interprete) {
		this.interprete = interprete;
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
	 * @return the canciones
	 */
	public String getCanciones() {
		return canciones;
	}
	/**
	 * @param canciones the canciones to set
	 */
	public void setCanciones(String canciones) {
		this.canciones = canciones;
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
	@Override
	public String toString(){
		return "Titulo: " + titulo + "\n" + "Interprete: " + interprete + "Estilo: " + estilo + "\n" + "Año de publicacion: " + anoPublicacion + "\n" 
											+ "Cnciones: " + canciones + "\n" + "Soporte: " + soporte + "\n" + "ISMN: " + ismn;
		
	}
	

}
