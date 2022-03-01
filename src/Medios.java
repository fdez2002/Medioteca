
public abstract class Medios {
	
	/*
	 * Atributos
	 */
	protected int numRegistro;
	protected int fechaAdquisicion;
	protected float precioCompra;
	
	/*
	 * Constructor sin parametros
	 */
	
	public Medios() {}
	
	/*
	 * Constructor con parámetros
	 * 
	 */
	public Medios (int numRegistro, int fechaAdquisicion, float precioCompra) {
		this.numRegistro = numRegistro;
		this.fechaAdquisicion = fechaAdquisicion;
		this.precioCompra = precioCompra;
	}
	/*
	 * Metodos
	 * 
	 */
	public void añadirMedios() {
		
	}
	public void modificarDatosMedios() {
		
	}
	public void borrarMedios() {
		
	}
	public void imprimirFichaMedio() {
		
	}
	public void prestarMediosUsuario() {
		
	}

}
